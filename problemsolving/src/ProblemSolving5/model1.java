/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving5;

interface model1 {

    default void show() {
        System.out.println("Size      : 15.60 inch");
        System.out.println("Processor : Intel Core i3 6th Gen 6060U");
        System.out.println("Ram       : 8 Gb");
        System.out.println("Cache     : 6 Mb");
    }
}

interface model2 {

    default void show() {
        System.out.println("Size      : 15.60 inch");
        System.out.println("Processor : Intel Core i5 8250U");
        System.out.println("Ram       : 8 Gb");
        System.out.println("Cache     : 6 Mb");
    }
}

interface model3 {

     static void show() {
        System.out.println("Size      : 14.00 inch");
        System.out.println("Processor : Intel Core i7 6600U");
        System.out.println("Ram       : 12 Gb");
        System.out.println("Cache     : 4 Mb");
    }
} 

class TestClass implements model1, model2, model3 {

    @Override
    public void show() {
        model1.super.show();
        model2.super.show();
        model3.show();
    }

    public static void main(String args[]) {
        TestClass d = new TestClass();
        d.show();
    }
}
