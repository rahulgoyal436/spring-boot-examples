package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Student_getId68eb246cfdTest {

    @Test
    public void test_getId_success() {
        // Given
        Long id = 1L;

        // When
        Long actualId = new Student().getId();

        // Then
        assertEquals(id, actualId);
    }

    @Test
    public void test_getId_failure() {
        // Given
        Long id = 1L;

        // When
        Long actualId = new Student().getId();

        // Then
        assertNotEquals(id + 1, actualId);
    }
}