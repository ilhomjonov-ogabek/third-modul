package lesson_5.homeworks.homework2;

import java.util.TreeSet;
import lesson_5.Student;

public class App {

  public static void main(String[] args) {
    TreeSet<Integer> nums = new TreeSet<Integer>();
    for (int i = 10; i >=1; i--) {
      nums.add(i);
    }

    nums.forEach(System.out::println);
  }

}
