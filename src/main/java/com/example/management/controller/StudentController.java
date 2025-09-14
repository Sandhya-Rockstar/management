package com.example.management.controller;

import com.example.management.model.Student;
import com.example.management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService ser;

    @GetMapping("/getStud")
    public List<Student> getStud(){
        return ser.getAllStudent();

    }
    @PostMapping("/res")
    public String addStud(@RequestBody Student st){
        System.out.println(st.getName()+" :"+st.getNumber());
         return ser.addStudent(st);

    }

    @PostMapping("/bulk")
    public List<Student> addStud(@RequestBody List<Student> stud) {
        return ser.addStud(stud);

    }
    @DeleteMapping("/{id}")
    public String deleteStud(@PathVariable int id){
        ser.deleteStud(id);
        return "record deleted"
}
    @GetMapping("/stud/{n}")
    public List<Student> getNumber(@PathVariable long n){
        return ser.getstud(n);
}
}
