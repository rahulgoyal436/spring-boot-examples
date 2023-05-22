package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_Student_1684743044Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("John Doe", "AB123456");
    }

    @Test
    @DisplayName("Test for successful creation of Student object")
    public void testCreateStudent() {
        Assertions.assertEquals("John Doe", student.getName());
        Assertions.assertEquals("AB123456", student.getPassportNumber());
    }

    @Test
    @DisplayName("Test for null name parameter")
    public void testNullName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Student(null, "AB123456");
        });
    }

    @Test
    @DisplayName("Test for null passportNumber parameter")
    public void testNullPassportNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Student("John Doe", null);
        });
    }

    @Test
    @DisplayName("Test for empty name parameter")
    public void testEmptyName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Student("", "AB123456");
        });
    }

    @Test
    @DisplayName("Test for empty passportNumber parameter")
    public void testEmptyPassportNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Student("John Doe", "");
        });
    }
}