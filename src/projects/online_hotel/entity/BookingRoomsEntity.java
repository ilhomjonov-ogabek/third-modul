package projects.online_hotel.entity;

import java.time.LocalDate;

public class BookingRoomsEntity {
  private Integer roomNumber;
  private Integer userId;
  private String bookingDate;
  private boolean bookingCancel;


  public BookingRoomsEntity(Integer roomNumber, Integer userId, String bookingDate,
      boolean bookingCancel) {
    this.roomNumber = roomNumber;
    this.userId = userId;
    this.bookingDate = bookingDate;
    this.bookingCancel = bookingCancel;
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }

  public boolean isBookingCancel() {
    return bookingCancel;
  }

  public void setBookingCancel(boolean bookingCancel) {
    this.bookingCancel = bookingCancel;
  }


  @Override
  public String toString() {
    return "BookingRoomsEntity{" +
        "roomNumber=" + roomNumber +
        ", userId=" + userId +
        ", bookingDate=" + bookingDate +
        ", bookingCancel=" + bookingCancel +
        '}';
  }
}
