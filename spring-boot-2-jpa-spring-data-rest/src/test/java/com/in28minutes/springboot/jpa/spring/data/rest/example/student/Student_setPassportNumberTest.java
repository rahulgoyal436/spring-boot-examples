package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class Student_setPassportNumberTest {

    @Mock
    Passport passport;

    @InjectMocks
    Student student;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetPassportNumber_Success() {
        String passportNumber = "ABCD1234";
        when(passport.isValid(passportNumber)).thenReturn(true);

        student.setPassportNumber(passportNumber);

        Assertions.assertEquals(passportNumber, student.getPassportNumber());
    }

    @Test
    public void testSetPassportNumber_InvalidPassportNumber() {
        String passportNumber = "invalid";
        when(passport.isValid(passportNumber)).thenReturn(false);

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            student.setPassportNumber(passportNumber);
        });

        Assertions.assertEquals("Invalid passport number", exception.getMessage());
    }

    @Test
    public void testSetPassportNumber_NullPassportNumber() {
        String passportNumber = null;
        when(passport.isValid(passportNumber)).thenReturn(false);

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            student.setPassportNumber(passportNumber);
        });

        Assertions.assertEquals("Passport number cannot be null", exception.getMessage());
    }
}