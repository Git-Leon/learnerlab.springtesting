package com.example.demo;

import com.example.demo.domain.model.Student;
import com.example.demo.domain.repos.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

/**
 * @author leon on 8/27/18.
 */
@Configuration
public class StudentConfig {

    @Bean
    @Primary
    public StudentRepository currentStudents(StudentRepository students) {
        students.save(Arrays.asList(
                new Student(0L, "Sam"),
                new Student(1L, "Alex"),
                new Student(2L, "Jan"),
                new Student(3L, "Caden")));
        return students;
    }


    @Bean
    public StudentRepository previousStudents(StudentRepository students) {
        students.save(Arrays.asList(
                new Student(0L, "Jen"),
                new Student(1L, "Kit"),
                new Student(2L, "Kai"),
                new Student(3L, "Cameron")));
        return students;
    }
}
