package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class Student_getPassportNumberTest {

    @Mock
    private Student student;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetPassportNumber_Success() {
        String passportNumber = "AB123456";
        student.setPassportNumber(passportNumber);

        String actualPassportNumber = student.getPassportNumber();

        Assertions.assertEquals(passportNumber, actualPassportNumber);
    }

    @Test
    void testGetPassportNumber_Null() {
        String actualPassportNumber = student.getPassportNumber();

        Assertions.assertNull(actualPassportNumber);
    }

    @Test
    void testGetPassportNumber_Empty() {
        student.setPassportNumber("");

        String actualPassportNumber = student.getPassportNumber();

        Assertions.assertEquals("", actualPassportNumber);
    }
}