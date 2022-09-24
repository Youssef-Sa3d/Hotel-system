public abstract class Room {
    int roomNumber;
    boolean reserved;

    public Room(int n) {
        roomNumber = n;
    }
    
    public int getRoomNum() {
        return roomNumber;
    }

    public boolean IsReserved() {
        return reserved;
    }
    
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public abstract double getPrice();
    
}
