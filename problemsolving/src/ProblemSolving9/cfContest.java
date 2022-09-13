package ProblemSolving9;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class cfContest {

    public static void main(String[] args) throws IOException {
        Reader5 scan = new Reader5();
        StringBuilder sb = new StringBuilder();

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            int[] min = new int[n];
            int[] max = new int[n];
            for (int i = 0; i < n; i++) {
                int l = 0;
                int r = n - 1;
                int k = 0;
                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (b[mid] == a[i]) {
                        k = mid;
                        break;
                    } else if (b[mid] < a[i]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                        k = mid;
                    }
                }

                min[i] = b[k] - a[i];
            }

         
            for (int i = n - 1; i >= 0; i--) {
                int l = 0;
                int r = n - 1;
                int k = 0;
                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (a[mid] == b[i]) {
                        k = mid;
                        break;
                    } else if (a[mid] > b[i]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                        k = mid;
                    }
                }

                max[i] = b[k] - a[i];
            }

            for (int i = 0; i < n; i++) {
                //  sb.append(min[i] + " ");
                System.out.print(min[i] + " ");
            }
            //sb.append("\n");
            System.out.println();
            for (int i = 0; i < n; i++) {
                // sb.append(max[i] + " ");
                System.out.print(max[i] + " ");
            }
            // sb.append("\n");
            System.out.println();
        }
        System.out.println(sb);
    }
}

/*
1
4
10 20 30 31
30 32 37 40
 */
class Reader5 {

    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader5() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public Reader5(String file_name) throws IOException {
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
