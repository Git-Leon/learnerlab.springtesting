package com.example.demo.domain.services;

/**
 * @author leon on 8/28/18.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author leon on 8/28/18.
 */
@MappedSuperclass
abstract public class PeopleService<ObjectType extends Serializable,
        RepositoryType extends CrudRepository<ObjectType, Long>>{
    private final RepositoryType instructorRepository;

    @Autowired
    public PeopleService(RepositoryType instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public ObjectType create(ObjectType instructor) {
        return instructorRepository.save(instructor);
    }

    public ObjectType read(Long id) {
        return instructorRepository.findOne(id);
    }

    public Iterable<ObjectType> read() {
        return instructorRepository.findAll();
    }

    public ObjectType update(ObjectType instructor) {
        return instructorRepository.save(instructor);
    }

    public void delete(ObjectType instructor) {
        instructorRepository.delete(instructor);
    }

    public void delete(Long id) {
        instructorRepository.delete(id);
    }
}

