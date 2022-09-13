package test;



public class Queue {

    String[] q = new String[100000];
    int last = 0;

    void enqueue(String s) {
        q[last++] = s;
    }

    void dequeue() {
        String s = q[--last];
        String c = s.toLowerCase();

        if (c.charAt(0) == 'a' || c.charAt(0) == 'e' || c.charAt(0) == 'i' || c.charAt(0) == 'o' || c.charAt(0) == 'u') {
            System.out.println(s);
        }
    }
}
