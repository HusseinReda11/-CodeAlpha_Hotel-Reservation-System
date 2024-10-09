public class Room {
    private int room_number;
    private String room_type;
    private double price;
    private boolean available;
    public Room(int room_number, String room_type, double price) {
        this.room_number = room_number;
        this.room_type = room_type;
        this.price = price;
        this.available = true;
    }
    public int getRoom_number() {
        return room_number;
    }
    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }
    public String getRoom_type() {
        return room_type;
    }
    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return "About Room { " +
                "roomNumber = " + room_number +
                ", roomType='" + room_type + '\'' +
                ", price=" + price +
                ", isAvailable=" + available +
                " }";
    }
}

