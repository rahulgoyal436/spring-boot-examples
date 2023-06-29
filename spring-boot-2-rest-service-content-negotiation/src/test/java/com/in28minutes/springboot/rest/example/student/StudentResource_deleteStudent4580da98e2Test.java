package com.in28minutes.springboot.rest.example.student;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.springboot.rest.example.student.Student;
import com.in28minutes.springboot.rest.example.student.StudentNotFoundException;
import com.in28minutes.springboot.rest.example.student.StudentResource;
import com.in28minutes.springboot.rest.example.student.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentResource_retrieveAllStudents20c77fb2dcTest {

    @Autowired
    private StudentResource studentResource;

    @MockBean
    private StudentRepository studentRepository;

    @Test
    public void test_retrieveAllStudents() {
        // Arrange
        List<Student> students = Arrays.asList(new Student("Rahul", "Sharma"));
        when(studentRepository.findAll()).thenReturn(students);

        // Act
        List<Student> actualStudents = studentResource.retrieveAllStudents();

        // Assert
        assertNotNull(actualStudents);
        assertEquals(1, actualStudents.size());
        assertEquals("Rahul", actualStudents.get(0).getName());
        assertEquals("Sharma", actualStudents.get(0).getSurname());
    }
}