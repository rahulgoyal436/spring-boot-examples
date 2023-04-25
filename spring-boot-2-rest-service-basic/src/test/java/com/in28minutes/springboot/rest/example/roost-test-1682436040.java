package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testConstructor() {
        Student student = new Student(1L, "John Doe", "AB123456");
        assertEquals(1L, student.getId());
        assertEquals("John Doe", student.getName());
        assertEquals("AB123456", student.getPassportNumber());
    }

    @Test
    public void testId() {
        student.setId(1L);
        assertEquals(1L, student.getId());
    }

    @Test
    public void testName() {
        student.setName("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testPassportNumber() {
        student.setPassportNumber("AB123456");
        assertEquals("AB123456", student.getPassportNumber());
    }

    @Test
    public void testEmptyConstructor() {
        assertNull(student.getId());
        assertNull(student.getName());
        assertNull(student.getPassportNumber());
    }
}