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
public class StudentJdbcRepository_update40cb1dc622Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void testUpdate() {
        Student student = new Student("John", "123456789");
        studentJdbcRepository.save(student);

        int rowsUpdated = studentJdbcRepository.update(student);
        assertEquals(1, rowsUpdated);

        List<Student> students = studentJdbcRepository.findAll();
        assertEquals(1, students.size());
        assertEquals(student.getName(), students.get(0).getName());
        assertEquals(student.getPassportNumber(), students.get(0).getPassportNumber());
    }

    @Test
    public void testUpdateNonExistingStudent() {
        Student student = new Student("John", "123456789");
        int rowsUpdated = studentJdbcRepository.update(student);
        assertEquals(0, rowsUpdated);
    }

    private static class StudentRowMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("passport_number"));
        }
    }
}