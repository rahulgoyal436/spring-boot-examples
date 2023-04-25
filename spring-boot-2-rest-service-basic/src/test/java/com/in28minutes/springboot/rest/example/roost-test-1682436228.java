import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

public class StudentResourceTest {

    @InjectMocks
    private StudentResource studentResource;

    @Mock
    private StudentRepository studentRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRetrieveAllStudents() {
        Student student1 = new Student(1L, "John", "Doe");
        Student student2 = new Student(2L, "Jane", "Doe");
        List<Student> students = Arrays.asList(student1, student2);

        when(studentRepository.findAll()).thenReturn(students);

        List<Student> result = studentResource.retrieveAllStudents();

        assertThat(result).isEqualTo(students);
    }

    @Test
    public void testRetrieveStudent() {
        Student student = new Student(1L, "John", "Doe");

        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));

        Student result = studentResource.retrieveStudent(1L);

        assertThat(result).isEqualTo(student);
    }

    @Test
    public void testDeleteStudent() {
        studentResource.deleteStudent(1L);

        assertThat(true).isTrue();
    }

    @Test
    public void testCreateStudent() {
        Student student = new Student(null, "John", "Doe");
        Student savedStudent = new Student(1L, "John", "Doe");

        when(studentRepository.save(student)).thenReturn(savedStudent);

        ResponseEntity<Object> response = studentResource.createStudent(student);

        assertThat(response.getStatusCodeValue()).isEqualTo(201);
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student(1L, "John", "Doe");

        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
        when(studentRepository.save(student)).thenReturn(student);

        ResponseEntity<Object> response = studentResource.updateStudent(student, 1L);

        assertThat(response.getStatusCodeValue()).isEqualTo(204);
    }
}