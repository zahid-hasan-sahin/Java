

import java.util.Scanner;

class Test {

    public static void main(String args[]) {
        HeartRates ob = new HeartRates("fName", "lName", 1, 1, 2000);
        System.out.println(ob.getAge());
        System.out.println(ob.getMaxHeartRate());
        System.out.println(ob.getTargetHeartRate());
    }
}

class HeartRates {

    String firstName;
    String lastName;
    int day;
    int year;
    int month;

    HeartRates(String fn, String ln, int d, int m, int y) {
        firstName = fn;
        lastName = ln;
        day = d;
        month = m;
        year = y;
    }

    void setFirstName(String s) {
        firstName = s;
    }

    String getFirstName() {
        return firstName;
    }

    void setLastName(String s) {
        lastName = s;
    }

    String getLastName() {
        return lastName;
    }

    void setDay(int in) {
        day = in;
    }

    int getDay() {
        return day;
    }

    void setMonth(int in) {
        month = in;
    }

    int getMonth() {
        return month;
    }

    void setYear(int in) {
        year = in;
    }

    int getYear() {
        return year;
    }

    int getAge() {
        return 2021 - year;
    }

    int getMaxHeartRate() {
        return 220 - getAge();
    }

    String getTargetHeartRate() {
        String s1 = String.valueOf(getMaxHeartRate() * 0.5);
        String s2 = String.valueOf(getMaxHeartRate() * 0.85);
        return s1 + " to " + s2;
    }
}
