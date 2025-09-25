package twoo_lesson.homeworks.homework2;

public class Animal { private String name;
  private String color;
  public Animal(String name, String color) {
    this.name = name;
    this.color = color;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return" , "+
        "name='" + name + '\'' +
        ", color='" + color + '\'';
  }
}
