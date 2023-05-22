package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Student_getNameTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testGetName() {
        student.setName("John");
        Assertions.assertEquals("John", student.getName());
    }

    @Test
    public void testGetNameWithNull() {
        Assertions.assertNull(student.getName());
    }

    @Test
    public void testGetNameWithEmptyString() {
        student.setName("");
        Assertions.assertEquals("", student.getName());
    }
}