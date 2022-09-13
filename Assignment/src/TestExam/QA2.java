package TestExam;

/*
 * 
 * This program determines if all the numbers in a 2D array of integers are distinct (i.e. occur only once)
 * Uses the method matchExists()  
 */
public class QA2 {

    /**
     * Searches a 2D array to determine if the value at [row, col] has a match
     *
     * @param values two-dimensional array to be searched
     * @param row the row number for the value to be matched
     * @param col the column number for the value to be matched
     * @return true if the target value has a match in a different location than
     * [row,col]
     */
    public static boolean matchExists(int[][] values, int row, int col) {
        //-----------Start below here. To do: approximate lines of code = 8
        // Hint: use a nested loop. Check to ensure you are not matching the number at [row][col] to
        // itself 
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (i != row && j != col && values[i][j] == values[row][col]) {
                    return true;
                }
            }
        }
        return false;
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    /**
     * Determines if all values in a two-dimensional array are distinct
     *
     * @param values two-dimensional array to be examined
     * @return true if all values are distinct, false otherwise
     */
    public static boolean distinctValues(int[][] values) {
        boolean distinct = true;

        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                if (matchExists(values, row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] array1 = {{0, 4, 5}, {2, 3, 9}, {1, 6, 7}, {8, 10, 20}};
        int[][] array2 = {{0, 4, 5}, {2, 3, 9}, {1, 6, 3}, {8, 10, 20}};

        if (distinctValues(array1)) {
            System.out.println("All values in array1 are distinct");
        } else {
            System.out.println("Not all values in array1 are distinct");
        }
        System.out.println("Expected:\nAll values in array1 are distinct");

        if (distinctValues(array2)) {
            System.out.println("All values in array2 are distinct");
        } else {
            System.out.println("Not all values in array2 are distinct");
        }
        System.out.println("Expected:\nNot all values in array2 are distinct");
    }
}
