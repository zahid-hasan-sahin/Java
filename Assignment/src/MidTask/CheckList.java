package MidTask;

import java.util.Scanner;

public class CheckList {

    static boolean CompareTo(List a, List b) {
        for (int i = 0; i < 5; i++) {
            if (a.Data[i] != b.Data[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        List[] ob = new List[n];
        for (int i = 0; i < n; i++) {
            ob[i] = new List(5);
            for (int j = 0; j < 5; j++) {
                ob[i].push(j);
            }
        }

        System.out.println(CompareTo(ob[0], ob[3]));
    }
}
