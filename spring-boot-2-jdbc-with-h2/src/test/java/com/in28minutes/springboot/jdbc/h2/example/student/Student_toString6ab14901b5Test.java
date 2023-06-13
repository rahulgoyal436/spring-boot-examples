package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Student_toString6ab14901b5Test {

    @Test
    void testToString() {
        Student student = new Student(1, "John Doe", "123456789");
        assertEquals("Student [id=1, name=John Doe, passportNumber=123456789]", student.toString());
    }
}