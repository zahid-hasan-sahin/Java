package task;

// Java program for activity selection problem
// when input activities may not be sorted.
import java.io.*;
import java.util.*;

// A job has a start time, finish time and profit.
class Activity {

    int start, finish;

    // Constructor
    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

class Compare {

    static void compare(Activity arr[], int n) {
        Arrays.sort(arr, new Comparator<Activity>() {
            @Override
            public int compare(Activity s1, Activity s2) {
                return s1.finish - s2.finish;
            }
        });
    }
}

class GFG {

    static void printMaxActivities(Activity arr[], int n) {
        Compare obj = new Compare();
        obj.compare(arr, n);
        System.out.println(
                "Following activities are selected :");

        int i = 0;
        System.out.print("(" + arr[i].start + ", " + arr[i].finish + "), ");

        for (int j = 1; j < n; j++) {
            if (arr[j].start >= arr[i].finish) {
                System.out.print("(" + arr[j].start + ", "
                        + arr[j].finish + "), ");
                i = j;
            }
        }
    }

    public static void main(String[] args) {

        int n = 4;
        Activity arr[] = new Activity[n];
        arr[0] = new Activity(1, 4);
        //   arr[1] = new Activity(2, 5);
        arr[1] = new Activity(3, 5);
        arr[2] = new Activity(3, 5);
        arr[3] = new Activity(3, 9);
        //    arr[5] = new Activity(1, 2);

        printMaxActivities(arr, n);
    }
}
