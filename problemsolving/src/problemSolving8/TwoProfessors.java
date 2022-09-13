package problemSolving8;

import java.util.Scanner;

public class TwoProfessors {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            event[] ob = new event[2 * n];
            int[] left = new int[n];
            int[] right = new int[n];
            for (int i = 0; i < n; i++) {
                ob[i] = new event();
                left[i] = scan.nextInt();
                right[i] = scan.nextInt();
            }
            if (left[0] > left[1]) {
                int tl = left[0];
                int tr = right[0];
                left[0] = left[1];
                right[0] = right[1];

                left[1] = tl;
                right[1] = tr;
            }
            
            int k = 0;
            for (int i = 0; i < 2 * n; i += 2) {
                ob[i] = new event(k + 1, left[k], +1);
                ob[i + 1] = new event(k + 1, right[k], -1);
                ++k;
            }
            sort(ob, 0, 2 * n - 1);
            int count = 0;
            int sum = 0;
            int res = 0;
            boolean isOne = false;
            for (int i = 0; i < 2 * n; i++) {
                sum += ob[i].val;

                if (ob[i].id == 1) {
                    if (ob[i].val == 1) {
                        isOne = true;
                    } else {
                        isOne = false;
                    }
                }
                if (ob[i].id == 2) {
                    if (isOne && ob[i].val == 1) {
                        res = Math.max(res, i);
                    } else if (ob[i].val == 1) {
                        if (res <= sum) {
                            //     System.out.println(res + " " + sum + " ");
                            res = Math.max(res + 1, sum);
                        } else {
                            res = Math.max(res, i);
                        }
                    }

                }
                res = Math.max(sum, res);

            }
            System.out.println(res);

        }
    }

    static void merge(event arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        event L[] = new event[n1];
        event R[] = new event[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].pos < R[j].pos) {
                arr[k] = L[i];
                i++;
            } else if (L[i].pos > R[j].pos) {
                arr[k] = R[j];
                j++;
            } else {
                if (L[i].val == -1) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(event arr[], int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}

class event {

    int id, pos, val;

    event(int id, int pos, int val) {
        this.id = id;
        this.pos = pos;
        this.val = val;
    }

    event() {

    }
}
