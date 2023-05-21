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
public class Student_Student_1684663966Test {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateStudentSuccess() {
        Student student = new Student(1L, "John", "ABC123");
        when(studentRepository.save(student)).thenReturn(student);
        Student createdStudent = studentService.createStudent(student);
        assertEquals(student, createdStudent);
    }

    @Test
    public void testCreateStudentFailure() {
        Student student = new Student(1L, "John", "ABC123");
        when(studentRepository.save(student)).thenThrow(new RuntimeException());
        try {
            studentService.createStudent(student);
        } catch (Exception e) {
            assertEquals(RuntimeException.class, e.getClass());
        }
    }

    @Test
    public void testCreateStudentEdgeCases() {
        Student student = new Student(1L, "John", "ABC123");
        when(studentRepository.save(student)).thenReturn(null);
        try {
            studentService.createStudent(student);
        } catch (Exception e) {
            assertEquals(NullPointerException.class, e.getClass());
        }
    }
}