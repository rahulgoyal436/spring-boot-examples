package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Student_getIdTest {

    @Mock
    private Student student;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        student = new Student();
        student.setId(1L);
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 1L;
        Long actualId = student.getId();
        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    public void testGetIdFailure() {
        Long expectedId = 2L;
        Long actualId = student.getId();
        Assertions.assertNotEquals(expectedId, actualId);
    }

    @Test
    public void testGetIdNull() {
        student.setId(null);
        Long actualId = student.getId();
        Assertions.assertNull(actualId);
    }

    @Entity
    public static class Student {
        @Id
        @GeneratedValue
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}