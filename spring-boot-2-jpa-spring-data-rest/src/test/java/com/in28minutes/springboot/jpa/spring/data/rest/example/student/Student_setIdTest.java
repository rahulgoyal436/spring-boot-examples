package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_setIdTest {
    
    private Student student;
    
    @BeforeEach
    public void setUp() {
        student = new Student();
    }
    
    @Test
    public void testSetIdSuccess() {
        Long expectedId = 1L;
        student.setId(expectedId);
        Assertions.assertEquals(expectedId, student.getId());
    }
    
    @Test
    public void testSetIdNull() {
        student.setId(null);
        Assertions.assertNull(student.getId());
    }
    
    @Test
    public void testSetIdNegative() {
        Long expectedId = -1L;
        student.setId(expectedId);
        Assertions.assertEquals(expectedId, student.getId());
    }
}