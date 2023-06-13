package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Student_getNamee79d2c9ab8Test {

    @Test
    void testGetName() {
        Student student = new Student();
        student.setName("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    void testGetNameWhenNameIsNull() {
        Student student = new Student();
        assertEquals("", student.getName());
    }
}