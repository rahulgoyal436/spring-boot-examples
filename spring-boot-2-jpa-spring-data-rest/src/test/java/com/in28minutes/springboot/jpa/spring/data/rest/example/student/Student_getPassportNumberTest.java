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
    Passport passport;

    @InjectMocks
    Student student;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPassportNumber_Success() {
        when(passport.getPassportNumber()).thenReturn("A123456");
        student.setPassport(passport);
        Assertions.assertEquals("A123456", student.getPassportNumber());
    }

    @Test
    public void testGetPassportNumber_NullPassport() {
        student.setPassport(null);
        Assertions.assertNull(student.getPassportNumber());
    }

    @Test
    public void testGetPassportNumber_NullPassportNumber() {
        when(passport.getPassportNumber()).thenReturn(null);
        student.setPassport(passport);
        Assertions.assertNull(student.getPassportNumber());
    }
}