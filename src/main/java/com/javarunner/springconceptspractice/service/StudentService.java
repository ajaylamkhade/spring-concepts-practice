package com.javarunner.springconceptspractice.service;

import com.javarunner.springconceptspractice.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


public interface StudentService {

    List<Student> getAllStudents();
  }
