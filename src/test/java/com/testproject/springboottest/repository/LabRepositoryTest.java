package com.testproject.springboottest.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LabRepositoryTest {
    @Autowired
    private LabRepository labRepository;

    @Test
    void findAll(){
        System.out.println(labRepository.findAll());
    }

}