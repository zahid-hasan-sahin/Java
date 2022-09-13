
package ObjectOrientedPrigramming;

public class ConstructorTry {
    public static void main(String[] args){
        Constructor n = new Constructor("sahin","male");
        n.printCons();
        Constructor a = new Constructor();
        Constructor u = new Constructor("she","female",5,"chapai");
        u.printCons();
        System.out.println(Constructor.t);
        
        
    }
    
}
