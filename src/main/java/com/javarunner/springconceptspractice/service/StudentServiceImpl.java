package com.javarunner.springconceptspractice.service;

import com.javarunner.springconceptspractice.entity.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Primary
public class StudentServiceImpl implements StudentService {

    public List<Student> getAllStudents(){
        System.out.println("inside StudentServiceImpl class ");
        return Arrays.asList(new Student(10001L,"Dhawal"),new Student(10002L,"Ajay"));

    }

}
