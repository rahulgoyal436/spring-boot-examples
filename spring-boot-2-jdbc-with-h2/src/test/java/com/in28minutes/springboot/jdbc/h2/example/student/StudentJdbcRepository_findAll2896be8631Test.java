package com.in28minutes.springboot.jdbc.h2.example.student;

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

import com.in28minutes.springboot.jdbc.h2.example.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentJdbcRepository_findAll2896be8631Test {

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    public void findAll_whenNoStudentInDB_shouldReturnEmptyList() {
        List<Student> students = studentJdbcRepository.findAll();
        assert(students.isEmpty());
    }

    @Test
    public void findAll_whenOneStudentInDB_shouldReturnListWithOneStudent() {
        Student student = new Student("John Doe", 1234567890);
        studentJdbcRepository.save(student);

        List<Student> students = studentJdbcRepository.findAll();
        assert(students.size() == 1);
        assert(students.get(0).getName().equals("John Doe"));
        assert(students.get(0).getRollNumber() == 1234567890);
    }
}