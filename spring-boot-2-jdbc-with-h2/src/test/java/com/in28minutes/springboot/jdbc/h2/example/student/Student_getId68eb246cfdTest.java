package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Student_getId68eb246cfdTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void test_getId_success() {
        Student student = new Student();
        student.setId(1L);
        studentRepository.save(student);

        Student foundStudent = studentRepository.findById(1L).get();
        assertEquals(1L, foundStudent.getId());
    }

    @Test
    public void test_getId_failure() {
        Student student = new Student();
        student.setId(1L);
        studentRepository.save(student);

        Student foundStudent = studentRepository.findById(2L).get();
        assertEquals(null, foundStudent);
    }