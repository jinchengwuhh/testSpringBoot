package com.testproject.springboottest.service;


import com.testproject.springboottest.entity.Student;
import com.testproject.springboottest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    //Autowire装配UserRepository数据库操作类
    @Autowired
    StudentRepository studentRepository;

    /**
     * 基础登录逻辑
     * @param username 用户名
     * @param password MD5 hashed密码
     * @return
     */
    public boolean login(String username,String password){
        Iterable<Student> students = studentRepository.findAll();
        for (Student u:
                students) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
