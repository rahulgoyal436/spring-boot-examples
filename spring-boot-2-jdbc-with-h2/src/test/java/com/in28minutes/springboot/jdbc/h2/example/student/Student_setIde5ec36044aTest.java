package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Student_setIde5ec36044aTest {

    @Test
    public void testSetId() {
        Student student = new Student();
        student.setId(1L);
        assertEquals(1L, student.getId());
    }
}