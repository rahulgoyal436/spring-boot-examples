package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_Student_1684743261Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("John Doe", "AB123456");
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetPassportNumber() {
        assertEquals("AB123456", student.getPassportNumber());
    }

    @Test
    public void testSetName() {
        student.setName("Jane Doe");
        assertEquals("Jane Doe", student.getName());
    }
}