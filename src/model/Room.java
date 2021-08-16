package model;

import java.util.regex.Pattern;

public class Room implements IRoom {
    String roomNumber;
    double price;
    RoomType roomType;
    boolean isFree;

    String regexRoomNumber = "\\d+";
    Pattern pattern = Pattern.compile(regexRoomNumber);

    public Room(String roomNumber, RoomType roomType, double price){
        if(!pattern.matcher(roomNumber).matches()){
            throw new IllegalArgumentException("Invalid room number");
        }
        this.roomNumber = roomNumber;
        this.price = price;

        this.roomType = roomType;
        this.isFree = true;
    }

    @Override
    public Double getRoomPrice() {
        return this.price;
    }

    @Override
    public RoomType getRoomType() {
        return this.roomType;
    }

    @Override
    public String getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public boolean isFree() {
        return this.isFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", roomType=" + roomType +
                '}';
    }
}
