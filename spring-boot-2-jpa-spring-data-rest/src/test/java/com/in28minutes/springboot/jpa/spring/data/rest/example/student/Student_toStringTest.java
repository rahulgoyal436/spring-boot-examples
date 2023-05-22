package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Student_toStringTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
        student.setId(1);
        student.setName("John Doe");
        student.setPassportNumber("AB123456");
    }

    @Test
    public void testToStringSuccess() {
        String expected = "Student [id=1, name=John Doe, passportNumber=AB123456]";
        String actual = student.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringNullValues() {
        student.setId(null);
        student.setName(null);
        student.setPassportNumber(null);
        String expected = "Student [id=null, name=null, passportNumber=null]";
        String actual = student.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringEmptyValues() {
        student.setId(0);
        student.setName("");
        student.setPassportNumber("");
        String expected = "Student [id=0, name=, passportNumber=]";
        String actual = student.toString();
        assertEquals(expected, actual);
    }
}