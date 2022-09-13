
package OopAbout;

public class InheretancePrivate {
    private String name;
    private int age;
    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void setAge(int a){
       age = a;
    }
   void  Display1(){
        System.out.println("Name : "+name);
        System.out.println("Age : " +age);
    }
}
