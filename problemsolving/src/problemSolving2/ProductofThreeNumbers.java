package problemSolving2;

import java.util.Scanner;

public class ProductofThreeNumbers {

    public static int findFirstDivisor(int n, int t) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && n / i != t && i != t && n != i && n / i != i) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (testCase-- > 0) {
            int n = scan.nextInt();
            int firstSmallestDivisor = 0;
            int firstBigestDivisor = 0;
            boolean ch = false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    firstSmallestDivisor = i;
                    firstBigestDivisor = n / i;
                    break;
                }
            }
            if (firstSmallestDivisor == 0) {
                sb.append("NO\n");
                continue;
            } else {
                int f = findFirstDivisor(firstSmallestDivisor, firstBigestDivisor);
                int l = findFirstDivisor(firstBigestDivisor, firstSmallestDivisor);
                if (f == 0 && l == 0) {
                    sb.append("NO\n");
                    continue;
                } else {
                    if (f > 0) {
                        if (f != firstBigestDivisor && firstSmallestDivisor / f > 1 && firstSmallestDivisor / f != firstBigestDivisor) {
                            sb.append("YES\n");
                            sb.append(f + " " + firstSmallestDivisor / f + " " + firstBigestDivisor + "\n");
                            continue;
                        }
                    }
                    if (l > 0 && !ch) {
                        if (l != firstSmallestDivisor && firstBigestDivisor / l > 1 && firstBigestDivisor / l != firstSmallestDivisor) {
                            sb.append("YES\n");
                            sb.append(l + " " + firstSmallestDivisor + " " + firstBigestDivisor / l + "\n");
                            continue;
                        }
                    }

                    sb.append("NO\n");

                }
            }
        }
        System.out.println(sb);

    }
}
