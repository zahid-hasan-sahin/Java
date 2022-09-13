package Assignment;

class Beer {

    String name;
    double alcohol;

    public double intoxicated(double weight) {
        double numDrinks;
        numDrinks = (0.08 + 0.015) * weight / (12 * 7.5 * alcohol);
        return numDrinks;
    }
}

class Tester3 {

    public static void main(String[] args) {
        Beer ob1 = new Beer();
        ob1.alcohol = 0.05;
        ob1.name = "A";
        System.out.println(ob1.intoxicated(50));

        Beer ob2 = new Beer();
        ob2.alcohol = 0.02;
        ob2.name = "B";
        System.out.println(ob2.intoxicated(100));
    }
}
