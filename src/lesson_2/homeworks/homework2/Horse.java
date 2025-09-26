package lesson_2.homeworks.homework2;

public class Horse extends Animal{
  public Horse(String name, String color) {
    super(name, color);
  }

  @Override
  public String toString() {
    return "Horse"+super.toString();
  }
}
