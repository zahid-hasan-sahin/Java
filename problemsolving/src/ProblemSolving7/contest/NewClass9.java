package ProblemSolving7;

import java.util.Arrays;
import java.util.Scanner;

import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class NewClass9 {
    
    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            long s = 0;
            for (int i = 0; i < n + 2; i++) {
                a.add(scan.nextInt());
                s += a.get(i);
            }
            Collections.sort(a);
            
            long sum = 0;
            for (int i = 0; i < n + 2; i++) {
                sum = s - a.get(i);
                if (sum - a.get(n) == a.get(n) && i != n) {
                    for (int j = 0; j < n + 2; j++) {
                        if (j == i || j == n) {
                            continue;
                        }
                        sb.append(a.get(j) + " ");
                    }
                    sb.append("\n");
                    continue k;
                }
                if (sum - a.get(n + 1) == a.get(n + 1) && i != n + 1) {
                    for (int j = 0; j < n + 2; j++) {
                        if (j == i || j == n + 1) {
                            continue;
                        }
                        sb.append(a.get(j) + " ");
                    }
                    sb.append("\n");
                    continue k;
                }
                
            }
            sb.append("-1\n");
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
