package FinalLab;

public class Main {
    
    public static void main(String[] args) {
        Mage mage = new Mage("mage", 100, 5, 10, 15);
        Warrior warrior = new Warrior("warrior", 150, 3, 12, 18);
        mage.attack(warrior);
        warrior.attack(mage);
        mage.saveToFile("Mage.txt");
        warrior.saveToFile("Warrior.txt");
        
    }
}
