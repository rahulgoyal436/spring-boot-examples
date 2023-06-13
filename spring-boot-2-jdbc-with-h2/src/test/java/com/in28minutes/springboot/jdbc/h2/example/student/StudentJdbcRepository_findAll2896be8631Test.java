package com.in28minutes.springboot.jdbc.h2.example.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StudentJdbcRepository_findAll2896be8631Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void findAll_whenNoStudentRecord_shouldReturnEmptyList() {
        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(0, students.size());
    }

    @Test
    public void findAll_whenOneStudentRecord_shouldReturnOneStudent() {
        Student student = new Student("John Doe", 1234567890);
        studentJdbcRepository.save(student);

        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(1, students.size());
        assertEquals(student, students.get(0));
    }
}