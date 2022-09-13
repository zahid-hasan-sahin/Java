
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class P1Tester {

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("P1Tester");
    }

    int[] dataMirrorNumber = {7, 10, 1450, 34, 11711};
    int[] resMirrorNumber = {7, 1, 541, 43, 11711};

    void checkMirrorNumber(int a) {
        int input = dataMirrorNumber[a];
        int result = resMirrorNumber[a];
        String errMsg = String.format("mirrorNumber(%d) incorrect", input);
        assertEquals(errMsg, result, A.mirrorNumber(input));
    }

    @Test(timeout = 1000)
    public void mirrorNumber_00() {
        checkMirrorNumber(0);
    }

    @Test(timeout = 1000)
    public void mirrorNumber_01() {
        checkMirrorNumber(1);
    }

    @Test(timeout = 1000)
    public void mirrorNumber_02() {
        checkMirrorNumber(2);
    }

    @Test(timeout = 1000)
    public void mirrorNumber_03() {
        checkMirrorNumber(3);
    }

    @Test(timeout = 1000)
    public void mirrorNumber_04() {
        checkMirrorNumber(4);
    }

    int[] dataStripOdds = {1, 2, 34, 556550, 77};
    int[] resStripOdds = {0, 2, 4, 60, 0};

    void checkStripOdds(int a) {
        int input = dataStripOdds[a];
        int result = resStripOdds[a];
        String errMsg = String.format("stripOdds(%d) incorrect", input);
        assertEquals(errMsg, result, A.stripOdds(input));
    }

    @Test(timeout = 1000)
    public void stripOdds_00() {
        checkStripOdds(0);
    }

    @Test(timeout = 1000)
    public void stripOdds_01() {
        checkStripOdds(1);
    }

    @Test(timeout = 1000)
    public void stripOdds_02() {
        checkStripOdds(2);
    }

    @Test(timeout = 1000)
    public void stripOdds_03() {
        checkStripOdds(3);
    }

    @Test(timeout = 1000)
    public void stripOdds_04() {
        checkStripOdds(4);
    }

    long[] dataHiddenPrime = {2, 32, 0, 77, 890, 9669};
    boolean[] resHiddenPrime = {false, true, false, true, true, false};

    void checkHasHiddenPrime(int a) {
        long input = dataHiddenPrime[a];
        boolean result = resHiddenPrime[a];
        String errMsg = String.format("hasHiddenPrime(%d) incorrect", input);
        assertEquals(errMsg, result, A.hasHiddenPrime(input));
    }

    @Test(timeout = 1000)
    public void hasHiddenPrime_00() {
        checkHasHiddenPrime(0);
    }

    @Test(timeout = 1000)
    public void hasHiddenPrime_01() {
        checkHasHiddenPrime(1);
    }

    @Test(timeout = 1000)
    public void hasHiddenPrime_02() {
        checkHasHiddenPrime(2);
    }

    @Test(timeout = 1000)
    public void hasHiddenPrime_03() {
        checkHasHiddenPrime(3);
    }

    @Test(timeout = 1000)
    public void hasHiddenPrime_04() {
        checkHasHiddenPrime(4);
    }

    @Test(timeout = 1000)
    public void hasHiddenPrime_05() {
        checkHasHiddenPrime(5);
    }

    int[][] dataCozyNumber = {{9, 9}, {9, 7}, {270, 70}, {107744, 74}, {7, 17}};
    boolean[] resCozyNumber = {true, false, true, true, false};

    void checkIsCozyNumber(int a) {
        int first = dataCozyNumber[a][0];
        int second = dataCozyNumber[a][1];
        boolean result = resCozyNumber[a];
        String errMsg = String.format("isCozyNumber(%d, %d) incorrect", first, second);
        assertEquals(errMsg, result, A.isCozyNumber(first, second));
    }

    @Test(timeout = 1000)
    public void isCozyNumber_00() {
        checkIsCozyNumber(0);
    }

    @Test(timeout = 1000)
    public void isCozyNumber_01() {
        checkIsCozyNumber(1);
    }

    @Test(timeout = 1000)
    public void isCozyNumber_02() {
        checkIsCozyNumber(2);
    }

    @Test(timeout = 1000)
    public void isCozyNumber_03() {
        checkIsCozyNumber(3);
    }

    @Test(timeout = 1000)
    public void isCozyNumber_04() {
        checkIsCozyNumber(4);
    }

    int[][] dataNumberJack = {{9, 9, 1}, {9, 8}, {1, 70, 10}, {1, 1, 1}, {7, 7, 10}};
    boolean[] resNumberJack = {true, false, false, false, false};

    void checkIsNumberJackWinner(int a) {
        int[] input = dataNumberJack[a];
        boolean result = resNumberJack[a];
        String errMsg = String.format("isNumberJackWinner(%s) incorrect", Arrays.toString(input));
        assertEquals(errMsg, result, A.isNumberJackWinner(input));
    }

    @Test(timeout = 1000)
    public void isNumberJackWinner_00() {
        checkIsNumberJackWinner(0);
    }

    @Test(timeout = 1000)
    public void isNumberJackWinner_01() {
        checkIsNumberJackWinner(1);
    }

    @Test(timeout = 1000)
    public void isNumberJackWinner_02() {
        checkIsNumberJackWinner(2);
    }

    @Test(timeout = 1000)
    public void isNumberJackWinner_03() {
        checkIsNumberJackWinner(3);
    }

    @Test(timeout = 1000)
    public void isNumberJackWinner_04() {
        checkIsNumberJackWinner(4);
    }

    int[][] dataArray2matrix = {
        {2, 1, 3},
        {5, 4, -8, 4, 3, 7, 64},
        {2, 2, 1, 2, 3, 4}
    };
    int[][][] resArray2matrix = {
        {{3}, {0}},
        {{-8, 4, 3, 7}, {64, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}},
        {{1, 2}, {3, 4}}
    };

    void checkArray2matrix(int a) {
        int[] input = dataArray2matrix[a];
        int[][] result = resArray2matrix[a];
        String errMsg = String.format("array2matrix(%s) incorrect", Arrays.toString(input));
        assertArrayEquals(errMsg, result, A.array2matrix(input));
    }

    @Test(timeout = 1000)
    public void array2matrix_00() {
        checkArray2matrix(0);
    }

    @Test(timeout = 1000)
    public void array2matrix_01() {
        checkArray2matrix(1);
    }

    @Test(timeout = 1000)
    public void array2matrix_02() {
        checkArray2matrix(2);
    }

    int[][][] dataShootBattleCraftMap = {
        {{0, 0, 0}, {0, 707, 0}, {0, 0, 0}},
        {{0, 0, 0}, {0, 707, 0}, {0, 0, 0}},
        {{0, 0, 0, 0, 101}, {0, 707, 0, 0, 0}, {64, 0, 0, 0, 0}}
    };

    int[][][] dataShootBattleCraftShotCoordinates = {
        {{0, 0}, {2, 2}, {1, 1}},
        {{0, 0}, {2, 2}, {1, 0}},
        {{0, 4}, {2, 2}, {2, 0}}
    };

    int[][][] resShootBattleCraft = {
        {{0, 0, 0}, {0, -1, 0}, {0, 0, 0}},
        {{0, 0, 0}, {0, 707, 0}, {0, 0, 0}},
        {{0, 0, 0, 0, -1}, {0, 707, 0, 0, 0}, {-1, 0, 0, 0, 0}}
    };

    void checkShootBattleCraft(int a) {
        int[][] first = dataShootBattleCraftMap[a];
        int[][] second = dataShootBattleCraftShotCoordinates[a];
        int[][] result = resShootBattleCraft[a];
        String errMsg = String.format("shootBattleCraft(%s, %s) incorrect", Arrays.deepToString(first), Arrays.deepToString(second));
        A.shootBattleCraft(first, second);
        assertArrayEquals(errMsg, result, first);
    }

    @Test(timeout = 1000)
    public void shootBattleCraft_00() {
        checkShootBattleCraft(0);
    }

    @Test(timeout = 1000)
    public void shootBattleCraft_01() {
        checkShootBattleCraft(1);
    }

    @Test(timeout = 1000)
    public void shootBattleCraft_02() {
        checkShootBattleCraft(2);
    }

}
