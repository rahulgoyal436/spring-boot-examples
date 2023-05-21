package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Student_setNameTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSetName() {
        student.setName("John");
        Assertions.assertEquals("John", student.getName());
    }

    @Test
    public void testSetNameNull() {
        student.setName(null);
        Assertions.assertNull(student.getName());
    }

    @Test
    public void testSetNameEmpty() {
        student.setName("");
        Assertions.assertEquals("", student.getName());
    }
}