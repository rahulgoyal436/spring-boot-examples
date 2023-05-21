import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Student_StudentTest {

  @Test
  public void testSuperConstructor() {
    Student student = new Student();
    assertEquals("Super constructor should initialize object correctly", student.getId(), null);
  }

  @Test
  public void testSetId() {
    Student student = new Student();
    student.setId(1L);
    assertEquals("Id should be set correctly", student.getId(), 1L);
  }

  @Test
  public void testEquals() {
    Student student1 = new Student();
    student1.setId(1L);
    Student student2 = new Student();
    student2.setId(1L);
    assertEquals("Equals should return true for two students with same id", student1.equals(student2), true);
  }
}