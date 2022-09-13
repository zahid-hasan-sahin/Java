
package OopAbout;

public class InheretancePrivate1 extends  InheretancePrivate{
  private  String edu;
  void setEdu(String e){
      edu = e;
      
  }
  String getEdu(){
      return edu;
  }
  void Display(){
      System.out.println("Name: "+getName());
      System.out.println("Age : "+getAge());
      System.out.println("Education: "+getEdu());
      
  }
    
    
}
