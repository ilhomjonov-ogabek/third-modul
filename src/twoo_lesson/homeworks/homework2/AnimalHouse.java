package twoo_lesson.homeworks.homework2;

public class AnimalHouse <T extends Animal> {
  private T animal;

  public AnimalHouse(T animal) {
    this.animal = animal;
  }

  public T getAnimal() {
    return animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }

  @Override
  public String toString() {
    return "{" +
        "animal=" + animal +
        '}';
  }
}
