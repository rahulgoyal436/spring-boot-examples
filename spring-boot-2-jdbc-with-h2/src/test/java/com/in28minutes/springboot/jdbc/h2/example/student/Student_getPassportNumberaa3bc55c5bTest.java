package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Student_getPassportNumberaa3bc55c5bTest {

    @Test
    public void test_getPassportNumber_with_valid_passport_number() {
        // Arrange
        String expectedPassportNumber = "1234567890";
        Student student = new Student();
        student.setPassportNumber(expectedPassportNumber);

        // Act
        String actualPassportNumber = student.getPassportNumber();

        // Assert
        assertEquals(expectedPassportNumber, actualPassportNumber);
    }

    @Test
    public void test_getPassportNumber_with_invalid_passport_number() {
        // Arrange
        String invalidPassportNumber = "123456789";
        Student student = new Student();
        student.setPassportNumber(invalidPassportNumber);

        // Act
        String actualPassportNumber = student.getPassportNumber();

        // Assert
        assertNull(actualPassportNumber);
    }
}