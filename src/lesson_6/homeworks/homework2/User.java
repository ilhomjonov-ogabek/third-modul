package lesson_6.homeworks.homework2;

public class User implements Comparable<User> {

  private String name;
  private String phone;
  private int priority;

  public User(String name, String phone, int priority) {
    this.name = name;
    this.phone = phone;
    this.priority = priority;
  }

  @Override
  public int compareTo(User o) {
    return Integer.compare(this.priority, o.priority);
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", phone='" + phone + '\'' +
        '}';
  }


}
