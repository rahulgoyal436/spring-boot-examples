package com.in28minutes.springboot.jdbc.h2.example.student;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentJdbcRepository_insert34d1e8fce4Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void testInsert() {
        // Given
        Student student = new Student();
        student.setId(1L);
        student.setName("John Doe");
        student.setPassportNumber("1234567890");

        // When
        int rowsAffected = studentJdbcRepository.insert(student);

        // Then
        assertEquals(1, rowsAffected);

        // Verify that the student was inserted into the database
        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(1, students.size());
        Student retrievedStudent = students.get(0);
        assertEquals(student.getId(), retrievedStudent.getId());
        assertEquals(student.getName(), retrievedStudent.getName());
        assertEquals(student.getPassportNumber(), retrievedStudent.getPassportNumber());
    }
}