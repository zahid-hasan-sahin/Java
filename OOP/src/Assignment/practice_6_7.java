package Assignment;

class Beer1 {

    String name;
    private double alcohol;

    Beer1() {
        name = "";
        alcohol = 0;
    }

    Beer1(String name, int alcohol) {
        this.name = name;
        setAlcohol(alcohol);
    }

    public double intoxicated(double weight) {
        double numDrinks;
        numDrinks = (0.08 + 0.015) * weight / (12 * 7.5 * alcohol);
        return numDrinks;
    }

    public void setAlcohol(double d) {
        if (d > 1) {
            d /= 100;
        }
        alcohol = d;
    }

}

class Tester9 {

    public static void main(String[] args) {
        Beer1 ob1 = new Beer1();
        ob1.setAlcohol(0.05);
        ob1.name = "A";
        System.out.println(ob1.intoxicated(50));

        Beer1 ob2 = new Beer1();
        ob2.setAlcohol(5);
        ob2.name = "B";
        System.out.println(ob2.intoxicated(50));
    }
}
