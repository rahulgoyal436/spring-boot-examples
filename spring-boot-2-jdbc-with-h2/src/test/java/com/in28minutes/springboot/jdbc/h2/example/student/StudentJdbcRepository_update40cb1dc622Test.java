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
public class StudentJdbcRepository_update40cb1dc622Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void testUpdate() {
        // Given
        Student student = new Student();
        student.setName("John Doe");
        student.setPassportNumber("1234567890");

        // When
        int rowsAffected = studentJdbcRepository.update(student);

        // Then
        assertEquals(1, rowsAffected);

        // Verify that the student was updated in the database
        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(1, students.size());
        Student updatedStudent = students.get(0);
        assertEquals("John Doe", updatedStudent.getName());
        assertEquals("1234567890", updatedStudent.getPassportNumber());
    }
}