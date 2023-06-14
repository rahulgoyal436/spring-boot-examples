package com.in28minutes.springboot.jdbc.h2.example.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Student_Student82d9d7f0c2Test {

	@Test
	public void testStudent() {
		Student student = new Student("John Doe", "1234567890");
		assertEquals("John Doe", student.getName());
		assertEquals("1234567890", student.getPassportNumber());
	}
}