package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class Student_StudentTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddStudentSuccess() {
        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setAge(25);
        when(studentRepository.save(student)).thenReturn(student);
        Student savedStudent = studentService.addStudent(student);
        assertEquals(student.getFirstName(), savedStudent.getFirstName());
        assertEquals(student.getLastName(), savedStudent.getLastName());
        assertEquals(student.getAge(), savedStudent.getAge());
    }

    @Test
    public void testAddStudentFailure() {
        Student student = new Student();
        student.setFirstName("Jane");
        student.setLastName("Doe");
        student.setAge(17);
        when(studentRepository.save(student)).thenReturn(null);
        Student savedStudent = studentService.addStudent(student);
        assertEquals(null, savedStudent);
    }

    @Test
    public void testAddStudentEdgeCase() {
        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setAge(0);
        when(studentRepository.save(student)).thenReturn(student);
        Student savedStudent = studentService.addStudent(student);
        assertEquals(student.getFirstName(), savedStudent.getFirstName());
        assertEquals(student.getLastName(), savedStudent.getLastName());
        assertEquals(student.getAge(), savedStudent.getAge());
    }
}