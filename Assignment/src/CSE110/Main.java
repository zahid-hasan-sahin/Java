package CSE110;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<ATMCard> card = new ArrayList<ATMCard>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DebitCard debit1 = new DebitCard(1, 101, 1000, 20000);
        DebitCard debit2 = new DebitCard(2, 102, 2000, 50000);
        CreditCard credit1 = new CreditCard(3, 103, 4000.0, 1001, 100, 1000);
        CreditCard credit2 = new CreditCard(4, 104, 5000.0, 1002, 200, 1500);
        credit1.setSalary(60000);
        credit2.setSalary(50000);
        credit1.setExpense(6000);
        credit2.setExpense(5000);

        Bonus b1 = new Bonus("Eid", 10000);
        Bonus b2 = new Bonus("Yearly", 30000);
        Bonus b3 = new Bonus("Spring", 10000);
        credit1.addBonus(b1);
        credit1.addBonus(b2);
        credit2.addBonus(b3);

        card.add(debit1);
        card.add(debit2);
        card.add(credit1);
        card.add(credit2);

        for (int i = 0; i < card.size(); i++) {
            if (card.get(i) instanceof CreditCard) {
                CreditCard temp = (CreditCard) card.get(i);
                if (temp.getSalary() > 60000) {
                    temp.setLimit(temp.getLimit() + 100);
                }
            }
        }
        searchcardinfo(5);
        searchcardinfo(2);
        System.out.println(compare(credit1, credit2));

        while (true) {
            System.out.println("Press 1 for debit card\n"
                    + "Press 2 for credit card\n"
                    + "Press 3 for exit");
            int in = scan.nextInt();
            if (in == 1) {
                for (int i = 0; i < card.size(); i++) {
                    if (card.get(i) instanceof DebitCard) {
                        System.out.println(card.get(i).toString());
                    }
                }
            } else if (in == 2) {
                for (int i = 0; i < card.size(); i++) {
                    if (card.get(i) instanceof CreditCard) {
                        System.out.println(card.get(i).toString());
                    }
                }
            } else {
                break;
            }
        }
    }

    static void searchcardinfo(int cardnum) {
        for (int i = 0; i < card.size(); i++) {
            if (card.get(i).getCardnumber() == cardnum) {
                System.out.println(card.get(i).toString());
                return;
            }
        }
        System.out.println("Card Number is Wrong");
    }

    static boolean compare(CreditCard s1, CreditCard s2) {
        return s1.getLimit() == s2.getLimit();
    }

}
