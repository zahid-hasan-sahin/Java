package problemsolving;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CompetitiveProgrammer {

    public static void main(String args[]) {
        Random rgen = new Random();
        int[] cards = new int[52];

        for (int i = 0; i < cards.length; i++) {
            cards[i] = 45;
        }

        for (int i = 0; i < cards.length; i++) {
            int randomPosition = rgen.nextInt(cards.length);
            int temp = cards[i];
            cards[i] = cards[randomPosition];
            cards[randomPosition] = temp;
        }
    }

}
