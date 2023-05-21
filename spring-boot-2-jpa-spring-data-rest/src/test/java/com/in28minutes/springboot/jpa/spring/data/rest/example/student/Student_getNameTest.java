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
    public void init() {
        MockitoAnnotations.initMocks(this);
        student.setName("John");
    }

    @Test
    public void testGetNameSuccess() {
        when(studentService.getStudent()).thenReturn(student);
        Assertions.assertEquals("John", studentService.getStudent().getName());
    }

    @Test
    public void testGetNameNull() {
        when(studentService.getStudent()).thenReturn(null);
        Assertions.assertNull(studentService.getStudent().getName());
    }

    @Test
    public void testGetNameEmpty() {
        student.setName("");
        when(studentService.getStudent()).thenReturn(student);
        Assertions.assertEquals("", studentService.getStudent().getName());
    }
}
