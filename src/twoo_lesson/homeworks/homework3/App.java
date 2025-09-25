package twoo_lesson.homeworks.homework3;

public class App {

  public static void main(String[] args) {
    ArrayListExample<String> list = new ArrayListExample<>(3);
    list.add("cat");
    list.add("dog");
    list.add("cat");
    list.add("dog");
    list.add("cat");
   /* System.out.println(list.get(2));
    System.out.println(list.get(122));*/
   // System.out.println(list.size());
    System.out.println(list.isEmpty());
    list.clear();
    System.out.println(list.isEmpty());
  }

}
