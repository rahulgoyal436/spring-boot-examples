package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class Student_Student_1684663141Test {

    @Test
    public void testConstructorWithValidInputs() {
        String name = "John Doe";
        String passportNumber = "AB123456";
        Student student = new Student(name, passportNumber);
        assertEquals(name, student.getName());
        assertEquals(passportNumber, student.getPassportNumber());
    }

    @Test
    public void testConstructorWithEmptyName() {
        String name = "";
        String passportNumber = "AB123456";
        assertThrows(IllegalArgumentException.class, () -> new Student(name, passportNumber));
    }

    @Test
    public void testConstructorWithEmptyPassportNumber() {
        String name = "John Doe";
        String passportNumber = "";
        assertThrows(IllegalArgumentException.class, () -> new Student(name, passportNumber));
    }
}