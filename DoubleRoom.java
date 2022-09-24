public class DoubleRoom extends Room {
    

    public DoubleRoom(int n) {
        super(n);
        roomNumber = n;
    }

    public double getPrice() {
        return 300;
    }
}
