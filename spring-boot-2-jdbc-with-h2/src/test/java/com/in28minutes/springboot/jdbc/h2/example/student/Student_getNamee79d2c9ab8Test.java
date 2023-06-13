package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Student_getNamee79d2c9ab8Test {

    @Test
    public void testGetName() {
        Student student = new Student("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetNameNull() {
        Student student = new Student(null);
        assertEquals("", student.getName());
    }
}