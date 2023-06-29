package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentNotFoundException_StudentNotFoundExceptionddad8dc0e6Test {

    @Test
    public void testStudentNotFoundException() {
        // Arrange
        String exception = "Student not found";

        // Act
        StudentNotFoundException studentNotFoundException = new StudentNotFoundException(exception);

        // Assert
        assertEquals(exception, studentNotFoundException.getMessage());
        assertEquals(HttpStatus.NOT_FOUND, studentNotFoundException.getStatus());
    }
}