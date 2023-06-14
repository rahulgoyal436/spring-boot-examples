package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Student_getNamee79d2c9ab8Test {

    @Test
    public void testGetName_Success() {
        // Arrange
        String expectedName = "John Doe";
        Student student = new Student();
        student.setName(expectedName);

        // Act
        String actualName = student.getName();

        // Assert
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetName_Failure() {
        // Arrange
        String expectedName = "John Doe";
        Student student = new Student();

        // Act
        String actualName = student.getName();

        // Assert
        assertNotEquals(expectedName, actualName);
    }
}