package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Student_setPassportNumber8bba5b77d0Test {

    @Test
    public void testSetPassportNumber() {
        Student student = new Student();
        student.setPassportNumber("1234567890");
        assertEquals("1234567890", student.getPassportNumber());
    }
}