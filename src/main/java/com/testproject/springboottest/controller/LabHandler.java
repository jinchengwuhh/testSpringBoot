package com.testproject.springboottest.controller;


import com.testproject.springboottest.entity.Lab;
import com.testproject.springboottest.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lab")
public class LabHandler {
    @Autowired
    private LabRepository labRepository;

    @GetMapping("/findAll")
    public List<Lab> findAll() {
        return labRepository.findAll();
    }
}
