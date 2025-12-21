package com.example.management.service;

import com.example.management.exceptionhandler.NumberNotTenDigitException;
import com.example.management.model.Student;
import com.example.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repo;

    public List<Student> getAllStudent(){

        return repo.findAll();
    }
   /* public String addStudent(Student st){
        if (st == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        String s =  String.valueOf(st.getNumber());
           int length = s.length();
        if(length!=10){

            throw new NumberNotTenDigitException();
        }
        else {
            repo.save(st);
            return "Data added";
        }
    }*/
   public void addStud(List<Student> stud){
         repo.saveAll(stud);
    }
   public void deleteStud(int id){
       repo.deleteById(id);
   }
   @GetMapping
    public List<Student> getstud(long n){
        return repo.findByNumber(n);
   }
}