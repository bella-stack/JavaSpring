package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {
  @GetMapping
  @RequestMapping("/h1")
  public String helloWorld1(){
  return "hello world1";
  }

  @GetMapping
  @RequestMapping("/h2")
  public String helloWorld2(){
    return "hello world2";
  }
}
