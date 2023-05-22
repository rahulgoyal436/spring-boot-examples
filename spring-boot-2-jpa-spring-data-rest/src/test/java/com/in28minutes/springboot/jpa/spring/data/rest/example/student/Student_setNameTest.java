package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class Student_setNameTest {

    @Mock
    private Student student;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetName() {
        student.setName("John");
        Assertions.assertEquals("John", student.getName());
    }

    @Test
    public void testSetName_Null() {
        student.setName(null);
        Assertions.assertNull(student.getName());
    }

    @Test
    public void testSetName_Empty() {
        student.setName("");
        Assertions.assertEquals("", student.getName());
    }
}