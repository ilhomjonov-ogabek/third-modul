package lesson_5.homeworks.homework3;

public class User implements Comparable<User> {

  private String name;
  private String phone;

  public User(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }


  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", phone='" + phone + '\'' +
        '}';
  }

  @Override
  public int compareTo(User o) {
    if (this.name.compareTo(o.name)==0) {
      return this.phone.compareTo(o.phone);

    }
    return this.name.compareTo(o.name);
  }
}
