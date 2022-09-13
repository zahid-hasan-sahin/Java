package Assignment;

import java.util.Scanner;

class Characteristic {

    private String description;
    private int rating;

    Characteristic(String description) {
        this.description = description;
        rating = 0;
    }

    boolean isValid(int rating) {
        if (rating >= 0 && rating <= 10) {
            return true;
        }
        return false;
    }

    void setRating(int rating) {
        if (isValid(rating)) {
            this.rating = rating;
        }
    }

    void setRating() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the rating:");
        int rat = scan.nextInt();
        if (isValid(rat)) {
            rating = rat;
        }
    }

    String getDescription() {
        return description;
    }

    int getRating() {
        return rating;
    }

    public double getCompatability(Characteristic otherRating) {
        if (isMatch(otherRating)) {
            return getCompatibilityMeasure(otherRating);
        }
        return 0;
    }

    private double getCompatibilityMeasure(Characteristic otherRating) {
        int a = this.rating;
        int b = otherRating.rating;
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.pow(a - b, 2);
    }

    boolean isMatch(Characteristic otherRating) {
        return this.description.equalsIgnoreCase(otherRating.description);
    }
}

class Tester11 {

    public static void main(String[] args) {
        Characteristic ob1 = new Characteristic("A");
        ob1.setRating(10);

        Characteristic ob2 = new Characteristic("A");
        ob2.setRating(5);
        System.out.println(ob1.getCompatability(ob2));

        Characteristic ob3 = new Characteristic("B");
        ob3.setRating();
        System.out.println(ob2.getCompatability(ob3));

    }
}
