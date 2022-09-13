package ProblemSolving7;

import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Stack;

public class RestoringthePermutation {
    
    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = scan.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Integer[] vis = new Integer[n + 1];
            Integer q = 1;
            Integer[] min = new Integer[n + 1];
            Integer[] max = new Integer[n + 1];
            for (int i = 0; i < n + 1; i++) {
                vis[i] = 0;
                min[i] = 0;
                max[i] = 0;
            }
            int currMax = a[0];
            min[0] = a[0];
            vis[a[0]] = 1;
            for (int i = 1; i < n; i++) {
                if (currMax == a[i]) {
                    while (vis[q] != 0) {
                        ++q;
                    }
                    min[i] = q;
                    vis[q] = 1;
                } else {
                    currMax = a[i];
                    vis[a[i]] = 1;
                    min[i] = a[i];
                }
            }
            for (int i = 0; i < n + 1; i++) {
                vis[i] = 0;
            }
            max[0] = a[0];
            
            q = 1;
            currMax = a[0];
            Stack<Integer> st = new Stack<Integer>();
            for (int i = 1; i < a[0]; i++) {
                st.add(i);
            }
            for (int i = 1; i < n; i++) {
                if (currMax == a[i]) {
                    max[i] = st.pop();
                } else {
                    for (int j = currMax+1; j < a[i]; j++) {
                        st.add(j);
                    }
                    currMax = a[i];
                    max[i] = a[i];
                }
            }
            
            for (int i = 0; i < n; i++) {
                sb.append(min[i] + " ");
            }
            sb.append("\n");
            for (int i = 0; i < n; i++) {
                sb.append(max[i] + " ");
            }
            sb.append("\n");
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
