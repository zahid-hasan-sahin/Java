
package ObjectOrientedPrigramming;

public class Constructor {
    String name,gender;
    int age= 709;
    static String un = "Polytechnic";
    static String t = "Do You Able To See Me";
   
    Constructor(){
        System.out.println("No Value");
    }
   Constructor(String n ,String g){
       name = n;
       gender  = g;
       System.out.println();
       
   }
   Constructor (String n,String g , int a){
       name = n;
       gender = g;
       age = a;
   }
   Constructor(String n,String g,int a,String i){
       name = n;
       gender = g;
       age = a;
       un = i;
       System.out.println();
   }
   void printCons(){
       
      System.out.println("Name: " +name);
      System.out.println("Gender: "+gender);
      System.out.println("Age: "+age);
      System.out.println("University: "+un);
      System.out.println();
      
   }
    
}
