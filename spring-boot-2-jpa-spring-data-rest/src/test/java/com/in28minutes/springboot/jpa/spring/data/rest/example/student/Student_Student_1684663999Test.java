package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_Student_1684663999Test {

    @Test
    public void testStudentConstructor() {
        Student student = new Student("John Doe", "123456789");
        assertEquals("John Doe", student.getName());
        assertEquals("123456789", student.getPassportNumber());
    }

    @Test
    public void testStudentConstructorWithNullName() {
        Student student = new Student(null, "123456789");
        assertEquals(null, student.getName());
        assertEquals("123456789", student.getPassportNumber());
    }

    @Test
    public void testStudentConstructorWithNullPassportNumber() {
        Student student = new Student("John Doe", null);
        assertEquals("John Doe", student.getName());
        assertEquals(null, student.getPassportNumber());
    }
}