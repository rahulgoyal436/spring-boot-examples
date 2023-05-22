package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Student_setIdTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSetId_Success() {
        Long id = 1L;
        student.setId(id);
        Assertions.assertEquals(id, student.getId());
    }

    @Test
    public void testSetId_NullId() {
        Long id = null;
        student.setId(id);
        Assertions.assertNull(student.getId());
    }

    @Test
    public void testSetId_NegativeId() {
        Long id = -1L;
        student.setId(id);
        Assertions.assertEquals(id, student.getId());
    }
}