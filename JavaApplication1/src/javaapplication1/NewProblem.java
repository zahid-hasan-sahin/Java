package javaapplication1;

import java.util.LinkedList;
import java.util.Scanner;

public class NewProblem {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> name = new LinkedList<>();
        LinkedList<String> q = new LinkedList<>();

        String[] g = {};
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            name.add(scan.next());
        }
        q = (LinkedList) name.clone();
        int c = 0;
        for (int i = 0; i < name.size(); i++) {
            for (int j = i + 1; j < name.size(); j++) {
                if (name.get(i).equalsIgnoreCase(name.get(j))) {
                    name.set(j, name.get(j) + i+(int)1);

                } else {
                    c++;

                }
            }
            if (c >= 0) {

            }
            c = 0;
        }
        for (int i = 0; i < q.size(); i++) {
            if(q.get(i).equalsIgnoreCase(name.get(i))){
                System.out.println("Ok");
            } else{
                System.out.println(name.get(i));
            }           
        }
    }

}
