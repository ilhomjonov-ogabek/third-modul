package lesson_4.homeworks.homework2;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

    linkedList.add( 8 );
    linkedList.add( 3 );
    linkedList.add( 6 );
    linkedList.add( 9 );

    System.out.println(linkedList);
    /*Integer c = 6;
    linkedList.remove(c);
    System.out.println(linkedList);*/

    linkedList.set(1,5);
    System.out.println(linkedList);

    // addFirst() 👌
    // add( index, E ) 👌
    // getFirst() 👌
    // getLast() 👌
    // E remove( index ) 👌
    // boolean remove( Object ) 👌
    // set( index , E ) 👌










  }
}
