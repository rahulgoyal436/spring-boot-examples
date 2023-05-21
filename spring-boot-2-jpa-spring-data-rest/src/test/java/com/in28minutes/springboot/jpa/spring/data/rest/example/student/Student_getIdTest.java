package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Student_getIdTest {

    @InjectMocks
    private Student student;

    @Mock
    private Long id;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetId() {
        when(student.getId()).thenReturn(id);
        assertEquals(id, student.getId());
    }

    @Test
    public void testGetIdNull() {
        when(student.getId()).thenReturn(null);
        assertEquals(null, student.getId());
    }

    @Test
    public void testGetIdNegative() {
        when(student.getId()).thenReturn(-1L);
        assertEquals(Long.valueOf(-1L), student.getId());
    }
}