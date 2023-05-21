package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Student_setPassportNumberTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    void testSetPassportNumber() {
        String passportNumber = "ABC123";
        student.setPassportNumber(passportNumber);
        assertEquals(passportNumber, student.getPassportNumber());
    }

    @Test
    void testSetPassportNumberNull() {
        String passportNumber = null;
        student.setPassportNumber(passportNumber);
        assertNull(student.getPassportNumber());
    }

    @Test
    void testSetPassportNumberEmpty() {
        String passportNumber = "";
        student.setPassportNumber(passportNumber);
        assertEquals(passportNumber, student.getPassportNumber());
    }
}