import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("_________________________________________________________________");
        
        /*- 10 rooms (5 single rooms and 5 double rooms)
          - A hotel with name my hotel and has 10 room which are created*/
        
        Scanner o = new Scanner(System.in);
        System.out.print("The hotel Name is : ");
        String name = o.nextLine();
        System.out.print("The number of single rooms = ");
        int s = o.nextInt();
        SingleRoom Srooms[] = new SingleRoom[s];
        System.out.print("The number of double rooms = ");
        int d = o.nextInt();
        DoubleRoom Drooms[] = new DoubleRoom[d];
        int T = s + d;
        Room rooms[] = new Room[T];
        for (int i = 0; i < rooms.length; i++) {
            int roomNumber = i + 1;
            rooms[i] = new Rooma(roomNumber);
        }

        System.out.println("_________________________________________________________________");
        
        // Reserve room 1,3,5,10 and 6 if not reserved

        Hotel obj = new Hotel(name, rooms);
        System.out.print("How many rooms u wanna reserve ? : ");
        int U = o.nextInt();
        for (int i = 1; i <= U; i++) {
            System.out.print("Number of " + i + " is : ");
            int x = o.nextInt(); 
            if (x == 6) {
                if (rooms[5].IsReserved() == false) {
                    obj.reserveRoom(rooms[5]);
                }
            } else {
                obj.reserveRoom(rooms[x - 1]);
            }
        }

        System.out.println("_________________________________________________________________");
        
        // Reserve room 1, if is already reserved then reserve room 2

        System.out.print("U wanna reserve room number =  ");
        int a = o.nextInt();
        System.out.print("U can choose alternate room in case room number " + a + " is not available , so... : ");
        int b = o.nextInt();
        if (rooms[a-1].IsReserved() == true) {
            obj.reserveRoom(rooms[b-1]);
        }
        
        System.out.println("_________________________________________________________________");
        System.out.println(obj.getName());
        System.out.println(obj.isFull());
        System.out.println(rooms[6].getRoomNum());
        System.out.println(obj.getRooms());

    }
    
}
