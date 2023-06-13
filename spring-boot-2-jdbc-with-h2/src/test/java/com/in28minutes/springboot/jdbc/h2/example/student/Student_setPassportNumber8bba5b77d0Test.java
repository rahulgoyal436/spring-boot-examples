package com.in28minutes.springboot.jdbc.h2.example.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Student_setPassportNumber8bba5b77d0Test {

    @Test
    public void testSetPassportNumber() {
        Student student = new Student();
        student.setPassportNumber("1234567890");
        assertEquals("1234567890", student.getPassportNumber());
    }
}