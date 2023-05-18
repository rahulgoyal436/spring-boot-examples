package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class Student_StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testStudentCreation() {
        assertNotNull(student, "Student object should not be null");
    }

    @Test
    public void testStudentIdDefaultValue() {
        assertNull(student.getId(), "Student ID should be null by default");
    }

    @Test
    public void testStudentNameDefaultValue() {
        assertNull(student.getName(), "Student name should be null by default");
    }
}
