package admissiontest.problem5;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("F");
        arrayList.add("D");
        arrayList.add("H");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("G");
        System.out.println("using the enhanced for loop");
        for (String item : arrayList) {
            System.out.print(item + " ");
        }
        System.out.println();
        Collections.sort(arrayList);
        System.out.println("After sort");
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println("After Suffle");
        System.out.println(arrayList);

        /*
        Collection is an interface and Collections is a utility class.
        
        A class describes the attributes and behaviors of an object.
        A class may contain abstract methods, concrete methods.
        
        An interface contains behaviors that a class implements.
        
        so Collection interface is contains all kind of behaviors of collections and
        classes implements it(Arraylist,LinkedList,Queue,stack)
        
        and Collections contains so many static helpler methods.
        
         */
        System.out.println("Search for a name in the list that exists");
        System.out.println(arrayList.indexOf("B"));
        System.out.println("Search for a name that is not in the list.");
        System.out.println(arrayList.indexOf("Z")); //-1
        String[] ar = arrayList.toArray(new String[arrayList.size()]);
        System.out.println("Printing array Elements after convert using toArray");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        List<String> list = Arrays.asList(ar);
        System.out.println("Printing list after convert using asList");
        System.out.println(list);

    }
}
