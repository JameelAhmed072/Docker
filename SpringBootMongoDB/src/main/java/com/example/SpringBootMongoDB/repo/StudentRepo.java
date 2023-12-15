package com.example.SpringBootMongoDB.repo;

import com.example.SpringBootMongoDB.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,Integer> {
}
