package com.testproject.springboottest.controller;


import com.testproject.springboottest.repository.StudentRepository;
import com.testproject.springboottest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginHandler {
    @Autowired
    StudentService studentService;

    @GetMapping("/studentLogin")
    public boolean login(@PathVariable("username") String username, @PathVariable("password") String password) {
        return studentService.login(username, password);
    }
}
