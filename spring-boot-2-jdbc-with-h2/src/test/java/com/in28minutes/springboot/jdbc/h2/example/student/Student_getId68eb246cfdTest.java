package com.in28minutes.springboot.jdbc.h2.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Student_getId68eb246cfdTest {

    @Test
    public void test_getId() {
        Student student = new Student();
        student.setId(1L);
        assertEquals(1L, student.getId());
    }
}