package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class Student_setPassportNumberTest {

    @InjectMocks
    private Student student;

    @Mock
    private Passport passport;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetPassportNumber_Success() {
        String passportNumber = "AB123456";
        when(passport.isValid(passportNumber)).thenReturn(true);

        student.setPassportNumber(passportNumber);

        Assertions.assertEquals(passportNumber, student.getPassportNumber());
    }

    @Test
    public void testSetPassportNumber_InvalidPassport() {
        String passportNumber = "123456789";
        when(passport.isValid(passportNumber)).thenReturn(false);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            student.setPassportNumber(passportNumber);
        });
    }

    @Test
    public void testSetPassportNumber_NullPassport() {
        String passportNumber = null;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            student.setPassportNumber(passportNumber);
        });
    }
}
