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
public class StudentJdbcRepository_mapRowfa6dd4662aTest {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void testMapRow() throws SQLException {
		String sql = "SELECT id, name, passport_number FROM student WHERE id = 1";
		List<Student> students = jdbcTemplate.query(sql, new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getLong("id"));
				student.setName(rs.getString("name"));
				student.setPassportNumber(rs.getString("passport_number"));
				return student;
			}
		});

		assertNotNull(students);
		assertEquals(1, students.size());
		Student student = students.get(0);
		assertEquals(1L, student.getId());
		assertEquals("John Doe", student.getName());
		assertEquals("1234567890", student.getPassportNumber());
	}
}