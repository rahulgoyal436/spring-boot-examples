package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Student_getPassportNumberaa3bc55c5bTest {

    @Test
    public void test1() {
        Student student = new Student();
        student.setPassportNumber("1234567890");
        assertEquals("1234567890", student.getPassportNumber());
    }

    @Test
    public void test2() {
        Student student = new Student();
        student.setPassportNumber(null);
        assertNull(student.getPassportNumber());
    }
}