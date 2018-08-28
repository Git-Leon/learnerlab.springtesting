package com.example.demo.domain.model;

import javax.persistence.Entity;

/**
 * @author leon on 8/27/18.
 */
@Entity
public class Student extends Person implements Learner {
    private double totalNumberOfHoursLearned;

    public Student() {
    }

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalNumberOfHoursLearned += numberOfHours;
    }

    public double getTotalNumberOfHoursLearned() {
        return totalNumberOfHoursLearned;
    }
}
