package lesson_3.homeworks.homework3;

import java.util.ArrayList;
import java.util.Random;

public class BookMain {

  public static void main(String[] args) {
    Random random = new Random();
    ArrayList<Book> list1 = new ArrayList<Book>();
    list1.add(new Book("Harry Potter",123));
    list1.add(new Book("Harry Potter2",1234));
    list1.add(new Book("Harry Potter3",465));
    list1.add(new Book("Harry Potter4",565));
    list1.add(new Book("Harry Potter5",673));

    ArrayList<Book> list2 = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      int index = random.nextInt(list1.size());
      list2.add(list1.get(index));
    }

    list1.removeAll(list2);
    list1.addAll(list2);

    System.out.println(list1);
    System.out.println(list2);


  }

}
