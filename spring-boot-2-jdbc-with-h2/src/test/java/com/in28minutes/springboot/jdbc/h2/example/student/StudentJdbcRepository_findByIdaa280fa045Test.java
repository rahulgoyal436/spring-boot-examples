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
    public void testFindById_whenStudentExists_thenReturnStudent() throws SQLException {
        // given
        long studentId = 1L;

        // when
        Student student = studentJdbcRepository.findById(studentId);

        // then
        assertNotNull(student);
        assertEquals(studentId, student.getId());
    }

    @Test
    public void testFindById_whenStudentDoesNotExist_thenReturnNull() throws SQLException {
        // given
        long studentId = 999L;

        // when
        Student student = studentJdbcRepository.findById(studentId);

        // then
        assertNull(student);
    }
}