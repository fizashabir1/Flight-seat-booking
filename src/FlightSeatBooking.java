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
}
public class FlightSeatBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSeats = 5;
        int seats[] = new int[totalSeats];
        LinkedList<Passenger> list = new LinkedList<>();
        int choice;
        do {
            System.out.println("\n Flight Seat Booking System ");
            System.out.println("1. Book Seat");
            System.out.println("2. Cancel Seat");
            System.out.println("3. Show Passengers");
            System.out.println("4. Search Passenger");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
        } while (choice != 5);
        if (choice == 1) {
            System.out.print("Enter Passenger ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Enter Passenger Name: ");
            String name = input.nextLine();
            System.out.print("Enter Seat Number (1-5): ");
            int seatNo = input.nextInt();
            if (seatNo < 1 || seatNo > totalSeats) {
                System.out.println("Invalid Seat Number!");
            }
            else {
                if (seats[seatNo - 1] == 1) {
                    System.out.println("Seat Already Booked!");
                }
                else {
                    seats[seatNo - 1] = 1;
                    Passenger p = new Passenger(id, name, seatNo);
                    list.add(p);
                    System.out.println("Seat Booked Successfully!");
                }
            }
        }else if (choice == 2) {
            System.out.print("Enter Seat Number to Cancel: ");
            int seatNo = input.nextInt();
            boolean found = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).seatNo == seatNo) {
                    list.remove(i);
                    seats[seatNo - 1] = 0;
                    found = true;
                    System.out.println("Booking Cancelled!");
                    break;
                }
            }
            if (!found) {
                System.out.println("Seat Not Found!");
            }else if (choice == 3) {

                if (list.isEmpty()) {
                    System.out.println("No Bookings Yet!");
                }
                else {

                    System.out.println("\n--- Passenger List ---");

                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).display();
                    }
                }
            }

        }
    }
}