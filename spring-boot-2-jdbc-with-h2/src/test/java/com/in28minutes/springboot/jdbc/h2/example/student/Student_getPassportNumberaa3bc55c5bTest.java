package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Student_getPassportNumberaa3bc55c5bTest {

    @Test
    void test_getPassportNumber_success() {
        Student student = new Student();
        student.setPassportNumber("1234567890");
        assertEquals("1234567890", student.getPassportNumber());
    }

    @Test
    void test_getPassportNumber_failure() {
        Student student = new Student();
        student.setPassportNumber(null);
        assertEquals("", student.getPassportNumber());
    }