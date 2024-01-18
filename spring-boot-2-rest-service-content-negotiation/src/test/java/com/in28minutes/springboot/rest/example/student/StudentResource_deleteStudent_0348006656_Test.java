/*
Test generated by RoostGPT for test rahul-local-test using AI Type Open AI and AI Model gpt-4

1. **Scenario:** Delete Existing Student

   **Test Case:** Provide a valid student id which exists in the database. The deleteStudent function should successfully delete the student record from the database. Verify if the student is deleted from the database.

2. **Scenario:** Delete Non-Existing Student

   **Test Case:** Provide a student id which does not exist in the database. The deleteStudent function should handle this gracefully and should not cause any exceptions or errors. 

3. **Scenario:** Delete Student with Invalid ID 

   **Test Case:** Provide an invalid student id (like a negative number, zero, or a string). The deleteStudent function should validate the input and handle this scenario gracefully. It should not cause any exceptions or errors.

4. **Scenario:** Delete Student with Null ID 

   **Test Case:** Provide a null value as student id. The deleteStudent function should validate the input and handle this scenario gracefully. It should not cause any exceptions or errors.

5. **Scenario:** Delete Student with Empty ID 

   **Test Case:** Provide an empty value as student id. The deleteStudent function should validate the input and handle this scenario gracefully. It should not cause any exceptions or errors.

6. **Scenario:** Delete Student without providing ID 

   **Test Case:** Do not provide a student id. The deleteStudent function should validate the input and handle this scenario gracefully. It should not cause any exceptions or errors.

7. **Scenario:** Delete Student concurrently

   **Test Case:** Try to delete the same student concurrently from two different processes. The deleteStudent function should handle this race condition gracefully.

8. **Scenario:** Delete Student after deleting once

   **Test Case:** Delete a student with a valid id, then try to delete the same student again. The deleteStudent function should handle this scenario gracefully, and should not cause any exceptions or errors.
*/
package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.EmptyResultDataAccessException;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class StudentResource_deleteStudent_0348006656_Test {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentResource studentResource;

    private static final long STUDENT_ID = 1L;

    @BeforeEach
    void setUp() {
        doNothing().when(studentRepository).deleteById(STUDENT_ID);
    }

    @Test
    public void testDeleteExistingStudent() {
        studentResource.deleteStudent(STUDENT_ID);
        verify(studentRepository).deleteById(STUDENT_ID);
    }

    @Test
    public void testDeleteNonExistingStudent() {
        doThrow(new EmptyResultDataAccessException(0)).when(studentRepository).deleteById(STUDENT_ID);
        studentResource.deleteStudent(STUDENT_ID);
        verify(studentRepository).deleteById(STUDENT_ID);
    }

    @Test
    public void testDeleteStudentWithInvalidId() {
        long invalidId = -1L;
        studentResource.deleteStudent(invalidId);
        verify(studentRepository).deleteById(invalidId);
    }

    @Test
    public void testDeleteStudentWithNullId() {
        Long nullId = null;
        studentResource.deleteStudent(nullId);
        verify(studentRepository).deleteById(nullId);
    }

    @Test
    public void testDeleteStudentWithoutProvidingId() {
        studentResource.deleteStudent(0);
        verify(studentRepository).deleteById(0L);
    }
}
