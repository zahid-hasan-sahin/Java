package admissiontest.problem4.part2;

public class Main {

    public static void main(String[] args) {
        Food food = new Food();
        Thread hare = new Thread(new Animal("hare", 9, 220, food));
        Thread tortoise = new Thread(new Animal("tortoise", 7, 190, food));
        hare.setDaemon(false);
        tortoise.setDaemon(false);

        hare.start();
        tortoise.start();

    }
}
