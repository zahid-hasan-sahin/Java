
package OopAbout;

public class ThisKeyword {
   String name;
   int age;
   String hair;
   ThisKeyword(String name,int age){
       this.name = name;
       this.age = age;      
   }
    void Run(){
       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
      
      
   }
   ThisKeyword(String name,int age,String hair){
       this(name,age);
       this.hair = hair;
   }
   
   void Disply(){
      
       System.out.println("HairColor : "+hair);   }
  
    
}
