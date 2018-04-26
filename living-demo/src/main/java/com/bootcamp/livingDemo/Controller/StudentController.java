package com.bootcamp.livingDemo.Controller;

import java.util.List;
import com.bootcamp.livingDemo.Model.Student;
import com.bootcamp.livingDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudentList();
    }


}
