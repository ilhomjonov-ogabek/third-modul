package lesson_5;

import java.util.Objects;

public class Student {
  private String lastName;
  private String firstName;
  private int age;
  public Student(String lastName, String firstName, int age) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.age = age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.lastName, this.firstName, this.age);
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == null) return false;

    if(!(obj instanceof Student)) return false;

    Student student = (Student)obj;

    return (this.lastName.equals(student.lastName) && this.firstName.equals(student.firstName) && this.age == student.age);
  }

  @Override
  public String toString() {
    return "Student{" +
        "lastName='" + lastName + '\'' +
        ", firstName='" + firstName + '\'' +
        ", age=" + age +
        '}';
  }
}
