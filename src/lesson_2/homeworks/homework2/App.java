package lesson_2.homeworks.homework2;

public class App {

  public static void main(String[] args) {
    Cat Cat = new Cat("cat","black");
    AnimalHouse <Cat> cat = new AnimalHouse<Cat>(Cat);
    System.out.println(cat);

    Dog Dog = new Dog("dog","black");
    AnimalHouse<Dog> dog = new AnimalHouse<>(Dog);
    System.out.println(dog);
  }

}
