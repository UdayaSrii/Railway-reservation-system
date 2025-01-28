import java.util.ArrayList;
import java.util.Scanner;
class Ticket {
    private String passengerName;
    private int trainNumber;
    private String destination;
    public Ticket(String passengerName, int trainNumber, String destination) {
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.destination = destination;
    }
    // Override toString method to display ticket details
    @Override
    public String toString() {
        return "Passenger Name: " + passengerName + ", Train Number: " + trainNumber + ", Destination: " + destination;
    }
}
// Create a class to manage train tickets
public class RailwayReservationSystem {
    private static ArrayList<Ticket> tickets = new ArrayList<>();
    public static void bookTicket(Scanner sc) {
        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();
        System.out.print("Enter train number: ");
        int trainNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter destination: ");
        String destination = sc.nextLine();
        Ticket ticket = new Ticket(name, trainNumber, destination);
        tickets.add(ticket);
        System.out.println("Ticket booked successfully!\n");
    }
    public static void viewTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet.\n");
        } else {
            System.out.println("Booked Tickets:");
            for (Ticket ticket : tickets) {
                System.out.println(ticket);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nRailway Reservation System");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            // Write a switch-case statement to handle user input
            switch (choice) {
                case 1:
                    bookTicket(sc);
                    break;
                case 2:
                    viewTickets();
                    break;
                case 3:
                    System.out.println("Thank you for using the Railway Reservation System. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}