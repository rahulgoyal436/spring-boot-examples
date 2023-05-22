package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_getIdTest {

    @Test
    public void testGetIdSuccess() {
        Student student = new Student();
        student.setId(1L);
        Assertions.assertEquals(1L, student.getId());
    }
    
    @Test
    public void testGetIdNull() {
        Student student = new Student();
        Assertions.assertNull(student.getId());
    }
    
    @Test
    public void testGetIdNegative() {
        Student student = new Student();
        student.setId(-1L);
        Assertions.assertEquals(-1L, student.getId());
    }
}