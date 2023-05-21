package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Student_setNameTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    @DisplayName("Test setName with valid input")
    public void testSetNameWithValidInput() {
        String name = "John";
        student.setName(name);
        Assertions.assertEquals(name, student.getName());
    }

    @Test
    @DisplayName("Test setName with empty input")
    public void testSetNameWithEmptyInput() {
        String name = "";
        student.setName(name);
        Assertions.assertEquals(name, student.getName());
    }

    @Test
    @DisplayName("Test setName with null input")
    public void testSetNameWithNullInput() {
        String name = null;
        student.setName(name);
        Assertions.assertNull(student.getName());
    }
}