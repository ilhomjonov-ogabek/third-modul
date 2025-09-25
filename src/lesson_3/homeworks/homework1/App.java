package lesson_3.homeworks.homework1;

import java.util.Random;

public class App {

  public static void main(String[] args) {
    NumbersList<Integer> list = new NumbersList<>();
    Random random = new Random();
    for (int i = 0; i < 30; i++) {
      list.add(random.nextInt(100) + 1);
    }

    System.out.println(list.get(5));
    System.out.println("");
    list.remove(5);
    list.printAll();
    System.out.println("");
    System.out.println(list.get(5));
    System.out.println(list.size());


  }

}
