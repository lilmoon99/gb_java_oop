import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;
    private Teacher teacher;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentList=" + studentList +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator((List<Student>) this);
    }
}
