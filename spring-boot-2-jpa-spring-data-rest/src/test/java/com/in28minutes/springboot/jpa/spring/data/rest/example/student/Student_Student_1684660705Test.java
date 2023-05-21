package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentTest {

    @Test
    public void testConstructorSuccess() {
        Student student = new Student("John Doe", "ABC123");
        assertEquals("John Doe", student.getName());
        assertEquals("ABC123", student.getPassportNumber());
    }

    @Test
    public void testConstructorNullName() {
        Student student = new Student(null, "ABC123");
        assertEquals(null, student.getName());
        assertEquals("ABC123", student.getPassportNumber());
    }

    @Test
    public void testConstructorNullPassportNumber() {
        Student student = new Student("John Doe", null);
        assertEquals("John Doe", student.getName());
        assertEquals(null, student.getPassportNumber());
    }
}