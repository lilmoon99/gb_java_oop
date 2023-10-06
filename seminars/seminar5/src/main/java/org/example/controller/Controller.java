package org.example.controller;

import org.example.model.Student;
import org.example.model.Type;
import org.example.model.User;
import org.example.service.DataService;
import org.example.view.StudentView;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String dateOfBirth, Type type){
        dataService.create(firstName,secondName,dateOfBirth,Type.STUDENT);
    }
    public void getAllStudents(){
        List<User> students = dataService.getAllStudent();
        for (User u: students){
            studentView.printOnConsole((Student) u);
        }
    }
}
