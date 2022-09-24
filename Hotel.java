public class Hotel {
    private String name;
    private Room[] rooms;
    private int reserved = 0;
    
    
    public Hotel(String name, Room[] rooms) {
        this.name = name;
        this.rooms = rooms;
    }
    
    public String getName() { 
        return name;
    }

    public Room[] getRooms() {
        System.out.print("[");

        for (int i = 0; i < rooms.length; i++) {
            System.out.print(rooms[i].roomNumber);
            System.out.print(",");

        }
        System.out.println("]");
        return rooms;
    }

    public boolean isFull() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].IsReserved() == true) {
                reserved++;
            }
        }
        if (reserved == rooms.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean reserveRoom(Room room) {
        if (room.IsReserved() == false) {
            room.setReserved(true);
            return true;
        } else {
            return false;
        }
    }
    

}
