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
public class StudentJdbcRepository_deleteById29a6c3df2fTest {

	@Autowired
	private StudentJdbcRepository studentJdbcRepository;

	@Test
	public void testDeleteById() {
		studentJdbcRepository.deleteById(1L);
		List<Student> students = studentJdbcRepository.findAll();
		assertEquals(0, students.size());
	}

	@Test
	public void testDeleteById_NotFound() {
		studentJdbcRepository.deleteById(999L);
		List<Student> students = studentJdbcRepository.findAll();
		assertEquals(1, students.size());
	}

	private static final class StudentRowMapper implements RowMapper<Student> {

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setId(rs.getLong("id"));
			student.setName(rs.getString("name"));
			return student;
		}
	}
}