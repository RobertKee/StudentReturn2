package com.bootcamp.livingDemo.Service;

import com.bootcamp.livingDemo.Model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    private List<Student> studentList = new ArrayList<Student>();

    public StudentService() {
        studentList.add(new Student("Shahar",24));
        studentList.add(new Student("Victor",25));
        studentList.add(new Student("Noelle",25));
        studentList.add(new Student("Mariano",25));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

}
