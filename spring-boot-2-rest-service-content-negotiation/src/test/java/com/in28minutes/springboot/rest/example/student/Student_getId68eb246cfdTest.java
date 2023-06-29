package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Student_getId68eb246cfdTest {

    @Test
    public void test_getId_success() {
        // Arrange
        Long id = 1L;

        // Act
        Long actualId = new Student().getId();

        // Assert
        assertEquals(id, actualId);
    }

    @Test
    public void test_getId_failure() {
        // Arrange
        Long id = 1L;

        // Act
        Long actualId = new Student().getId();

        // Assert
        assertNotEquals(id + 1, actualId);
    }
}