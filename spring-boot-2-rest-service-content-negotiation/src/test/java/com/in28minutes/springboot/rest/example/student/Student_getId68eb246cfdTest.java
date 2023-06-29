// Test generated by RoostGPT for test rahul-unit-test-290623 using AI Model vertex

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Student_getId68eb246cfdTest {

    @Test
    public void test_getId_success() {
        // Arrange
        Long expectedId = 1L;
        Student student = new Student();
        student.setId(expectedId);

        // Act
        Long actualId = student.getId();

        // Assert
        assertEquals(expectedId, actualId);
    }

    @Test
    public void test_getId_failure() {
        // Arrange
        Long expectedId = 1L;
        Student student = new Student();

        // Act
        Long actualId = student.getId();

        // Assert
        assertNotEquals(expectedId, actualId);
    }
}