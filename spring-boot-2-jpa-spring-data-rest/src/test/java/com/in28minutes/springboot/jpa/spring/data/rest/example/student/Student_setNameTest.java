package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Student_setNameTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    void testSetName() {
        String name = "John Doe";
        student.setName(name);
        Assertions.assertEquals(name, student.getName());
    }

    @Test
    void testSetName_Null() {
        String name = null;
        student.setName(name);
        Assertions.assertNull(student.getName());
    }

    @Test
    void testSetName_Empty() {
        String name = "";
        student.setName(name);
        Assertions.assertEquals(name, student.getName());
    }
}