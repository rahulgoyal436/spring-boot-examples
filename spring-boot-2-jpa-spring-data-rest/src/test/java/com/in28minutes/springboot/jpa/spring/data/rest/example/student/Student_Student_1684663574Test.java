package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Student_Student_1684663574Test {

    @InjectMocks
    private Student student;

    @Mock
    private ExternalService externalService;

    @Test
    public void testConstructor_Success() {
        String name = "John Doe";
        String passportNumber = "AB123456";
        student = new Student(name, passportNumber);
        assertEquals(name, student.getName());
        assertEquals(passportNumber, student.getPassportNumber());
    }

    @Test
    public void testConstructor_NullName() {
        String name = null;
        String passportNumber = "AB123456";
        try {
            student = new Student(name, passportNumber);
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null", e.getMessage());
        }
    }

    @Test
    public void testConstructor_NullPassportNumber() {
        String name = "John Doe";
        String passportNumber = null;
        try {
            student = new Student(name, passportNumber);
        } catch (IllegalArgumentException e) {
            assertEquals("Passport number cannot be null", e.getMessage());
        }
    }
}