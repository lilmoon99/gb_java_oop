import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int counter;
    private List<Student> studentList;

    public StudentGroupIterator(List<Student> studentList) {
        this.counter = 0;
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if(!hasNext()){
         return null;
        }
        return studentList.get(counter++);
    }

    @Override
    public void remove() {
        studentList.remove(counter);
    }

    public void ZeroCounter(){
        this.counter = 0;
    }

}
