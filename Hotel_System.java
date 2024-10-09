import java.util.ArrayList;
public class Hotel_System {
    private ArrayList<Room> rooms;
    public Hotel_System() {
        rooms = new ArrayList<>();
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public boolean bookRoom(int Number_of_room,user_information user) {
        for (Room room : rooms) {
            if (room.getRoom_number()==Number_of_room&&room.isAvailable()) {
                room.setAvailable(false);
                Reservation reservation=new Reservation(room,user);
                System.out.println("RESERVATION IS SUCCESSFUL");
                System.out.println(reservation);
                return true;
            }
        }
        System.out.println("Room not available..!");
            return false;
    }
    public void print_rooms(){
        System.out.println("Choose from Available rooms");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println(room);
            }
        }
    }

}
