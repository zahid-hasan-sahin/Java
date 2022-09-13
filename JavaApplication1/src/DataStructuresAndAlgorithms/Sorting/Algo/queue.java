package DataStructuresAndAlgorithms.Sorting.Algo;

public class queue {

    int head = 0;
    int tail = 0;

    private void enQueue(int[] arra, int n, int k) {
        
        tail = tail % (n - 1);
        arra[tail] = k;
        ++tail;

    }

    private int deQueue(int[] arra, int n) {
        int r = 0;
        if(n==0){
            
            System.out.println("Queue is Empty !");
            return 0;
        }else{
        head = head % (n - 1);
        r = arra[head];
        ++head;

        
    }
        return r;
    }
    public static void main(String args[]) {
        int[] arra = new int[5];
        queue ob = new queue();
        ob.enQueue(arra, 5, 6);
        ob.enQueue(arra, 5, 8);
        ob.enQueue(arra, 5, 9);
        ob.enQueue(arra, 5, 12);
        ob.enQueue(arra, 5, 6);
        ob.enQueue(arra, 5, 8);
        ob.enQueue(arra, 5, 9);
        ob.enQueue(arra, 5, 2);
        ob.enQueue(arra, 5, 45);
        System.out.println(ob.deQueue(arra, 5));
        System.out.println(ob.deQueue(arra, 5));
        System.out.println(ob.deQueue(arra, 5));
        System.out.println(ob.deQueue(arra, 5));
        System.out.println(ob.deQueue(arra, 5));
        System.out.println(ob.deQueue(arra, 5));
        
    }

}
