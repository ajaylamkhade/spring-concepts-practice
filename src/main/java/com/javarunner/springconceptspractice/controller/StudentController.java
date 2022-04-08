package com.javarunner.springconceptspractice.controller;

import com.javarunner.springconceptspractice.LazyLoadingBean;
import com.javarunner.springconceptspractice.config.TestBean;
import com.javarunner.springconceptspractice.entity.Student;
import com.javarunner.springconceptspractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    //@Qualifier("studentServiceImplV2")
    @Autowired
    private StudentService studentService;

    @Autowired
    private TestBean testBean;

    @Autowired
    LazyLoadingBean lazyLoadingBean;

        @GetMapping("/all")
        List<Student> getAllStudents(){
            testBean.testMethod();
            return studentService.getAllStudents();

        }

}
