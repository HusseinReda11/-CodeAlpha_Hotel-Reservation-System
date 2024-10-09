import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Hotel_System hotel = new Hotel_System();
        hotel.addRoom(new Room(101, "Single", 100));
        hotel.addRoom(new Room(102, "Double", 150));
        hotel.addRoom(new Room(103, "Suite", 200));
        hotel.addRoom(new Room(104, "Single", 90));
        hotel.addRoom(new Room(105, "Double", 160));
        hotel.addRoom(new Room(106, "Suite", 220));
int operation =0;
    System.out.println("Welcome to our Hotel System.");
while(operation != 3){
    System.out.println("Please enter a choice\n");
    System.out.println("1- View Available rooms in our Hotel");
    System.out.println("2- Make a reservation for a Hotel");
    System.out.println("3- Exit");
     operation = in.nextInt();
    switch(operation){
        case 1:
            hotel.print_rooms();
    break;

    case 2:
        System.out.print("Enter the number of room you need to book: ");
        int Number = in.nextInt();
        in.nextLine();
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your email: ");
        String email = in.next();
        System.out.print("Enter your phone number: ");
        int phone = in.nextInt();
        user_information user=new user_information(name,phone,email);
        hotel.bookRoom(Number,user);
        break;
        case 3:
            System.out.println("Thank you for using our Hotel System,Good Bye ! ");
            break;

        default:
            System.out.println("Please enter a valid choice<>");
    }
}
    }
}