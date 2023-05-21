package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class Student_toStringTest {

    @Mock
    private Student student;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testToString() {
        student = new Student();
        student.setId(1L);
        student.setName("John");
        student.setPassportNumber("AB123456");

        String expectedOutput = "Student [id=1, name=John, passportNumber=AB123456]";
        String actualOutput = student.toString();

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testToStringWithNullValues() {
        student = new Student();
        student.setId(null);
        student.setName(null);
        student.setPassportNumber(null);

        String expectedOutput = "Student [id=null, name=null, passportNumber=null]";
        String actualOutput = student.toString();

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testToStringWithLongValues() {
        student = new Student();
        student.setId(Long.MAX_VALUE);
        student.setName("John");
        student.setPassportNumber("AB123456");

        String expectedOutput = "Student [id=9223372036854775807, name=John, passportNumber=AB123456]";
        String actualOutput = student.toString();

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}