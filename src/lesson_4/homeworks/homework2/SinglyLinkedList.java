package lesson_4.homeworks.homework2;

import java.util.NoSuchElementException;
import java.util.Objects;

public class SinglyLinkedList<E> {

  private Node<E> head;
  private int size;


  public void addFirst( E element ) {
    Node<E> node = new Node<>(element);
    node.next = head;
    head = node;
    size++;
  }

  public void add( E element ) {
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

  public boolean add( int index , E element ) {
    Objects.checkIndex( index, size );
    if ( index == 0 ) {
      addFirst( element );
      return true;
    }
    var node = new Node<>(element);
    var current = head;
    for (int i = 1; i < index ; i++) {
      current = current.next;
    }
    node.next = current.next;
    current.next = node;
    size++;
    return true;
  }

  public E getFirst() {
    if ( head == null ) {
      throw  new NoSuchElementException("LinkedList is empty");
    }
    return head.element;
  }

  public E getLast() {
    if ( head==null ){
      throw new NoSuchElementException("LinkedList is null");
    }
    var current = head;
    while ( current.next != null ) {
      current = current.next;
    }
    return current.element;
  }

  public E get( int index ) {
    Objects.checkIndex( index , size );
    if ( index == 0 ) {
      return getFirst();
    }

    var current = head;

    for (int i = 1; i <= index; i++) { // i = 4
      current = current.next;
    }

    return current.element;
  }




  public E remove( int index ) {

    Objects.checkIndex(index, size);

    if ( index == 0 ) {
      var node = head;
      head = head.next;
      size--;
      return node.element;
    }

    var current = head;
    for (int i = 1; i < index ; i++) {
      current = current.next;
    }

    var node = current.next;
    current.next = current.next.next;
    size--;
    return node.element;
  }

  public boolean remove( E element ) {
    for ( int i = 0; i < size; i++ ) {
      if ( Objects.equals( element, this.get( i ) ) ) {
        remove( i );
        return true;
      }
    }
    return false;
  }

  public void set(int index, E element ) {
    Objects.checkIndex(index, size);
    if ( index == 0 ) {
      head.element = element;

    }else {
      var current = head;
      for (int i = 1; i <= index; i++) {
        current = current.next;
      }
      current.element = element;
    }

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

  static class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
      this.element = element;
    }
  }
}
