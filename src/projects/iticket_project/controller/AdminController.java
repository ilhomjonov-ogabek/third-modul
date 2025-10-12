package projects.iticket_project.controller;

import projects.iticket_project.utils.Util;

public class AdminController {

  public void adminPage() {
    while (true) {
      System.out.println("""
          1.Add consert
          2.Delete consert
          3.All conserts
          4.Selled tickets
          0,Exit
          """);
      int menu = Util.getInt("Choose one");
      switch (menu) {
        case 1 -> addConsert();
        case 2 -> deleteConsert();
        case 3 -> allConserts();
        case 4 -> selledTickets();
      }
    }

  }

  private void selledTickets() {

  }

  private void allConserts() {
    
  }

  private void deleteConsert() {
    
  }

  private void addConsert() {
    
    
  }
}
