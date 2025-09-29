package lesson_6.homeworks.homework1;

import java.util.ArrayDeque;
import java.util.Queue;

public class App {

  public static void main(String[] args) {
   /* Queue<Integer> nums = new ArrayDeque<>();
    nums.add(3);
    nums.add(14);
    nums.add(134);
    nums.add(132);
    nums.add(15);
    nums.add(19);
    nums.add(23);
    nums.add(67);
    nums.add(98);
    nums.add(11);
    nums.poll();
    nums.add(100);
    System.out.println(nums);*/


    QueueTest <Integer> nums = new QueueTest<>();
    nums.add(3);
    nums.add(14);
    nums.add(134);
    nums.add(132);
    nums.add(15);
    nums.add(19);
    nums.add(23);
    nums.add(67);
    nums.add(98);
    nums.add(11);
    System.out.println(nums.poll());
    nums.add(100);
    System.out.println(nums);




  }
}
