package lesson_5.homeworks.homework1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class App {

  public static void main(String[] args) {
    LinkedHashSet<Character> symbols = new LinkedHashSet<>();

    for (int i = 97; i <= 122; i++) {
      symbols.add((char)i);
    }

    symbols.forEach(System.out::println);
  }

}
