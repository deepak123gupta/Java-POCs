package com.exmaple.Association;

// Room class
class Room {
    int roomNumber;

    Room(int number) {
        this.roomNumber = number;
    }

    void showRoomInfo() {
        System.out.println("Room Number: " + roomNumber);
    }
}

// House class (Composition)
class House {
    private Room room;

    House(int roomNumber) {
        // Strong ownership - Room created inside House
        this.room = new Room(roomNumber);
    }

    void showHouseInfo() {
        System.out.println("House Info:");
        room.showRoomInfo();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        House house = new House(101);
        house.showHouseInfo();

    }
}
