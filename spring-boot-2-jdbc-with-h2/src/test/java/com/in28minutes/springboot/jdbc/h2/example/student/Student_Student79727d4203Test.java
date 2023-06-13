package com.in28minutes.springboot.jdbc.h2.example.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Student_Student79727d4203Test {

    @Test
    public void testStudent() {
        Student student = new Student(1L, "John Doe", "123456789");
        assertEquals(1L, student.getId());
        assertEquals("John Doe", student.getName());
        assertEquals("123456789", student.getPassportNumber());
    }
}