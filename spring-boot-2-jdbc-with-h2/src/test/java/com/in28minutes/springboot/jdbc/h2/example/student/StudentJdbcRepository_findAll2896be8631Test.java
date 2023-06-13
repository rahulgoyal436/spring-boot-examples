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
public class StudentJdbcRepository_findAll2896be8631Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void findAll_whenNoStudents_thenReturnEmptyList() {
        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(0, students.size());
    }

    @Test
    public void findAll_whenOneStudent_thenReturnOneStudent() {
        Student student = new Student("John Doe", 1234567890);
        studentJdbcRepository.save(student);

        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(1, students.size());
        assertEquals(student, students.get(0));
    }

    private static class StudentRowMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Student(
                    rs.getString("name"),
                    rs.getLong("rollNumber")
            );
        }
    }
}