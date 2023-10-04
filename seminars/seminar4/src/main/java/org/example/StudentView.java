package org.example;

import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> users) {
        for(Student st : users){
            System.out.println(st.toString());
        }
    }
}
