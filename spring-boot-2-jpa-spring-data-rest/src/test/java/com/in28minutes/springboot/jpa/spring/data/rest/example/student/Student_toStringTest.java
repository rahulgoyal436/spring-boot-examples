package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Student_toStringTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = mock(Student.class);
    }

    @Test
    public void testToStringSuccess() {
        when(student.getId()).thenReturn(1L);
        when(student.getName()).thenReturn("John Doe");
        when(student.getPassportNumber()).thenReturn("AB123456");

        String expected = "Student [id=1, name=John Doe, passportNumber=AB123456]";
        String actual = student.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testToStringFailure() {
        when(student.getId()).thenReturn(1L);
        when(student.getName()).thenReturn("John Doe");
        when(student.getPassportNumber()).thenReturn("AB123456");

        String expected = "Student [id=2, name=Jane Doe, passportNumber=CD789012]";
        String actual = student.toString();

        Assertions.assertNotEquals(expected, actual);
    }

    @Test
    public void testToStringEdgeCase() {
        when(student.getId()).thenReturn(Long.MAX_VALUE);
        when(student.getName()).thenReturn("");
        when(student.getPassportNumber()).thenReturn("");

        String expected = "Student [id=9223372036854775807, name=, passportNumber=]";
        String actual = student.toString();

        Assertions.assertEquals(expected, actual);
    }
}