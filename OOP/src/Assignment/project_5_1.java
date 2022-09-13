package Assignment;

import java.util.Scanner;

class studentRecord {

    private double quiz1, quiz2, midterm, final_mark, total;
    private char grade;

    public void readInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter point for quiz1:");
        quiz1 = scan.nextDouble();
        System.out.print("Enter point for quiz2:");
        quiz2 = scan.nextDouble();
        System.out.print("Enter point for midterm:");
        midterm = scan.nextDouble();
        System.out.print("Enter point for final:");
        final_mark = scan.nextDouble();

    }

    void calculate() {
        Total();
        Grade();
    }

    void Total() {

        double q1 = (100 * (quiz1 / 10)) * (25.0 / 100);
        double q2 = (100 * (quiz2 / 10)) * (25.0 / 100);
        double q = (q1 + q2) / 2;
        double m = midterm * (25.0 / 100);
        double f = final_mark * (50.0 / 100);
        total = q + m + f;

    }

    void Grade() {
        if (total >= 90) {
            grade = 'A';
        } else if (total >= 80) {
            grade = 'B';
        } else if (total >= 70) {
            grade = 'C';
        } else if (total >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void show() {
        System.out.println("mark of quiz1:" + getQuiz1());
        System.out.println("mark of quiz2:" + getQuiz2());
        System.out.println("mark of midterm:" + getMidterm());
        System.out.println("mark of final:" + getFinal_mark());
        System.out.println("Total:" + getTotal());
        System.out.println("Grade:" + getGrade());
    }

    public double getQuiz1() {
        return quiz1;
    }

    public double getQuiz2() {
        return quiz2;
    }

    public double getMidterm() {
        return midterm;
    }

    public double getFinal_mark() {
        return final_mark;
    }

    public double getTotal() {
        return total;
    }

    public char getGrade() {
        return grade;
    }

    public void setQuiz1(double quiz1) {
        this.quiz1 = quiz1;
    }

    public void setQuiz2(double quiz2) {
        this.quiz2 = quiz2;
    }

    public void setMidterm(double midterm) {
        this.midterm = midterm;
    }

    public void setFinal_mark(double final_mark) {
        this.final_mark = final_mark;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

}

class Tester4 {

    public static void main(String[] args) {

        studentRecord ob = new studentRecord();
        ob.readInput();
        ob.calculate();
        ob.show();

    }
}
