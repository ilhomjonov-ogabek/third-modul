package twoo_lesson.homeworks.homework3;

import java.util.Arrays;

import java.util.Objects;

public class ArrayListExample<T> {

  private Object[] array;
  private int index = 0;
  //Unda add(element),remove(index),get(index),size(),clear(),isEmpty() methodlari bo'lsin


  public ArrayListExample() {
    array = new Object[10];
  }

  public ArrayListExample(int capacity) {
    array = new Object[capacity];
  }

  public void add(T e) {
   if (index == array.length) {
      int newLength = array.length + array.length / 2;
      array = Arrays.copyOf(array, newLength);
    }
    array[index++] = e;
  }

  public T get(int index) {
    Objects.checkIndex(index, this.index);
    return (T) array[index];
  }

  public int size() {
    return index ;
  }

  public void remove(int index) {
    Objects.checkIndex(index, this.index);
    for (int i = index; i < this.index; i++) {
      array[i] = array[i + 1];
    }
    this.index--;
  }

  public void clear() {
    for (int i = 0; i < this.index; i++) {
      array[i] = null;
    }
    this.index = 0;
  }

  public boolean isEmpty() {
    if (this.index == 0) {
      return true;
    }
    return false;
  }

  public void printAll() {
    for (int i = 0; i < this.index; i++) {
      System.out.println(array[i]);
    }
  }


}
