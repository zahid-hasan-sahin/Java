package CSE;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Vehicle ob1 = new Vehicle("B", 30, 50);
        Vehicle ob2 = new Vehicle("A", 40, 70);
        Vehicle ob3 = new Vehicle("K", 20, 66);
        Vehicle ob4 = new Vehicle("E", 25, 75);
        Vehicle ob5 = new Vehicle("W", 20, 30);
        Vehicle[] arr = new Vehicle[5];
        arr[0] = ob1;
        arr[1] = ob2;
        arr[2] = ob3;
        arr[3] = ob4;
        arr[4] = ob5;
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].toString());
        }

    }
}
