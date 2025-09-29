package lesson_5.leetCode;

import java.util.LinkedList;
import lesson_5.homeworks.homework3.User;

public class Problem1 {

  public static void main(String[] args) {
    LinkedList<Integer> nums1 = new LinkedList<Integer>();
    LinkedList<Integer> nums2 = new LinkedList<Integer>();
    nums1.add(1);
    nums1.add(2);
    nums1.add(3);
    nums2.add(1);
    nums2.add(2);
    nums2.add(3);

    LinkedList<Integer> nums3 = new LinkedList<>();
    for (int i = nums1.toArray().length; i <0 ; i--) {
      nums3.addAll(nums1);
      System.out.println(nums3);


    }

  }

}
