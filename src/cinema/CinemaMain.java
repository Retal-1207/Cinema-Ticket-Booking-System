/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

import java.util.Scanner;

/**
 *
 * @authors Retal Alkabawi 
 *          Shimaa Alhazmi, 
 *          Azizah Al-Ejayanm
 */
/**
 * Entry point of the cinema booking system. Demonstrates how to: Create and
 * sort a cinema catalog. Register customers and allow them to book movies or
 * shows. Check availability, clone customer data, and cancel bookings. Test
 * equality between movie objects.
 */
public class CinemaMain {

    /**
     * Main method to run the cinema booking system. Handles catalog creation,
     * customer login, booking process, ticket generation, availability checks,
     * cloning, and cancellation.
     *
     * @param args Command-line arguments.
     * @return void
     */
    public static void main(String[] args) {

        try {

            Cinema cinema = new Cinema();

            Movie m1 = new Movie(101, "Inception movie", "Christopher Nolan");
            Movie m2 = new Movie(102, "Dream movie", "John Nolan");
            Movie m3 = new Movie(103, "The life", "Max Nolan");
            Show s1 = new Show(201, "Stand-up Comedy Night show", "Hall A");
            Show s2 = new Show(209, "The moon show", "Hall E");

            cinema.addItem(m1);
            cinema.addItem(m2);
            cinema.addItem(m3);
            cinema.addItem(s1);
            cinema.addItem(s2);

            cinema.sortCatalog();

            System.out.println("\n The Sorted movies and shows catalog of the cinema depends on there ids:");

            for (int i = 0; i < cinema.catalog.size(); i++) {
                System.out.println(cinema.catalog.get(i));
            }

            System.out.println("-----------------------------------------");
            System.out.println("\n-Book a movie/show at The Star cinema-");

            Scanner sc = new Scanner(System.in);

            // First customer login and booking
            System.out.println("\nLogin");
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your ID: ");
            int id = sc.nextInt();

            Customer newCustomer = new Customer(id, name);
            cinema.registerCustomer(newCustomer);

            try {
                System.out.println("Enter the ID of the movie/show you want to book: ");
                int wantedId = sc.nextInt();
                CinemaItem chosenItem = cinema.searchItem(wantedId);

                if (chosenItem instanceof Movie) {
                    ((Movie) chosenItem).checkOut();
                } else if (chosenItem instanceof Show) {
                    ((Show) chosenItem).checkOut();
                }

                Ticket ticket = new Ticket(chosenItem, newCustomer, "Sunday", "Monday");
                newCustomer.addTicket(ticket);

                System.out.println("\nBooking Successful");
                System.out.println(newCustomer);
                System.out.println("Booked Item: " + chosenItem.getTitle());
                System.out.println("\nTicket Details: \n" + ticket);

                // Availability check
                if (chosenItem instanceof Movie) {
                    System.out.println("Item availability: " + ((Movie) chosenItem).getAvailable() + "\n");
                } else if (chosenItem instanceof Show) {
                    System.out.println("Item availability: " + ((Show) chosenItem).getAvailable() + "\n");
                }

                // Clone customer and display tickets
                Customer copyOfc1 = newCustomer.clone();
                System.out.println("A copy of the customer's information and ticket on a site other than the cinema's main site: \n" + copyOfc1);
                System.out.println("\nTicket Details:");

                for (int i = 0; i < copyOfc1.tickets.size(); i++) {
                    System.out.println(copyOfc1.tickets.get(i));
                }

                System.out.println();

                // Approval check
                System.out.println("\nAre you sure you want to book this item? (Yes/No)");
                String Approval = sc.next();

                if (Approval.equalsIgnoreCase("No")) {
                    if (chosenItem instanceof Movie) {
                        ((Movie) chosenItem).checkIn();
                        System.out.println("Availability after cancel: " + ((Movie) chosenItem).getAvailable());
                    } else if (chosenItem instanceof Show) {
                        ((Show) chosenItem).checkIn();
                        System.out.println("Availability after cancel: " + ((Show) chosenItem).getAvailable());
                    }
                    System.out.println("Booking cancelled and item is now available again.");

                } else {
                    System.out.println("*Your booked has been completed successfully*");
                }

            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }

            // Equality test
            System.out.println("\nEquals test:");
            System.out.println("m1 equals m2? " + m1.equals(m2));
            Movie m4 = new Movie(101, "Inception", "Christopher Nolan");
            System.out.println("m1 equals m4? " + m1.equals(m4));

            System.out.println("-----------------------------------------");
            System.out.println("\n-Book a movie/show at The Star cinema-");

            // Second customer login and booking
            System.out.println("\nLogin");
            System.out.println("Enter your name: ");
            String name2 = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter your ID: ");
            int id2 = sc.nextInt();

            Customer customer2 = new Customer(id2, name2);
            cinema.registerCustomer(customer2);

            try {
                System.out.println("Enter the ID of the movie/show you want to book: ");
                int wantedId2 = sc.nextInt();
                sc.nextLine();
                CinemaItem chosenItem2 = cinema.searchItem(wantedId2);

                if (chosenItem2 instanceof Movie) {
                    ((Movie) chosenItem2).checkOut();
                } else if (chosenItem2 instanceof Show) {
                    ((Show) chosenItem2).checkOut();
                }

                Ticket ticket2 = new Ticket(chosenItem2, customer2, "Tuesday", "Wednesday");
                customer2.addTicket(ticket2);

                System.out.println("\nBooking Successful");
                System.out.println(customer2);
                System.out.println("Booked Item: " + chosenItem2.getTitle());
                System.out.println("\nTicket Details:\n" + ticket2);

                // Availability check
                if (chosenItem2 instanceof Movie) {
                    System.out.println("Item availability: " + ((Movie) chosenItem2).getAvailable() + "\n");
                } else if (chosenItem2 instanceof Show) {
                    System.out.println("Item availability: " + ((Show) chosenItem2).getAvailable() + "\n");
                }

                // Clone customer and display tickets
                Customer copyOfc2 = customer2.clone();
                System.out.println("A copy of the customer's information and ticket on a site other than the cinema's main site: \n" + copyOfc2);
                System.out.println("\nTicket Details:");

                for (int i = 0; i < copyOfc2.tickets.size(); i++) {
                    System.out.println(copyOfc2.tickets.get(i));
                }

                System.out.println();

                // Approval check
                System.out.println("\nAre you sure you want to book this item? (Yes/No)");
                String Approva2 = sc.next();

                if (Approva2.equalsIgnoreCase("No")) {
                    if (chosenItem2 instanceof Movie) {
                        ((Movie) chosenItem2).checkIn();
                        System.out.println("Availability after cancel: " + ((Movie) chosenItem2).getAvailable());
                    } else if (chosenItem2 instanceof Show) {
                        ((Show) chosenItem2).checkIn();
                        System.out.println("Availability after cancel: " + ((Show) chosenItem2).getAvailable());
                    }
                    System.out.println("Booking cancelled and item is now available again.");

                } else {
                    System.out.println("*Your booked has been completed successfully*");
                }

            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
