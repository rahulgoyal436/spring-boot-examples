// The Student class should be in a separate file named Student.java
package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String passportNumber;

    public Student() {
    }

    public Student(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}

// Student_getIdTest.java
package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class Student_getIdTest {
    @Mock
    private Student student;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetId() {
        when(student.getId()).thenReturn(1L);
        Assertions.assertEquals(1L, student.getId());
    }

    @Test
    public void testGetId_Null() {
        when(student.getId()).thenReturn(null);
        Assertions.assertNull(student.getId());
    }

    @Test
    public void testSetId() {
        student.setId(2L);
        Assertions.assertEquals(2L, student.getId());
    }
}