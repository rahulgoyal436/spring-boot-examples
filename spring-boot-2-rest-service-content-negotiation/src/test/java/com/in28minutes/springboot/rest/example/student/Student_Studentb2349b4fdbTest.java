package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Student_Studentb2349b4fdbTest {

    @Test
    public void testStudent() {
        Student student = new Student();
        assertEquals(0, student.getId());
    }
}