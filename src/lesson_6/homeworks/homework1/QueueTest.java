package lesson_6.homeworks.homework1;

import java.util.Arrays;

public class QueueTest<T> {

  private Object[] array;
  private int size = 0;

  public QueueTest() {
    array = new Object[5];
  }

  public QueueTest(int capacity) {
    array = new Object[capacity];
  }

  public void add(T value) {
    if (size == array.length) {
      int newSize = array.length + array.length / 2;
      array = Arrays.copyOf(array, newSize);
    }
    array[size] = value;
    size++;
  }

  public T poll() {
    if (size == 0) {
      return null;
    }

    T old = (T) array[0];
    for (int i = 0; i < size-1; i++) {
      array[i] = array[i + 1];
    }
    size--;

    return old;
  }

  @Override
  public String toString() {
    return  Arrays.toString(array) ;
  }
}
