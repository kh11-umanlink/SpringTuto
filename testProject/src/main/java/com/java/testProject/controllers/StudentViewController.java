package com.java.testProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.testProject.repositories.StudentRepository;

@Controller
public class StudentViewController {


    @Autowired
    private StudentRepository studentRepository;


    @RequestMapping(value={"/students","/"})
    public String viewStudents (Model model){

        model.addAttribute("students", studentRepository.findAll());

        return "students-list";
    } 

    
}
