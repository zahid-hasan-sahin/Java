package problemSolving8;

import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class CoinsandQueries {
    
    public static long log2(long N) {
        long result = (long) (Math.log(N) / Math.log(2));
        
        return result;
    }
    
    public static void main(String[] args) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        int d = scan.nextInt();
        long[] a = new long[32];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            long in = scan.nextInt();
            ++a[(int) log2(in)];
        }
        while (d-- > 0) {
            long in = scan.nextInt();
            int k = 31;
            int res = 0;
            while (k >= 0) {
                long r = (long) Math.pow(2, k);
                long need = in / r;
                long still = a[k];
                in -= r * Math.min(need, still);
                res += Math.min(need, still);
                --k;
            }
            
            if (in == 0) {
                sb.append(res + "\n");
            } else {
                sb.append("-1\n");
            }
            
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
