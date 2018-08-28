package com.example.demo.domain.model;

import javax.persistence.Entity;

/**
 * @author leon on 8/27/18.
 */
@Entity
public class Instructor extends Person implements Teacher {
    public Instructor() {
    }

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        learners.forEach(learner -> teach(learner, numberOfHours));
    }
}
