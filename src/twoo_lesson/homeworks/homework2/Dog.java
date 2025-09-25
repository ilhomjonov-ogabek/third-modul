package twoo_lesson.homeworks.homework2;

public class Dog extends Animal {
  public Dog(String name, String color) {
    super(name, color);
  }

  @Override
  public String toString() {
    return "Dog"+super.toString();
  }
}
