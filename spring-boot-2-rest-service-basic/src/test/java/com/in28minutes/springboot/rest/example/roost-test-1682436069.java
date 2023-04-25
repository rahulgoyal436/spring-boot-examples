import com.in28minutes.springboot.rest.example.student.StudentNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentNotFoundExceptionTest {

    @Test
    public void testStudentNotFoundException() {
        String exceptionMessage = "Student not found";
        StudentNotFoundException exception = new StudentNotFoundException(exceptionMessage);

        assertEquals(exceptionMessage, exception.getMessage());
    }

}