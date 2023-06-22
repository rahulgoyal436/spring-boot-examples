// Test generated by RoostGPT for test dummy-test using AI Model gpt

package com.in28minutes.springboot.jdbc.h2.example.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentJdbcRepository_findByIdaa280fa045Test {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private StudentJdbcRepository studentJdbcRepository;

    private RowMapper<Student> rowMapper;

    @BeforeEach
    public void setUp() {
        rowMapper = new BeanPropertyRowMapper<>(Student.class);
    }

    @Test
    public void testFindById_ExistingStudent() {
        // Prepare test data
        Student expectedStudent = new Student(1L, "John Doe", "john.doe@example.com");

        // Mock external service
        when(jdbcTemplate.queryForObject(
                eq("select * from student where id=?"),
                eq(rowMapper),
                eq(1L))
        ).thenReturn(expectedStudent);

        // Call the method to test
        Student actualStudent = studentJdbcRepository.findById(1L);

        // Assert the result
        assertEquals(expectedStudent, actualStudent);
    }

    @Test
    public void testFindById_NonExistingStudent() {
        // Prepare test data
        long nonExistingStudentId = 999L;

        // Mock external service
        when(jdbcTemplate.queryForObject(
                eq("select * from student where id=?"),
                eq(rowMapper),
                eq(nonExistingStudentId))
        ).thenReturn(null);

        // Call the method to test
        Student actualStudent = studentJdbcRepository.findById(nonExistingStudentId);

        // Assert the result
        assertEquals(null, actualStudent);
    }
}