package FinalLab;

public abstract class Creature {

    private String name;
    private int health;
    private int power;

    public Creature(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    abstract void attack(Creature creature);

    @Override
    public String toString() {
        return "Creature{" + "name=" + name + ", health=" + health + ", power=" + power + '}';
    }

}
