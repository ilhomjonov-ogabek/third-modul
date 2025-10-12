package projects.online_hotel.controller;

import projects.online_hotel.dto.RoomDTO;
import projects.online_hotel.enam.RoomStatus;
import projects.online_hotel.entity.RoomEntity;
import projects.online_hotel.service.AdminService;
import projects.online_hotel.utils.Util;

public class AdminController {
  private final AdminService service =  new AdminService();

  public void adminPage() {
    while (true) {
      System.out.println("""
          1.Show rooms
          2.Add room
          3.Remove room
          4.Show bookings
          0.Exit
          """);
      int menu = Util.getInt("Choose one");
      switch (menu) {
        case 1 -> {rooms();}
        case 2 -> {addRoom();}
        case 3 -> {removeRoom();}
        case 4 -> {allBookings();}
        case 0 -> {
          return;
        }

      }
    }

  }

  private void allBookings() {
    for (RoomEntity roomEntity : service.allRooms()) {
      if(roomEntity.getStatus().equals(RoomStatus.AVAILABLE)){
        System.out.println(roomEntity);
      }
    }
  }

  private void removeRoom() {
    rooms();
    Integer roomNumber = Util.getInt("Enter room number");
    System.out.println(service.removeRoom(roomNumber));

  }

  private void addRoom() {
    Integer flour =  Util.getInt("Choose flour");
    Integer roomCapacity = Util.getInt("Enter room capacity");
    RoomDTO newRoom = new RoomDTO(Util.roomNumber++,flour,roomCapacity);
    service.createRoom(newRoom);
  }

  private void rooms() {
    for (RoomEntity room : service.allRooms()) {
      System.out.println(room);
    }
  }

}
