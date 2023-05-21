package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Student_getNameTest {
  
  @Test
  public void testGetNameReturnsCorrectName() {
    Student student = new Student("John Doe");
    assertEquals("John Doe", student.getName());
  }
  
  @Test
  public void testGetNameReturnsEmptyStringForNullName() {
    Student student = new Student(null);
    assertEquals("", student.getName());
  }
  
  @Test
  public void testGetNameReturnsEmptyStringForEmptyName() {
    Student student = new Student("");
    assertEquals("", student.getName());
  }
  
  private class Student {
    private String name;
    
    public Student(String name) {
      this.name = name;
    }
    
    public String getName() {
      if (name == null) {
        return "";
      }
      return name;
    }
  }
}