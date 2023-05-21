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
        student = mock(Student.class);
    }

    @Test
    public void testSetIdSuccess() {
        Long id = 1L;
        student.setId(id);
        Assertions.assertEquals(id, student.getId());
    }

    @Test
    public void testSetIdNull() {
        student.setId(null);
        Assertions.assertNull(student.getId());
    }

    @Test
    public void testSetIdNegative() {
        Long id = -1L;
        student.setId(id);
        Assertions.assertEquals(id, student.getId());
    }
}