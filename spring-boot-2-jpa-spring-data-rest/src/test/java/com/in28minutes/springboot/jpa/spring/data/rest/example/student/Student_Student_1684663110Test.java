package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Student_Student_1684663110Test {

    @InjectMocks
    private Student student;

    @Test
    public void testConstructor() {
        Long id = 1L;
        String name = "John Doe";
        String passportNumber = "AB123456";

        Student student = new Student(id, name, passportNumber);

        assertEquals(id, student.getId());
        assertEquals(name, student.getName());
        assertEquals(passportNumber, student.getPassportNumber());
    }

    @Test
    public void testConstructorWithNullValues() {
        Long id = null;
        String name = null;
        String passportNumber = null;

        Student student = new Student(id, name, passportNumber);

        assertEquals(id, student.getId());
        assertEquals(name, student.getName());
        assertEquals(passportNumber, student.getPassportNumber());
    }

    @Test
    public void testConstructorWithEmptyValues() {
        Long id = 1L;
        String name = "";
        String passportNumber = "";

        Student student = new Student(id, name, passportNumber);

        assertEquals(id, student.getId());
        assertEquals(name, student.getName());
        assertEquals(passportNumber, student.getPassportNumber());
    }
}