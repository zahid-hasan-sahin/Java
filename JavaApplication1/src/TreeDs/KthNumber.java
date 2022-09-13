package TreeDs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class KthNumber {
    
    static int low(ArrayList<Integer> ar, int val) {
        int l = 0;
        int r = ar.size() - 1;
        int ans = 0;
        while (l <= r) {
            
            int mid = (l + r) / 2;
            
            if (ar.get(mid) == val) {
                return mid;
            } else if (ar.get(mid) > val) {
                r = mid - 1;
            } else {
                ans = mid + 1;
                l = mid + 1;
            }
            
        }
        
        return ans;
    }
    
    static void buildSeg(ArrayList<Integer> tree[], int[] a, int index, int l, int r) {
        
        if (l == r) {
            
            tree[index].add(a[l]);
            return;
        }
        int mid = (l + r) / 2;
        buildSeg(tree, a, 2 * index + 1, l, mid);
        buildSeg(tree, a, 2 * index + 2, mid + 1, r);
        int i = 0;
        int j = 0;
        
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int lsize = tree[left].size();
        int rsize = tree[right].size();
        while (i < lsize && j < rsize) {
            if (tree[left].get(i) < tree[right].get(j)) {
                tree[index].add(tree[left].get(i));
                ++i;
            } else {
                tree[index].add(tree[right].get(j));
                ++j;
            }
            
        }
        while (i < lsize) {
            tree[index].add(tree[left].get(i));
            ++i;
        }
        while (j < rsize) {
            tree[index].add(tree[right].get(j));
            ++j;
        }
    }
    
    static int query(ArrayList<Integer> tree[], int[] a, int index, int ss, int se, int l, int r, int val) {
        
        if (se < l || ss > r) {
            return 0;
        }
        if (ss >= l && se <= r) {
            return low(tree[index], val);
        }
        int mid = (ss + se) / 2;
        int left = query(tree, a, index * 2 + 1, ss, mid, l, r, val);
        int right = query(tree, a, index * 2 + 2, mid + 1, se, l, r, val);
        return left + right;
        
    }
    
    public static void main(String args[]) throws IOException {
        
        Reader scan = new Reader();
        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            
        }
        StringBuilder sb = new StringBuilder();
        
        ArrayList<Integer> tree[] = new ArrayList[n * 4];
        for (int i = 0; i < n * 4; i++) {
            tree[i] = new ArrayList<Integer>();
        }
        
        buildSeg(tree, a, 0, 0, n - 1);
        Arrays.sort(a);
        while (q-- > 0) {
            int l = scan.nextInt() - 1;
            int r = scan.nextInt() - 1;
            int k = scan.nextInt() - 1;
            
            int res = 0;
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                int cal = query(tree, a, 0, 0, n - 1, l, r, a[mid]);
                
                if (cal <= k) {
                    left = mid + 1;
                    res = mid;
                } else {
                    right = mid - 1;
                }
            }
            sb.append(a[res] + "\n");
            
        }
        System.out.println(sb);
    }
}

class Reader {
    
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
    
    public Reader() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
    
    public Reader(String file_name) throws IOException {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
    
    public String readLine() throws IOException {
        byte[] buf = new byte[64]; // line length 
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') {
                break;
            }
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }
    
    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = read();
        }
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        
        if (neg) {
            return -ret;
        }
        return ret;
    }
    
    public long nextLong() throws IOException {
        long ret = 0;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = read();
        }
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (neg) {
            return -ret;
        }
        return ret;
    }
    
    public double nextDouble() throws IOException {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = read();
        }
        
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        
        if (c == '.') {
            while ((c = read()) >= '0' && c <= '9') {
                ret += (c - '0') / (div *= 10);
            }
        }
        
        if (neg) {
            return -ret;
        }
        return ret;
    }
    
    private void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) {
            buffer[0] = -1;
        }
    }
    
    private byte read() throws IOException {
        if (bufferPointer == bytesRead) {
            fillBuffer();
        }
        return buffer[bufferPointer++];
    }
    
    public void close() throws IOException {
        if (din == null) {
            return;
        }
        din.close();
    }
}
