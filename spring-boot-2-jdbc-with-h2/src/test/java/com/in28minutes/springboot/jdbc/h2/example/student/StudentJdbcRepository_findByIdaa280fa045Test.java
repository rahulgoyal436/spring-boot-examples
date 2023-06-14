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
public class StudentJdbcRepository_findByIdaa280fa045Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void testFindById_Success() throws SQLException {
        // Given
        long id = 1L;
        String name = "John Doe";
        int age = 20;

        // When
        Student student = studentJdbcRepository.findById(id);

        // Then
        assertEquals(name, student.getName());
        assertEquals(age, student.getAge());
    }

    @Test
    public void testFindById_NotFound() throws SQLException {
        // Given
        long id = 100L;

        // When
        Student student = studentJdbcRepository.findById(id);

        // Then
        assertEquals(null, student);
    }
}