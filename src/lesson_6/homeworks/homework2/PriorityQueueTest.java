package lesson_6.homeworks.homework2;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

  public static void main(String[] args) {

    Queue<User> queue = new PriorityQueue<>();
    queue.add(new User("Ali","12343",3));
    queue.add(new User("Vali","987883",9));
    queue.add(new User("G'ani","12343",1));
    queue.add(new User("Ali","12456",2));
    System.out.println(queue);

  }


}
