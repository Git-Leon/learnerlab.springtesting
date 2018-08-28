package com.example.demo;

import com.example.demo.domain.repos.InstructorRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author leon on 8/27/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestInstructorConfig {
    @Autowired
    @Qualifier("instructors")
    private InstructorRepository allInstructors;

    @Autowired
    @Qualifier("tcUsaInstructors")
    private InstructorRepository usa;

    @Autowired
    @Qualifier("tcUkInstructors")
    private InstructorRepository uk;


    @Test
    public void testInstructors() {
        String expected = "PeopleRepository{personList=[Person{id=7, name='Nhu'}, Person{id=8, name='Kris'}, Person{id=0, name='Dominique'}, Person{id=1, name='Wilhem'}, Person{id=2, name='Leon'}, Person{id=3, name='Tariq'}, Person{id=4, name='Froilan'}, Person{id=5, name='Tariq'}, Person{id=6, name='Dolio'}]}";
        String actual = allInstructors.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUsaInstructors() {
        String expected = "PeopleRepository{personList=[Person{id=0, name='Dominique'}, Person{id=1, name='Wilhem'}, Person{id=2, name='Leon'}, Person{id=3, name='Tariq'}]}";
        String actual = usa.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUkInstructors() {
        String expected = "PeopleRepository{personList=[Person{id=4, name='Froilan'}, Person{id=5, name='Tariq'}, Person{id=6, name='Dolio'}]}";
        String actual = uk.toString();
        Assert.assertEquals(expected, actual);
    }
}
