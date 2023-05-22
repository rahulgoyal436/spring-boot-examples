package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Entity
public class Student_getIdTest {

    @Mock
    private Student student;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetIdWhenIdIsNull() {
        student.setId(null);
        assertEquals(null, student.getId());
    }

    @Test
    public void testGetIdWhenIdIsNotNull() {
        Long id = 100L;
        student.setId(id);
        assertEquals(id, student.getId());
    }

    @Test
    public void testGetIdWhenIdIsNegative() {
        Long id = -100L;
        student.setId(id);
        assertEquals(id, student.getId());
    }
}