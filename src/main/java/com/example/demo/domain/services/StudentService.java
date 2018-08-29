package com.example.demo.domain.services;

import com.example.demo.domain.model.Student;
import com.example.demo.domain.repos.StudentRepository;
import org.springframework.stereotype.Service;

/**
 * @author leon on 8/28/18.
 */
@Service
public class StudentService extends PeopleService<Student, StudentRepository> {
    public StudentService(StudentRepository instructorRepository) {
        super(instructorRepository);
    }
}
