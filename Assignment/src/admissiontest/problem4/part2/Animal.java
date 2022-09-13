package admissiontest.problem4.part2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Animal implements Runnable {

    private String name;
    private int position;
    private int speed;
    private int restMax;
    public static boolean winner = false;
    private Food food;

    Animal(String name, int speed, int restMax, Food food) {
        this.name = name;
        this.speed = speed;
        this.restMax = restMax;
        position = 0;
        this.food = food;
    }

    @Override
    public void run() {
        while (!winner) {
            position += speed;
            System.out.println(name + " is running,"
                    + "current Position is " + position);
            if (position >= 120) {
                winner = true;
                System.out.println("Winner is: " + name);
                return;
            }
            Random r = new Random();
            int random = r.nextInt(restMax);
            try {
                food.eat(random, name);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRestMax() {
        return restMax;
    }

    public void setRestMax(int restMax) {
        this.restMax = restMax;
    }

    public static boolean isWinner() {
        return winner;
    }

    public static void setWinner(boolean winner) {
        Animal.winner = winner;
    }

}
