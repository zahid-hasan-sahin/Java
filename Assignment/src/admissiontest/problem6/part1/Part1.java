package admissiontest.problem6.part1;

public class Part1 {

    static <T> int indexOfValue(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40};
        Double[] doubleArray = {40.20, 50.10, 10.6, 100.5};
        String[] stringArray = {"A", "B", "C", "D", "E"};
        System.out.println(indexOfValue(intArray, 30));
        System.out.println(indexOfValue(doubleArray, 50.10));
        System.out.println(indexOfValue(stringArray, "E"));
    }
}
