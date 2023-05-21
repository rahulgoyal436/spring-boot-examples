
```
package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Student_setIdTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSetIdWithValidId() {
        Long id = 1L;
        student.setId(id);
        Assertions.assertEquals(id, student.getId(), "setId should set the correct id");
    }

    @Test
    public void testSetIdWithNull() {
        student.setId(null);
        Assertions.assertNull(student.getId(), "setId with null should set id to null");
    }

    @Test
    public void testSetIdWithNegativeId() {
        Long id = -1L;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            student.setId(id);
        }, "setId with negative id should throw IllegalArgumentException");
    }
}
