public class SingleRoom extends Room {
    
    public SingleRoom(int n) {
        super(n);
        roomNumber = n;
    }

    public double getPrice() {
        return 200;
    }
}
