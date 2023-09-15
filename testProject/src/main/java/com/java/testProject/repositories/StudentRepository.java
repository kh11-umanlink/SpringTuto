package com.java.testProject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.testProject.models.Student;

public interface StudentRepository extends MongoRepository <Student, String>{
    


    
}
