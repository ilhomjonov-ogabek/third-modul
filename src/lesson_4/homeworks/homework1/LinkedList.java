package lesson_4.homeworks.homework1;

import java.util.Collection;
import java.util.Objects;

public class LinkedList<T>{
  private Node<T> head;
  private int size;

  public void add( T element ) {
    var node = new Node<>( element );
    if ( head == null ) {
      head = node;
    }
    else {
      var current = head;
      while ( current.next != null ) {
        current = current.next;
      }
      current.next = node;
    }
    size++;
  }

  public boolean addAll(LinkedList<T> c) {
    for (var i = 0; i < c.size(); i++ ) {
      add(c.get(i));
    }
    return true;
  }

  public T get(int index){
    Objects.checkIndex(index,size);
    if(index == 0){
      return head.element;
    }
    var current = head;
    for (int i = 1; i <= index; i++) {
      current = current.next;
    }
    return current.element;
  }

  public T remove(int index){
    Objects.checkIndex(index,size);
    if(index == 0){
      var node = head;
      head = head.next;
      size--;
      return node.element;
    }

    var current = head;
    for (int i = 1; i < index; i++) {
      current = current.next;
    }
    var node = current.next;
    current.next = node.next;
    size--;
    return  node.element;
  }

  public int size(){
    return this.size;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("[");
    var current = head;
    builder.append( current.element );
    while ( current.next != null ) {
      current = current.next;
      builder.append(",");
      builder.append( current.element );
    }
    builder.append("]");
    return builder.toString();
  }

  static class Node<T> {
    T element;
    Node<T> next;

    public Node(T element) {
      this.element = element;
    }
  }



}
