package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Student_StudentTest {

    @Mock
    private Student student;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testStudentNotNull() {
        assertNotNull(student);
    }

    @Test
    public void testSuperConstructor() {
        assertEquals(Object.class, student.getClass().getSuperclass());
    }

    @Test
    public void testStudentConstructor() {
        Student student = new Student();
        assertNotNull(student);
    }
}