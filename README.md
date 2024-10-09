# -CodeAlpha_Hotel-Reservation-System
Hotel Management System

This Java application simulates a hotel management system, allowing users to view available rooms and make reservations. It provides a simple command-line interface for interaction.
Features:

    Room Management: Predefined rooms with details such as room number, type, price, and availability.
    View Available Rooms: Users can view a list of currently available rooms.
    Room Booking: Users can book a room by providing personal information (name, email, phone).
    Reservation Confirmation: Displays a confirmation message along with reservation details.

How it Works:

    Initialization: The program initializes a hotel system with a set of predefined rooms.
    User Interaction: Users can choose to:
        View available rooms.
        Make a reservation by entering room details and personal information.
        Exit the application.
    Room Booking Logic: The program checks room availability and creates a reservation if the room is available.

Classes:

    Main: The main class that runs the hotel system.
    Room: Represents individual rooms with properties like room number, type, price, and availability status.
    user_information: Stores user details for booking.
    Reservation: Represents a reservation, linking a room with user information.
    Hotel_System: Manages the collection of rooms and handles booking logic.
