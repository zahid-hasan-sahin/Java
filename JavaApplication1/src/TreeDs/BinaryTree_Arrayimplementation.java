package TreeDs;

public class BinaryTree_Arrayimplementation {

    public class makeTree {

        String root;
        String st[] = new String[10];

        void setRoot(String s) {
            st[0] = s;
        }

        void setLeft(String s, int p) {
            if (st[p] == null) {
                System.out.println("No parests");
            } else {
                int pos = (2 * p) + 1;
                st[pos] = s;
            }
        }

        void setRight(String s, int p) {
            if (st[p] == null) {
                System.out.println("No parenns");
            } else {
                int pos = (2 * p) + 2;
                st[pos] = s;
            }
        }

        void printTree() {
            for (int i = 0; i < 10; i++) {
                if (st[i] != null) {
                    System.out.print(st[i]);
                } else {
                    System.out.print("-");
                }
            }

        }
    }

    public static void main(String args[]) {
        BinaryTree_Arrayimplementation ob = new BinaryTree_Arrayimplementation();
        makeTree obj = ob.new makeTree();
        obj.setRoot("A");
         obj.setLeft("B", 0); 
        obj.setRight("C", 0);
        obj.setLeft("D", 1);
        obj.setRight("E", 1);
        obj.setLeft("F", 2);
        obj.printTree();
    }

}
