package twoo_lesson.homeworks.homework2;

public class Sheep extends Animal{
  public Sheep(String name, String color) {
    super(name, color);
  }

  @Override
  public String toString() {
    return "Sheep"+super.toString();
  }
}
