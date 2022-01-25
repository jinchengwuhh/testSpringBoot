package com.testproject.springboottest.repository;

import com.testproject.springboottest.entity.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepository extends JpaRepository<Lab,String> {
}
