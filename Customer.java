/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

import java.util.ArrayList;

/**
 *
 * @authors Retal Alkabawi 
 *          Shimaa Alhazmi, 
 *          Azizah Al-Ejayanm
 */

/**
 * Represents a customer in the cinema system. Stores customer information such
 * as ID, name, and the list of tickets booked. Provides methods to manage
 * tickets, clone customer data, and compare customers.
 */
public class Customer implements Comparable<Customer> {

    private int id;
    private String name;
    ArrayList<Ticket> tickets;

    /**
     * Default constructor for Customer.
     */
    public Customer() {
    }

    /**
     * Constructs a Customer with ID and name.
     *
     * @param id The customer's unique identifier.
     * @param name The customer's name.
     */
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.tickets = new ArrayList<>();
    }

    /**
     * Gets the customer's ID.
     *
     * @return The customer ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the customer's ID.
     *
     * @param id The new customer ID.
     * @return void
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the customer's name.
     *
     * @return The customer name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the customer's name.
     *
     * @param name The new customer name.
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds a ticket to the customer's list.
     *
     * @param t The ticket to add.
     * @return void
     */
    public void addTicket(Ticket t) {
        tickets.add(t);
    }

    /**
     * Creates a deep copy of the customer and their tickets.
     *
     * @return A cloned Customer object.
     */
    public Customer clone() {
        Customer copy = new Customer(this.id, this.name);

        for (int i = 0; i < this.tickets.size(); i++) {
            Ticket t = this.tickets.get(i);
            copy.addTicket(t.clone());
        }

        return copy;
    }

    /**
     * Compares this customer with another by ID.
     *
     * @param other The other customer to compare.
     * @return Comparison result (-1, 0, 1).
     */
    @Override
    public int compareTo(Customer other) {

        if (this.id < other.id) {
            return -1;

        } else if (this.id > other.id) {
            return 1;

        } else {
            return 0;
        }
    }

    /**
     * Returns a string representation of the customer.
     *
     * @return Customer details as string.
     */
    @Override
    public String toString() {
        return "Customer [ID: " + id + ", Name: " + name + ", Number of tickets: " + tickets.size() + "]";
    }
}
