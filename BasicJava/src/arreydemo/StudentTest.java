
package arreydemo;
import java.util.LinkedList;
public class StudentTest {
    public static void main(String[] args){
        
        LinkedList<Student> list = new LinkedList<>();
        Student ob1= new Student("Zahid",101);
        Student ob2 = new Student("hasan",102);
        Student ob3 = new Student("sahin",103);
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        for(Student n : list){
            System.out.println(n.id+"  "+n.name+"   "+n.classname);
        }
        
        
        
        
    }
    
}
