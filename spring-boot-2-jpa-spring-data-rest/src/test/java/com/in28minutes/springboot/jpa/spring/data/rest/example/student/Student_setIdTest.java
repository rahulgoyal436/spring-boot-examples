package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Student_setIdTest {

    @Mock
    private Student student;

    @InjectMocks
    private StudentService studentService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetIdWithValidId() {
        Long id = 123L;
        student.setId(id);
        assertEquals(id, student.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIdWithNullId() {
        student.setId(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIdWithNegativeId() {
        Long id = -123L;
        student.setId(id);
    }
}