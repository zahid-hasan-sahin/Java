
package problemsolving;


public class Duplicate {
    public static void main(String argu[]) {

  String str = "w3schools";
  int cnt = 0;
  char[] inp = str.toCharArray();
  System.out.println("Duplicate Characters are:");
  for (int i = 0; i < inp.length; i++) {
   for (int j = i + 1; j < inp.length; j++) {
    if (inp[i] == inp[j]) {
    System.out.println(i);
    System.out.println(j);
    }
   }
  }
 }
}
