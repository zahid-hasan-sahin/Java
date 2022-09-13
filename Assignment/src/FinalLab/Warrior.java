package FinalLab;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Warrior extends Creature implements Saveable {

    private int dexterity;
    private int agility;

    public Warrior(String name, int health, int power, int dexterity, int agility) {

        super(name, health, power);
        this.dexterity = dexterity;
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    void attack(Creature creature) {
        Random ran = new Random();
        int random = ran.nextInt(4) + 1;
        int dec = (random * agility + 3 * dexterity + this.getPower());
        creature.setHealth(creature.getHealth() - dec);
    }

    @Override
    public void saveToFile(String filePath) {
        try {
            FileWriter fw = new FileWriter(filePath, false);
            PrintWriter printWriter = new PrintWriter(fw);
            printWriter.println(toString());
            printWriter.close();

        } catch (IOException ex) {
            System.out.println("IO Error");
        }
    }

    @Override
    public String toString() {
        return "Warrior{name=" + this.getName() + ", health=" + this.getHealth() + ", power=" + this.getPower() + "dexterity=" + dexterity + ", agility=" + agility + '}';
    }

}
