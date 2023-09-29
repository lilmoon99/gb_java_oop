import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
test1();
    }
    public static void test1(){
        Student student1 = new Student("Ivanov","Ivan","Ivanovich","21.01.1997", 15L);
        Student student2 = new Student("Borisov","Boris","Borisovich","11.08.1999", 11L);
        Student student3 = new Student("Maximov","Maxim","Maximovich","09.11.2000", 19L);
        Student student4 = new Student("Alexeev","Alex","Alexeevich","25.01.1999", 1L);
        List<Student> students = new ArrayList<Student>(List.of(student1,student2,student3,student4));
        StudentGroupIterator sgi = new StudentGroupIterator(students);
        sgi.next();
        sgi.remove();
        sgi.ZeroCounter();
        while (sgi.hasNext()) {
            System.out.println(sgi.next());
        }
//        Collections.sort(students);
//        for (Student i : students){
//            System.out.println(i);
//        }
    }
}