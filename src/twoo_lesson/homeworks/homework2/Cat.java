package twoo_lesson.homeworks.homework2;

public class Cat extends Animal{

  public Cat(String name, String color) {
    super(name, color);
  }

  @Override
  public String toString() {
    return "Cat"+super.toString();
  }
}
