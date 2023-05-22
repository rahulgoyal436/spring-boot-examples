package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class Student_Student_1684743217Test {

    @InjectMocks
    private StudentController studentController;

    @Mock
    private StudentRepository studentRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateStudent() {
        Student student = new Student(1L, "John Doe", "ABC123");
        when(studentRepository.save(student)).thenReturn(student);
        Student result = studentController.createStudent(student);
        Assertions.assertEquals(student, result);
    }

    @Test
    public void testGetStudentById() {
        Student student = new Student(1L, "John Doe", "ABC123");
        when(studentRepository.findById(1L)).thenReturn(java.util.Optional.of(student));
        Student result = studentController.getStudentById(1L);
        Assertions.assertEquals(student, result);
    }

    @Test
    public void testDeleteStudent() {
        Student student = new Student(1L, "John Doe", "ABC123");
        when(studentRepository.findById(1L)).thenReturn(java.util.Optional.of(student));
        studentController.deleteStudent(1L);
        when(studentRepository.findById(1L)).thenReturn(java.util.Optional.empty());
        Assertions.assertThrows(ResourceNotFoundException.class, () -> {
            studentController.getStudentById(1L);
        });
    }
}