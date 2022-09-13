
import java.util.LinkedList;
import java.util.Scanner;

class fileReader {

    static void remove_multiple_of_five(LinkedList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 5 == 0) {
                a.remove(i);
                --i;
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How Many Number: ");
        int n = scan.nextInt();
        LinkedList<Integer> a = new LinkedList<Integer>();
        System.out.println("Let's Input number:");
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }
        remove_multiple_of_five(a);
        if(a.size()==0){
            System.out.println("Null");
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        
        System.out.println();
    }
}
