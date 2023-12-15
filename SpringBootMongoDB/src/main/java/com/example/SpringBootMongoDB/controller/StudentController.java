package com.example.SpringBootMongoDB.controller;


import com.example.SpringBootMongoDB.entity.Student;
import com.example.SpringBootMongoDB.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/findAll")
    public List<Student> getAllStudents(){

        return studentRepo.findAll();
    }
    @GetMapping("/find/{id}")
    public Student getAllStudentById(@PathVariable  int id){

        return studentRepo.findById(id).get();
    }

    @PostMapping("/insert")
    public Student insert(@RequestBody Student student){
        return studentRepo.save(student);
    }



}
