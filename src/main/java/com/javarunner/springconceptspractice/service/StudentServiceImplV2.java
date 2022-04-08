package com.javarunner.springconceptspractice.service;

import com.javarunner.springconceptspractice.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImplV2 implements  StudentService{
    @Override
    public List<Student> getAllStudents() {
        System.out.println("inside studentServiceImplV2 class ");
        return Arrays.asList(new Student(20001L,"Jay"),new Student(20002L,"Kapil"));
    }
}
