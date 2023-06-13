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
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Sql(scripts = { "/schema.sql", "/data.sql" })
@Rollback
public class StudentJdbcRepository_deleteById29a6c3df2fTest {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void testDeleteById() {
        studentJdbcRepository.deleteById(1L);
        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(1, students.size());
        assertEquals(2L, students.get(0).getId());
    }
}