package test;

class thread implements Runnable {

    public void run() {
        try {
            System.out.println(Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread ob = new Thread(new thread());
            ob.start();
        }
    }
}
