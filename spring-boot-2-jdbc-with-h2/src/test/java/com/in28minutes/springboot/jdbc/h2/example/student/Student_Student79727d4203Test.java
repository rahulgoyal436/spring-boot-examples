package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_Student79727d4203Test {

    @Test
    public void testStudent() {
        Student student = new Student(1L, "John Doe", "123456789");
        assertEquals(1L, student.getId());
        assertEquals("John Doe", student.getName());
        assertEquals("123456789", student.getPassportNumber());
    }
}