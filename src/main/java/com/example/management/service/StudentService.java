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
    public Student addStudent(Student st){

        return repo.save(st);
    }
    public List<Student> addStud(List<Student> stud){
        return repo.saveAll(stud);
    }
   public void deleteStud(int id){

       repo.deleteById(id);
   }
}
