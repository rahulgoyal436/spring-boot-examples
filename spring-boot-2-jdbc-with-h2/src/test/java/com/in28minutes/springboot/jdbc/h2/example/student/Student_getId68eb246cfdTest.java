package com.in28minutes.springboot.jdbc.h2.example.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Student_getId68eb246cfdTest {

    @Test
    public void test_getId_with_valid_id() {
        Student student = new Student();
        student.setId(1L);
        assertEquals(1L, student.getId());
    }

    @Test
    public void test_getId_with_invalid_id() {
        Student student = new Student();
        student.setId(null);
        assertEquals(null, student.getId());
    }
}