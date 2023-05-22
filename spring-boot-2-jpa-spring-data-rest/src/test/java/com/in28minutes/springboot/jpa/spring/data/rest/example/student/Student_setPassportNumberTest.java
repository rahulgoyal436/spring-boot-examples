package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class Student_setPassportNumberTest {

    @Mock
    Passport passport;

    @InjectMocks
    Student student;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetPassportNumber_Success() {
        String passportNumber = "AB123456";
        student.setPassportNumber(passportNumber);
        verify(passport, times(1)).setPassportNumber(passportNumber);
    }

    @Test
    public void testSetPassportNumber_Null() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            student.setPassportNumber(null);
        });
    }

    @Test
    public void testSetPassportNumber_Empty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            student.setPassportNumber("");
        });
    }
}