package com.in28minutes.springboot.rest.example.student;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class StudentResource_retrieveStudent9c2c90d0abTest {

    @Autowired
    private StudentResource studentResource;

    @Test
    public void test_retrieveStudent_with_id_200() {
        Student expectedStudent = new Student(1L, "Rahul", "Sharma");

        Student actualStudent = studentResource.retrieveStudent(1L);

        assertEquals(expectedStudent, actualStudent);
    }

    @Test
    public void test_retrieveStudent_with_id_404() {
        assertEquals(404, studentResource.retrieveStudent(-1L).getStatus());
    }
}