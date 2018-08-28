package com.example.demo.domain.dtos;

import com.example.demo.domain.repos.InstructorRepository;
import com.example.demo.domain.repos.StudentRepository;
import com.example.demo.domain.model.Teacher;

/**
 * @author leon on 8/27/18.
 */
public class Classroom {
    protected InstructorRepository instructors;
    protected StudentRepository students;

    public Classroom(InstructorRepository instructors, StudentRepository students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students.findAll(), numberOfHours);
    }

    public InstructorRepository getInstructors() {
        return instructors;
    }

    public StudentRepository getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "instructors=" + instructors +
                ", students=" + students +
                '}';
    }
}
