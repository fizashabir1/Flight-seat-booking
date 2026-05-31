import java.util.LinkedList;
import java.util.Scanner;
class Passenger {

    int id;
    String name;
    int seatNo;

    Passenger(int id, String name, int seatNo) {
        this.id = id;
        this.name = name;
        this.seatNo = seatNo;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Seat No: " + seatNo);
        System.out.println("-------------------");
    }

    public static void Flightseatbooking(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalSeats = 5;
        int[] seats = new int[totalSeats];

        LinkedList<Passenger> list = new LinkedList<>();

        int choice;
        do {

            System.out.println("\n===== Flight Seat Booking System =====");
            System.out.println("1. Book Seat");
            System.out.println("2. Cancel Seat");
            System.out.println("3. Show Passengers");
            System.out.println("4. Search Passenger");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = input.nextInt();
        }

    }
}
