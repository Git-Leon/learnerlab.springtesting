package com.example.demo.domain.dtos;

import com.example.demo.domain.model.Instructor;
import com.example.demo.domain.model.Student;
import com.example.demo.domain.repos.InstructorRepository;
import com.example.demo.domain.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author leon on 8/27/18.
 */
@Component
public class Alumni extends Classroom {

    @Autowired
    public Alumni(InstructorRepository instructors, StudentRepository students) {
        super(instructors, students);
    }

    @PostConstruct
    public void executeBootcamp() {
        long numberOfInstructors = instructors.count();
        long numberOfStudents = students.count();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        Iterable<Instructor> allInstructors = instructors.findAll();
        Iterable<Student> allStudents = students.findAll();

        allInstructors.forEach(instructor -> {
            instructor.lecture(allStudents, numberOfHoursPerInstructor);
            students.save(allStudents);
            instructors.save(instructor);
        });
    }
}
