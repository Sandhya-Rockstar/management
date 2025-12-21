package com.example.management.service;

import com.example.management.model.Student;
import com.example.management.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @InjectMocks
    StudentService stud;
    @Mock
    StudentRepository repo;

    @Test
    void addStudTest(){
        Student s1 = new Student();
        s1.setNumber(1);
        s1.setName("Amit");

        Student s2 = new Student();
        s2.setNumber(2);
        s2.setName("Sneha");

        List<Student> students = List.of(s1, s2);

        stud.addStud(students);

        verify(repo, times(1)).saveAll(students);
    }
}