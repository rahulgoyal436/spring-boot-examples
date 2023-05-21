package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class Student_getNameTest {

    @Mock
    private Student student;

    @InjectMocks
    private StudentService studentService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetNameSuccess() {
        when(student.getName()).thenReturn("John Doe");
        String name = studentService.getName();
        Assertions.assertEquals("John Doe", name);
    }

    @Test
    public void testGetNameNull() {
        when(student.getName()).thenReturn(null);
        String name = studentService.getName();
        Assertions.assertNull(name);
    }

    @Test
    public void testGetNameEmpty() {
        when(student.getName()).thenReturn("");
        String name = studentService.getName();
        Assertions.assertEquals("", name);
    }
}