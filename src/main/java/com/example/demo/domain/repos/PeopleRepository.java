package com.example.demo.domain.repos;

import com.example.demo.domain.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leon on 8/27/18.
 */
public interface PeopleRepository<PersonType extends Person> extends CrudRepository<PersonType, Long> {
}
