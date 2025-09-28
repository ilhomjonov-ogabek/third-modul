package lesson_5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

  public static void main(String[] args) {

    Student student = new Student("Ali","Aliyev",20);
    Student student2 = new Student("Ali","Aliyev",20);

    Set<Student> set = new HashSet<>();
    set.add(student);
    set.add(student2);

    System.out.println(student.hashCode());
    System.out.println(student2.hashCode());

    for (Student s : set) {
      System.out.println(s.toString());

    }
    NavigableSet<Student> navigableSet = new TreeSet<>();

    HashSet<Student> hashSet = new HashSet<>();

    LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
  }

}
