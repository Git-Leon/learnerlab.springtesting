package com.example.demo.domain.services;

import com.example.demo.domain.model.Instructor;
import com.example.demo.domain.repos.InstructorRepository;
import org.springframework.stereotype.Service;

/**
 * @author leon on 8/28/18.
 */
@Service
public class InstructorService extends PeopleService<Instructor, InstructorRepository> {
    public InstructorService(InstructorRepository instructorRepository) {
        super(instructorRepository);
    }
}
