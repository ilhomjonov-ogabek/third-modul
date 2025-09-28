package lesson_5.homeworks.homework3;

import java.util.TreeSet;

public class Comparator {

  public static void main(String[] args) {

    TreeSet<User> users = new TreeSet<User>();
    users.add(new User("Bobur","12324"));
    users.add(new User("Abror","12324"));
    users.add(new User("Abror","23244"));
    users.add(new User("Bobur","13324"));

    users.forEach(System.out::println);

  }
}
