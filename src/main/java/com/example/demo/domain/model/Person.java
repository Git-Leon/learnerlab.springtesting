package com.example.demo.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;

/**
 * @author leon on 8/27/18.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person implements Serializable {
    @Id
    private Long id;
    private String name;

    public Person() {
    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

