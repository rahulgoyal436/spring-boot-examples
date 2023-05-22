package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Student_Student_1684743015Test {

    @Test
    public void testConstructorWithValidInputShouldCreateStudentObject() {
        Long id = 1L;
        String name = "John Doe";
        String passportNumber = "AB123456";
        Student student = new Student(id, name, passportNumber);
        assertEquals(id, student.getId());
        assertEquals(name, student.getName());
        assertEquals(passportNumber, student.getPassportNumber());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullNameShouldThrowNullPointerException() {
        Long id = 1L;
        String name = null;
        String passportNumber = "AB123456";
        new Student(id, name, passportNumber);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyPassportNumberShouldThrowIllegalArgumentException() {
        Long id = 1L;
        String name = "John Doe";
        String passportNumber = "";
        new Student(id, name, passportNumber);
    }
}