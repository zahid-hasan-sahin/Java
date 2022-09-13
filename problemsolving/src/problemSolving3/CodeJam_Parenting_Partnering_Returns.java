package problemSolving3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CodeJam_Parenting_Partnering_Returns {
class work {

        int start, end, index;
        char d;
    }

    public class myCom implements Comparator<work> {

        @Override
        public int compare(work ob1, work ob2) {
            return ob1.end >= ob2.end ? 1 : -1;
        }

    }

    public class res implements Comparator<work> {

        @Override
        public int compare(work ob1, work ob2) {
            return ob1.index > ob2.index ? 1 : -1;
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        float q = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        int p = 0;
        while (q-- > 0) {
            ++p;
            int n = scan.nextInt();
            CodeJam_Parenting_Partnering_Returns cm = new CodeJam_Parenting_Partnering_Returns();
            CodeJam_Parenting_Partnering_Returns.work ob[] = new CodeJam_Parenting_Partnering_Returns.work[n];
            for (int i = 0; i < n; i++) {
                ob[i] = cm.new work();
                ob[i].index = i;
                ob[i].start = scan.nextInt();
                ob[i].end = scan.nextInt();
            }

            Arrays.sort(ob, cm.new myCom());
            int cf = 0, jf = 0;
            boolean ch = false;
            for (int i = 0; i < n; i++) {
                if (ob[i].start >= cf || ob[i].start >= jf) {
                    if (ob[i].start >= cf) {
                        cf = ob[i].end;
                        ob[i].d = 'C';
                    } else if (ob[i].start >= jf) {
                        System.out.println(i+" "+ob[i].end);
                        jf = ob[i].end;
                        ob[i].d = 'J';
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                   //     System.out.println(+ob[j].index+" "+ob[j].d);
                    }
                    System.out.println(jf);
                    System.out.println(cf);
              //      System.out.println(i);
                    ch = true;
                    break;
                }

            }
            if (ch) {
                sb.append("Case #" + p + ": IMPOSSIBLE");
            } else {
                sb.append("Case #" + p + ": ");
                Arrays.sort(ob, cm.new res());
                for (int i = 0; i < n; i++) {
                    sb.append(ob[i].d);
                }
            }
            if (q != 0) {
                sb.append("\n");
            }

        }
        System.out.println(sb);

    }

}