package lesson_7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

  public static void main(String[] args) {
    Map<Integer,String> map = new HashMap<>();
    map.put(1,"Ali");
    map.put(2,"G'ani");
    map.put(3,"Vali");

    map.get(1);

    Set<Integer> integers = map.keySet();
    System.out.println(integers);
    /*for (Integer integer : integers) {
      System.out.println(integer);

    }*/

    Collection<String> values = map.values();
    System.out.println(values);
    /*for (String value : values) {
      System.out.println(value);
    }*/


  }

}
