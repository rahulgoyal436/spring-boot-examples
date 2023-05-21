package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student(1L, "John Doe", "AB123456");
    }

    @Test
    @DisplayName("Test get id")
    public void testGetId() {
        Assertions.assertEquals(1L, student.getId());
    }

    @Test
    @DisplayName("Test get name")
    public void testGetName() {
        Assertions.assertEquals("John Doe", student.getName());
    }

    @Test
    @DisplayName("Test get passport number")
    public void testGetPassportNumber() {
        Assertions.assertEquals("AB123456", student.getPassportNumber());
    }

    // TODO: Add more test cases for edge cases, error handling, and other scenarios
}