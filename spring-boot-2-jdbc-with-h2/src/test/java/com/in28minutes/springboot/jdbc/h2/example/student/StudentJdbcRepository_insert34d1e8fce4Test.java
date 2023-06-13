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
public class StudentJdbcRepository_insert34d1e8fce4Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void testInsert() {
        Student student = new Student("John Doe", "123456789");
        int rowsAffected = studentJdbcRepository.insert(student);
        assertEquals(1, rowsAffected);

        List<Student> students = studentJdbcRepository.findAll();
        assertNotNull(students);
        assertEquals(1, students.size());

        Student retrievedStudent = students.get(0);
        assertEquals(student.getId(), retrievedStudent.getId());
        assertEquals(student.getName(), retrievedStudent.getName());
        assertEquals(student.getPassportNumber(), retrievedStudent.getPassportNumber());
    }

    @Test
    public void testInsert_withNullStudent() {
        int rowsAffected = studentJdbcRepository.insert(null);
        assertEquals(0, rowsAffected);
    }

    private static class StudentRowMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setPassportNumber(rs.getString("passport_number"));
            return student;
        }
    }
}