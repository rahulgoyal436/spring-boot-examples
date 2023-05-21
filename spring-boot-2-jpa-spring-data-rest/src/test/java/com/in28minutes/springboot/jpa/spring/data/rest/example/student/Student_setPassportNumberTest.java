package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Student_setPassportNumberTest {

    @Mock
    private Student student;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetPassportNumberWithValidInput() {
        String passportNumber = "AB123456";
        student.setPassportNumber(passportNumber);
        Assertions.assertEquals(passportNumber, student.getPassportNumber());
    }

    @Test
    public void testSetPassportNumberWithNullInput() {
        String passportNumber = null;
        student.setPassportNumber(passportNumber);
        Assertions.assertNull(student.getPassportNumber());
    }

    @Test
    public void testSetPassportNumberWithInvalidInput() {
        String passportNumber = "invalidPassportNumber";
        student.setPassportNumber(passportNumber);
        Assertions.assertNotEquals(passportNumber, student.getPassportNumber());
    }
}