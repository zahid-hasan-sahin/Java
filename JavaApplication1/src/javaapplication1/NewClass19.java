package javaapplication1;


public class NewClass19 {
    public static void main(String args[]){
        String s = "Z";
        String s1 = "L";
        int sl = 0;
        int s1l = 0;
        for (int i = 0; i < s.length(); i++) {
            sl += s.charAt(i)-'A';
        }
        for (int i = 0; i < s1.length(); i++) {
            s1l += s1.charAt(i)-'A';
        }
        System.out.println(sl);
        System.out.println(s1l);
    }

}
