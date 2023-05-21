package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Student_StudentTest {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeEach
    public void setup() {
        entityManagerFactory = Persistence.createEntityManagerFactory("StudentTest");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Test
    @DisplayName("Test if Student constructor works")
    public void testStudentConstructor() {
        Student student = new Student();
        Assertions.assertNotNull(student);
    }

    @Test
    @DisplayName("Test if Student is saved successfully")
    public void testSaveStudent() {
        Student student = new Student();
        student.setName("John");
        student.setAge(25);
        student.setEmail("john@example.com");

        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();

        Query query = entityManager.createQuery("SELECT s FROM Student s WHERE s.name = :name");
        query.setParameter("name", "John");
        Student savedStudent = (Student) query.getSingleResult();

        Assertions.assertEquals(student, savedStudent);
    }

    @Test
    @DisplayName("Test if Student with invalid email is not saved")
    public void testSaveStudentWithInvalidEmail() {
        Student student = new Student();
        student.setName("Jane");
        student.setAge(21);
        student.setEmail("invalidemail");

        entityManager.getTransaction().begin();
        try {
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            Assertions.assertTrue(e instanceof javax.persistence.PersistenceException);
        }

        Query query = entityManager.createQuery("SELECT s FROM Student s WHERE s.name = :name");
        query.setParameter("name", "Jane");

        Assertions.assertThrows(javax.persistence.NoResultException.class, () -> query.getSingleResult());
    }

    @Test
    @DisplayName("Test if Student is updated successfully")
    public void testUpdateStudent() {
        Student student = new Student();
        student.setName("Bob");
        student.setAge(30);
        student.setEmail("bob@example.com");

        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();

        Query query = entityManager.createQuery("SELECT s FROM Student s WHERE s.name = :name");
        query.setParameter("name", "Bob");
        Student savedStudent = (Student) query.getSingleResult();

        savedStudent.setAge(31);

        entityManager.getTransaction().begin();
        entityManager.merge(savedStudent);
        entityManager.getTransaction().commit();

        query.setParameter("name", "Bob");
        Student updatedStudent = (Student) query.getSingleResult();

        Assertions.assertEquals(31, updatedStudent.getAge());
    }

    @Test
    @DisplayName("Test if Student is deleted successfully")
    public void testDeleteStudent() {
        Student student = new Student();
        student.setName("Mary");
        student.setAge(22);
        student.setEmail("mary@example.com");

        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();

        Query query = entityManager.createQuery("SELECT s FROM Student s WHERE s.name = :name");
        query.setParameter("name", "Mary");
        Student savedStudent = (Student) query.getSingleResult();

        entityManager.getTransaction().begin();
        entityManager.remove(savedStudent);
        entityManager.getTransaction().commit();

        Assertions.assertThrows(javax.persistence.NoResultException.class, () -> query.getSingleResult());
    }

    @Test
    @DisplayName("Test if StudentNotFoundException is thrown when student is not found")
    public void testGetStudentByIdNotFound() {
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
        Mockito.when(studentRepository.findById(Mockito.anyLong())).thenReturn(null);

        StudentService studentService = new StudentService(studentRepository);

        Assertions.assertThrows(StudentNotFoundException.class, () -> studentService.getStudentById(1L));
    }

}