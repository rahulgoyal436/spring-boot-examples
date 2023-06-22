// Test generated by RoostGPT for test dummy-test using AI Model gpt

package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Student_getNamee79d2c9ab8Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testGetName_WhenNameIsSet() {
        // TODO: Replace "John Doe" with a real name.
        String expectedName = "John Doe";
        student.setName(expectedName);

        String actualName = student.getName();

        Assertions.assertEquals(expectedName, actualName, "The name should match the expected value");
    }

    @Test
    public void testGetName_WhenNameIsNotSet() {
        String expectedName = null;

        String actualName = student.getName();

        Assertions.assertEquals(expectedName, actualName, "The name should be null when not set");
    }
}