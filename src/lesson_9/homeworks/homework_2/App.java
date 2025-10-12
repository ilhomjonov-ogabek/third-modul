package lesson_9.homeworks.homework_2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class App {

  public static void main(String[] args) {
    String[] names = new String[5];
    names[0] = "Vali";
    names[1] = "G'ani";
    names[2] = "Ali";
    names[3] = "Omad";
    names[4] = "Olim";
    List<String> namesList = Arrays.asList(names);
    Collections.shuffle(namesList);
    Collections.sort(namesList);
    System.out.println(namesList);
  }

}
