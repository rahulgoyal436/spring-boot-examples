package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_toStringTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
        student.setId(1L);
        student.setName("John Doe");
        student.setPassportNumber("AB123456");
    }

    @Test
    @DisplayName("Test toString() with valid data")
    public void testToStringWithValidData() {
        String expected = "Student [id=1, name=John Doe, passportNumber=AB123456]";
        Assertions.assertEquals(expected, student.toString());
    }

    @Test
    @DisplayName("Test toString() with null name")
    public void testToStringWithNullName() {
        student.setName(null);
        String expected = "Student [id=1, name=null, passportNumber=AB123456]";
        Assertions.assertEquals(expected, student.toString());
    }

    @Test
    @DisplayName("Test toString() with empty passport number")
    public void testToStringWithEmptyPassportNumber() {
        student.setPassportNumber("");
        String expected = "Student [id=1, name=John Doe, passportNumber=]";
        Assertions.assertEquals(expected, student.toString());
    }
}