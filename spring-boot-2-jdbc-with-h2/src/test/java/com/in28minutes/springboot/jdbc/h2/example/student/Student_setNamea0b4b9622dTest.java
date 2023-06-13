package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Student_setNamea0b4b9622dTest {

    @Test
    public void testSetName() {
        Student student = new Student();
        student.setName("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testSetNameNull() {
        Student student = new Student();
        student.setName(null);
        assertNull(student.getName());
    }
}