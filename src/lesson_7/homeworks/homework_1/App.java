package lesson_7.homeworks.homework_1;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MapTest<Integer, Car> mapTest = new MapTest<>();
    mapTest.put(1000,new Car("Mers","black","mers"));
    mapTest.put(2000,new Car("Mers","white","mers"));
    mapTest.put(1500,new Car("BMW","black","bmw"));
    mapTest.put(3000,new Car("AUDI","black","audi"));
    mapTest.put(5000,new Car("Mers","black","mers"));

    System.out.print("Enter price of car: ");
    int price = sc.nextInt();
  }




}
