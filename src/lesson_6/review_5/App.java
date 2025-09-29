package lesson_6.review_5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {

  public static void main(String[] args) {
    Set<Student> students = new TreeSet<>(Comparator.comparing(Student::getName).thenComparingInt(Student::getAge));
    students.add(new Student("Ali",18));
    students.add(new Student("Vali",25));
    students.add(new Student("G'ani",30));
    students.add(new Student("Ali",20));

    for (Student student : students) {
      System.out.println(student);

    }

  }

}
