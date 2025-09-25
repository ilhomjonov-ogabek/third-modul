package twoo_lesson.homeworks.homework1;

public class CompareTo {

  public static void main(String[] args) {
    System.out.println(compare("a", "b"));
    System.out.println(compare(12, 12));
    System.out.println(compare(5.2, 1.2));

  }

  public static<T extends Comparable<T>> int compare(T a, T b) {
    return a.compareTo(b);
  }

}
