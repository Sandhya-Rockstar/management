package com.example.management.service;

import com.example.management.model.Student;
import com.example.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repo;

    public List<Student> getAllStudent(){

        return repo.findAll();
    }
    public String addStudent(Student st){
        String s =  String.valueOf(st.getNumber());
           int length = s.length();
        if(length!=10){
            return "number should be 10 digits";
        }
        else {
            repo.save(st);
            return "Data added";
        }
    }
    public List<Student> addStud(List<Student> stud){
        return repo.saveAll(stud);
    }
   public void deleteStud(int id){

       repo.deleteById(id);
   }
}
