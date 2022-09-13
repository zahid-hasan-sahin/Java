package Quiz2;

public class Tester {

    public static void main(String[] args) {
        Edible[] arr = new Edible[4];
        Chicken ch1 = new Chicken("name1", 5, 'M', "A");
        Chicken ch2 = new Chicken("name2", 3, 'F', "B");

        Apple ap1 = new Apple("Red");
        Apple ap2 = new Apple("Green");
        arr[0] = ch1;
        arr[1] = ch2;
        arr[2] = ap1;
        arr[3] = ap2;
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i].howToEat());
        }
    }
}
