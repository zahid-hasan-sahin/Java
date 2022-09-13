package problemSolving8;

import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

public class NewYearsProblem {

    static boolean check(Integer[][] a, int n, int m, int k) {
        boolean ch = false;
        for (int i = 0; i < n; i++) {
            int c = 0;
           
            for (int j = 0; j < m; j++) {
                if(a[i][j]>=k){
                    ++c;
                }
            }
            if(c>=2){
               ch = true;
               break;
            }
        }
        
        if(ch){
            int c = 0;
                k:  for (int j = 0; j < m; j++) {
                    for (int l = 0; l < n; l++) {
                        if(a[l][j]>=k){
                            ++c;
                            if(c>=m){
                                return true;
                            }
                           continue k;
                        }
                    }
                }
                return c>= m;
        }
        return false;

    }
 
    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            Integer[][] a = new Integer[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            int l = 0;
            int r = 1000000001;
            int res = 0;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (check(a, n, m, mid)) {
                    l = mid + 1;
                    res = Math.max(res, mid);
                } else {
                    r = mid - 1;
                }
            }
            sb.append(res+"\n");
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
        din = new DataInputStream(
                new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    Reader(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String readLine() throws IOException {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') {
                if (cnt != 0) {
                    break;
                } else {
                    continue;
                }
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
        bytesRead = din.read(buffer, bufferPointer = 0,
                BUFFER_SIZE);
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
