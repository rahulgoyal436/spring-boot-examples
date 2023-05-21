package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_getNameTest {

    @Test
    public void testGetName() {
        Student student = new Student();
        student.setName("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetNameEmpty() {
        Student student = new Student();
        assertEquals("", student.getName());
    }

    @Test
    public void testGetNameNull() {
        Student student = new Student();
        student.setName(null);
        assertEquals(null, student.getName());
    }
}