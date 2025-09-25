package lesson_4.homeworks.homework1;

public class App {

  public static void main(String[] args) {
    LinkedList<String> list1 = new LinkedList<>();
    list1.add("a");
    list1.add("b");
    list1.add("c");
    list1.add("d");
    list1.add("e");


    LinkedList<String> list2 = new LinkedList<>();
    list2.add("f");
    list2.add("g");
    list2.add("h");


    list1.addAll(list2);

    System.out.println(list1);
  }

}
