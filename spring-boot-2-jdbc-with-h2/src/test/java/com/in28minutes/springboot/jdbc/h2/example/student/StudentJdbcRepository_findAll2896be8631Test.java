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
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@SqlGroup({
    @Sql(scripts = "/schema.sql"),
    @Sql(scripts = "/data.sql")
})
public class StudentJdbcRepository_findAll2896be8631Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void findAll_shouldReturnAllStudents() {
        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(2, students.size());
    }

    @Test
    public void findAll_shouldReturnStudentWithId1() {
        Student student = studentJdbcRepository.findAll().get(0);
        assertEquals(1, student.getId());
        assertEquals("John", student.getName());
    }

    @Test
    public void findAll_shouldReturnStudentWithId2() {
        Student student = studentJdbcRepository.findAll().get(1);
        assertEquals(2, student.getId());
        assertEquals("Jane", student.getName());
    }
}