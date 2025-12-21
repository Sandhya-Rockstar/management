package com.example.management.controller;

import com.example.management.model.EagerBean;
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
   /* @PostMapping("/res")
    public String addStud(@RequestBody Student st){
         return ser.addStudent(st);
 mern
    }*/

    @PostMapping("/bulk")
    public String addStud(@RequestBody List<Student> stud) {
         ser.addStud(stud);
         return "Data has been added successfully";

    }
    @DeleteMapping("/{id}")
    public String deleteStud(@PathVariable int id){
        ser.deleteStud(id);
        return "record deleted";
}
    @GetMapping("/stud/{n}")
    public List<Student> getNumber(@PathVariable long n) {
        return ser.getstud(n);
    }
        @GetMapping("/aisehi")

                public String getValue(){
            return "this is for lazy";

        }

}