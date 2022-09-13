package LabTest;

import java.util.HashMap;

public class Main {

    static void add(ReviewPage[] reviews, ReviewPage r) throws Exception {
        boolean b = false;
        for (int i = 0; i < reviews.length; i++) {
            if (reviews[i] == null) {
                reviews[i] = r;
                b = true;
                return;
            }
        }
        if (!b) {
            throw new Exception("index out of bounds");
        }
    }

    static void remove(ReviewPage[] reviews, String name) throws Exception {
        boolean b = false;
        for (int i = 0; i < reviews.length; i++) {
            if (reviews[i].getPalyerName().equals(name)) {
                reviews[i] = null;
                b = true;
                return;
            }
        }
        if (!b) {
            throw new Exception("Not found");
        }
    }

    static void display(ReviewPage[] reviews) throws Exception {
        boolean b = false;
        for (int i = 0; i < reviews.length; i++) {
            if (reviews[i] != null) {
                b = true;
                System.out.println(reviews[i].toString());
            }
        }
        if (!b) {
            throw new Exception("No elements");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        h.put("Game1", 2);
        h.put("Game2", 3);
        h.put("Game3", 5);
        for (String i : h.keySet()) {
            System.out.println(i + " " + h.get(i));
        }
        try {
            ReviewPage[] ar = new ReviewPage[5];
            ReviewPage ob1 = new ReviewPage();
            ob1.setPalyerName("name1");
            add(ar, ob1);
            display(ar);

            ReviewPage ob2 = new ReviewPage();
            ob2.setPalyerName("name2");
            add(ar, ob2);
            
            ReviewPage ob3 = new ReviewPage();
            ob3.setPalyerName("name3");
            add(ar, ob3);
            display(ar);
            remove(ar, "name2");
            ReviewPage ob4 = new ReviewPage();
            ob4.setPalyerName("name4");
            add(ar, ob4);
            ReviewPage ob5 = new ReviewPage();
            ob5.setPalyerName("name5");
            add(ar, ob5);
            display(ar);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
