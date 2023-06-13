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
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
@Rollback
public class StudentJdbcRepository_update40cb1dc622Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void testUpdate() {
        // Given
        Student student = new Student("John", "123456789");
        studentJdbcRepository.save(student);

        // When
        student.setName("Jane");
        studentJdbcRepository.update(student);

        // Then
        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(1, students.size());
        assertEquals("Jane", students.get(0).getName());
    }
}