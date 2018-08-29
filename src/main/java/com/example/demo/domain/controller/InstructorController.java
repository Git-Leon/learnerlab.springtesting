package com.example.demo.domain.controller;

import com.example.demo.domain.model.Instructor;
import com.example.demo.domain.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author leon on 8/28/18.
 */
@RestController
@RequestMapping(value = "instructors/")
public class InstructorController {
    @Autowired
    private InstructorService service;

    @PostMapping
    public ResponseEntity<Instructor> create(@RequestBody Instructor instructor) {
        return new ResponseEntity<>(service.create(instructor), HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<Iterable<Instructor>> findAll() {
        return new ResponseEntity<>(service.read(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Instructor> update(@RequestBody Instructor instructor) {
        return new ResponseEntity<>(service.update(instructor), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
