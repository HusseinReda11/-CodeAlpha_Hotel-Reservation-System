public class Reservation {
    Room room;
    user_information User ;
    public Reservation(Room room, user_information User) {
        this.room = room;
        this.User = User;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    @Override
    public String toString() {
        return "Reservation Information{" +
                "Room=" + room +
                ", User=" + User +
                '}';
    }
}
