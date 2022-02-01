package com.example.demo.controller;

import com.example.demo.model.Student;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {
  @GetMapping
  public Student helloWorld(){
    Student s = new Student(UUID.randomUUID(),"test name");
    return s;
  }
}
