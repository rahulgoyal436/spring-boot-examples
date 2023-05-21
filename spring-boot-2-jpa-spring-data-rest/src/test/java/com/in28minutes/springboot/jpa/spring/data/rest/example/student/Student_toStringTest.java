package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Student_toStringTest {

    @Test
    public void testToStringSuccess() {
        Student student = new Student("1234", "John Doe", "ABC123");
        String expectedOutput = "Student [id=1234, name=John Doe, passportNumber=ABC123]";
        String actualOutput = student.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testToStringNullValues() {
        Student student = new Student(null, null, null);
        String expectedOutput = "Student [id=null, name=null, passportNumber=null]";
        String actualOutput = student.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testToStringEmptyValues() {
        Student student = new Student("", "", "");
        String expectedOutput = "Student [id=, name=, passportNumber=]";
        String actualOutput = student.toString();
        assertEquals(expectedOutput, actualOutput);
    }
}