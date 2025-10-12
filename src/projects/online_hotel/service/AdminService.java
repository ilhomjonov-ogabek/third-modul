package projects.online_hotel.service;

import java.util.ArrayList;
import projects.online_hotel.dto.RoomDTO;
import projects.online_hotel.enam.RoomStatus;
import projects.online_hotel.entity.RoomEntity;
import projects.online_hotel.repository.HotelDataBase;

public class AdminService {
  HotelDataBase dataBase = HotelDataBase.getInstance();

  public ArrayList<RoomEntity> allRooms() {
    return dataBase.getRooms();
  }

  public void createRoom(RoomDTO newRoom) {
    RoomEntity roomEntity = new RoomEntity(newRoom.number(), newRoom.flour(), newRoom.capacity(), RoomStatus.FREE);
    dataBase.saveRoom(roomEntity);
  }

  public boolean removeRoom(Integer roomNumber) {
    return dataBase.deleteRoom(roomNumber);
  }

}
