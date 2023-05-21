package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Student_Student_1684663549Test {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    private Student student;

    @Before
    public void setUp() {
        student = new Student(1L, "John Doe", "ABCD1234");
    }

    @Test
    public void testAddStudent() {
        when(studentRepository.save(student)).thenReturn(student);
        assertEquals(student, studentService.addStudent(student));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddStudentWithNull() {
        studentService.addStudent(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddStudentWithEmptyName() {
        student.setName("");
        studentService.addStudent(student);
    }
}