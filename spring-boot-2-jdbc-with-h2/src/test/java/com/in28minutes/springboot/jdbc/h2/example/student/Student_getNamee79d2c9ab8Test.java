package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Student_getNamee79d2c9ab8Test {

    @Test
    public void testGetName() {
        Student student = new Student();
        student.setName("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetNameWhenNameIsNull() {
        Student student = new Student();
        assertNull(student.getName());
    }
}