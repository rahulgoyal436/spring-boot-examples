package com.in28minutes.springboot.rest.example.student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentResource_retrieveAllStudents20c77fb2dcTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testRetrieveAllStudents() {
        List<Student> students = restTemplate.getForObject("/students", List.class);
        assertNotNull(students);
        assertEquals(2, students.size());
    }
}