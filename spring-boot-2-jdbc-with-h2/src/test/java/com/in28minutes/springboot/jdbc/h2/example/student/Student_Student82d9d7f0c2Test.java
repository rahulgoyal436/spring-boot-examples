package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Student_Student82d9d7f0c2Test {

    @Test
    void testStudent() {
        Student student = new Student("John Doe", "123456789");
        assertEquals("John Doe", student.getName());
        assertEquals("123456789", student.getPassportNumber());
    }
}