package com.example.demo;

import com.example.demo.domain.model.Instructor;
import com.example.demo.domain.repos.InstructorRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

/**
 * @author leon on 8/27/18.
 */
@Configuration
public class InstructorConfig {
    @Bean
    public InstructorRepository tcUsaInstructors(InstructorRepository instructors) {
        instructors.save(Arrays.asList(
                new Instructor(0L, "Dominique"),
                new Instructor(1L, "Wilhem"),
                new Instructor(2L, "Leon"),
                new Instructor(3L, "Tariq")));
        return instructors;
    }

    @Bean
    public InstructorRepository tcUkInstructors(InstructorRepository instructors) {
        instructors.save(Arrays.asList(
                new Instructor(0L, "Dominique"),
                new Instructor(1L, "Wilhem"),
                new Instructor(2L, "Leon"),
                new Instructor(3L, "Tariq"),
                new Instructor(4L, "Froilan"),
                new Instructor(6L, "Dolio")));
        return instructors;
    }

    @Bean
    @Primary
    public InstructorRepository instructors(InstructorRepository instructors) {
        instructors = tcUsaInstructors(instructors);
        instructors = tcUkInstructors(instructors);
        instructors.save(Arrays.asList(
                new Instructor(7L, "Nhu"),
                new Instructor(8L, "Tariq")));
        return instructors;
    }
}
