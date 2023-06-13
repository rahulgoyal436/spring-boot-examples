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
public class StudentJdbcRepository_update40cb1dc622Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void testUpdate() {
        Student student = new Student("John", "1234567890");
        studentJdbcRepository.save(student);

        student.setName("Jane");
        studentJdbcRepository.update(student);

        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(1, students.size());
        assertEquals("Jane", students.get(0).getName());
    }

    @Test
    public void testUpdateNonExistingStudent() {
        Student student = new Student("John", "1234567890");
        int rowsUpdated = studentJdbcRepository.update(student);
        assertEquals(0, rowsUpdated);
    }
}