package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class Student_StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    public void testStudentConstructor() {
        assertNotNull(student);
    }

    @Test
    public void testStudentSuperConstructor() {
        assertEquals(Object.class, student.getClass().getSuperclass());
    }

    @Test
    public void testStudentId() {
        assertNull(student.getId());
    }

}