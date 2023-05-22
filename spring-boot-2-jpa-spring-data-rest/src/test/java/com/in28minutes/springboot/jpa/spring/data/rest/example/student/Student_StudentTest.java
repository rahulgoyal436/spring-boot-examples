package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class Student_StudentTest {

    @InjectMocks
    private Student student;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testConstructor() {
        Student student = new Student();
        assertEquals("Student", student.getClass().getSimpleName());
    }

    @Test
    public void testSuperConstructor() {
        Student student = new Student();
        assertEquals("Object", student.getClass().getSuperclass().getSimpleName());
    }

    @Test
    public void testMockConstructor() {
        Student student = mock(Student.class);
        assertEquals("Student", student.getClass().getSimpleName());
    }
}