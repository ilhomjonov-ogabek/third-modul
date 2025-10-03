package lesson_7.homeworks.homework_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class MapTest<K,V> {
  private Object[]  keys;
  private Object[] values;
  int index = 0;

  public MapTest(int capacity) {
    keys = new Object[capacity];
    values = new Object[capacity];
  }

  public MapTest() {
    keys = new Object[10];
    values = new Object[10];
  }

  public void printCars(int price) {
    for (int i = 0; i < index; i++) {

    }
  }


  public void put(K key,V value){
    if(index == keys.length){
      int newCapacity = keys.length*2;
      keys = Arrays.copyOf(keys,newCapacity);
      values = Arrays.copyOf(values,newCapacity);
    }
    keys[index++] = key;
    values[index++] = value;
  }





}
