package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Student_getIdTest {

    @Mock
    private Student student;

    @Test
    public void testGetId_Success() {
        when(student.getId()).thenReturn(1L);
        assertEquals(1L, student.getId());
    }

    @Test
    public void testGetId_Null() {
        when(student.getId()).thenReturn(null);
        assertEquals(null, student.getId());
    }

    @Test
    public void testGetId_Zero() {
        when(student.getId()).thenReturn(0L);
        assertEquals(0L, student.getId());
    }
}