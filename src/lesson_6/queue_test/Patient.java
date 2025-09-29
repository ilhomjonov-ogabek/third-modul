package lesson_6.queue_test;

public class Patient implements Comparable<Patient> {
  private String name;
  private int age;
  private int priority;

  public Patient(String name, int age,int priority) {
    this.name = name;
    this.age = age;
    this.priority = priority;
  }

  @Override
  public int compareTo(Patient o) {
    return Integer.compare(this.priority, o.priority);
  }



  @Override
  public String toString() {
    return "Patient{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }


}
