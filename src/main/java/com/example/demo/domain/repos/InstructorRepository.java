package com.example.demo.domain.repos;

import com.example.demo.domain.model.Instructor;
import org.springframework.stereotype.Repository;

/**
 * @author leon on 8/27/18.
 */
@Repository
public interface InstructorRepository extends PeopleRepository<Instructor> {
}
