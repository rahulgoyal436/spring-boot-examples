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
public class StudentJdbcRepository_insert34d1e8fce4Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void testInsert() throws SQLException {
        Student student = new Student("John Doe", "123456789");
        int rowsAffected = studentJdbcRepository.insert(student);
        assertEquals(1, rowsAffected);

        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(1, students.size());
        assertEquals(student, students.get(0));
    }

    @Test
    public void testInsert_duplicateKey() throws SQLException {
        Student student = new Student("John Doe", "123456789");
        studentJdbcRepository.insert(student);

        int rowsAffected = studentJdbcRepository.insert(student);
        assertEquals(0, rowsAffected);
    }

    private static final class StudentRowMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("passport_number"));
        }
    }
}