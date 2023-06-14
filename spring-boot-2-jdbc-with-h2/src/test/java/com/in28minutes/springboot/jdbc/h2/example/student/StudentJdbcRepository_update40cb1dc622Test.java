package com.in28minutes.springboot.jdbc.h2.example.student;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
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

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void setup() {
        jdbcTemplate.execute("delete from student");
    }

    @Test
    public void testUpdate() throws SQLException {
        studentJdbcRepository.save(new Student("John", "123456"));
        int rowsUpdated = studentJdbcRepository.update(new Student("Jane", "654321"));
        assertEquals(1, rowsUpdated);

        List<Student> students = jdbcTemplate.query("select * from student", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("passport_number"));
            }
        });

        assertEquals(1, students.size());
        assertEquals("Jane", students.get(0).getName());
        assertEquals("654321", students.get(0).getPassportNumber());
    }
}