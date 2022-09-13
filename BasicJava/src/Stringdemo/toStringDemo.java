
package Stringdemo;

public class toStringDemo {
    String name;
    int age;
    toStringDemo(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name : "+name+"\n Age : "+age;
    }
    
    
    
}
