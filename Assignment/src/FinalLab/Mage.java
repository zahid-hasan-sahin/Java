package FinalLab;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Mage extends Creature implements Saveable {

    private int intelligence;
    private int mana;

    public Mage(String name, int health, int power, int intelligence, int mana) {
        super(name, health, power);
        this.intelligence = intelligence;
        this.mana = mana;
    }

    @Override
    void attack(Creature creature) {
        Random ran = new Random();
        int random = ran.nextInt(4) + 1;
        if (mana >= 50) {
            int dec = random * (7 * intelligence);
            creature.setHealth(creature.getHealth() - dec);
        } else {
            int dec = random * (10 * intelligence);
            creature.setHealth(creature.getHealth() - dec);
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mage{name=" + this.getName() + ", health=" + this.getHealth() + ", power=" + this.getPower() + "intelligence=" + intelligence + ", mana=" + mana + '}';
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

}
