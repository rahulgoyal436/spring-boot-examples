package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class Student_getPassportNumberTest {

    @Mock
    private Passport passport;

    @InjectMocks
    private Student student;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPassportNumberSuccess() {
        when(passport.getNumber()).thenReturn("A1234567");
        student.setPassport(passport);
        Assertions.assertEquals("A1234567", student.getPassportNumber());
    }

    @Test
    public void testGetPassportNumberNullPassport() {
        student.setPassport(null);
        Assertions.assertNull(student.getPassportNumber());
    }

    @Test
    public void testGetPassportNumberEmptyNumber() {
        when(passport.getNumber()).thenReturn("");
        student.setPassport(passport);
        Assertions.assertEquals("", student.getPassportNumber());
    }
}