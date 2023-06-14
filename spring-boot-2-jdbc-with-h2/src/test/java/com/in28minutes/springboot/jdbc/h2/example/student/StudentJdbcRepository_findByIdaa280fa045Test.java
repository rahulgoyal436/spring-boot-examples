package com.in28minutes.springboot.jdbc.h2.example.student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        Student student = new Student("John Doe", 123);
        studentJdbcRepository.save(student);

        Student foundStudent = studentJdbcRepository.findById(student.getId());

        assertNotNull(foundStudent);
        assertEquals(student.getId(), foundStudent.getId());
        assertEquals(student.getName(), foundStudent.getName());
    }

    @Test
    public void testFindById_NotFound() throws SQLException {
        Student foundStudent = studentJdbcRepository.findById(123);

        assertNull(foundStudent);
    }
}