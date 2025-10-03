package lesson_7.homeworks.homework_1;

public class Car {
  private String name;
  private String color;
  private String model;

  public Car(String name, String color, String model) {
    this.name = name;
    this.color = color;
    this.model = model;
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

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return "Car{" +
        "name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}
