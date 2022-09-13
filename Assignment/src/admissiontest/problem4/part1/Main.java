package admissiontest.problem4.part1;

public class Main {

    public static void main(String[] args) {

        Thread hare = new Thread(new Animal("hare", 9, 220));
        Thread tortoise = new Thread(new Animal("tortoise", 7, 190));
        hare.setDaemon(false);
        tortoise.setDaemon(false);

        hare.start();
        tortoise.start();

    }
}
