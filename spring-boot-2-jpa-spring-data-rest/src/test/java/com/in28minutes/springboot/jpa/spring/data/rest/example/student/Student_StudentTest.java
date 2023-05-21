package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testConstructor() {
        assertEquals(Student.class, student.getClass());
    }

    @Test
    public void testSuperConstructor() {
        assertEquals(Object.class, student.getClass().getSuperclass());
    }

    @Test
    public void testToString() {
        String expected = "Student [id=null, name=null, passportNumber=null]";
        assertEquals(expected, student.toString());
    }
}
