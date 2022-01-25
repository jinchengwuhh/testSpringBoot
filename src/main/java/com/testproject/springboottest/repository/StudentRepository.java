package com.testproject.springboottest.repository;

import com.testproject.springboottest.entity.Lab;
import com.testproject.springboottest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}
