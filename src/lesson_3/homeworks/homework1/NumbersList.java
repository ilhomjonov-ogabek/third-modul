package lesson_3.homeworks.homework1;

import java.util.Random;

public class NumbersList <T extends Number>  {

  private  Object[] numbers = new Object[30];
  int index = 0;

  public void add(T number) {
    if (index != numbers.length) {
      numbers[index] = number;
      index++;
    }
  }

  public Object get(int index){
    return  numbers[index];
  }

  public void remove(int index){
    for (int i = index; i < this.index-1; i++) {
      numbers[i] = numbers[i+1];
    }
    this.index--;
  }

  public void printAll(){
    for(int i=0;i<this.index;i++){
      System.out.println(numbers[i]);
    }
  }
   public int size(){
    return this.index;
   }

}
