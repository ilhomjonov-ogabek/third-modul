package lesson_6.queue_test;

import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueueExample {

  public static void main(String[] args) {
    Queue<Patient> patient = new PriorityQueue<>();
    patient.add(new Patient("Ali",20,6));
    patient.add(new Patient("Vali",40,5));
    patient.add(new Patient("G'ani",30,9));
    patient.add(new Patient("Asadbek",20,2));

    System.out.println(patient.peek());
    System.out.println(patient.poll());

    System.out.println(patient);

  }

}
