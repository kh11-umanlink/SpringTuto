package com.java.testProject.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

@Document(value="students")

public class Student {

    @Id
    private String id;

    @NotBlank
    private String fullname;
    private Date date;
    private String cin;

    
}
