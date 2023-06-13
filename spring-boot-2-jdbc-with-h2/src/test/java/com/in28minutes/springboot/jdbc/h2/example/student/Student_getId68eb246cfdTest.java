package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Student_getId68eb246cfdTest {

    @Test
    public void test_getId_with_valid_id() {
        Student student = new Student();
        student.setId(1L);
        assertEquals(1L, student.getId());
    }

    @Test
    public void test_getId_with_null_id() {
        Student student = new Student();
        assertEquals(null, student.getId());
    }
}