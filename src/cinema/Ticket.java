/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

/**
 *
 * @authors Retal Alkabawi 
 *          Shimaa Alhazmi, 
 *          Azizah Al-Ejayanm
 */

/**
 * Represents a ticket for a booked cinema item (movie or show). Stores
 * information about the booked item, the customer, booking day, show day, and
 * the current status of the ticket. Provides methods to access and modify these
 * details, calculate price, clone the ticket, and display ticket information.
 */
public class Ticket {

    private CinemaItem item;
    private Customer customer;
    private String bookingDay;
    private String showDay;

    private String status;

    /**
     * Default constructor for Ticket.
     */
    public Ticket() {
    }

    /**
     * Constructs a Ticket with item, customer, booking day, and show day.
     *
     * @param item The booked CinemaItem.
     * @param customer The customer who booked the item.
     * @param bookingDay The day the ticket was booked.
     * @param showDay The day of the show.
     */
    public Ticket(CinemaItem item, Customer customer, String bookingDay, String showDay) {
        this.item = item;
        this.customer = customer;
        this.bookingDay = bookingDay;
        this.showDay = showDay;
        this.status = "active";
    }

    /**
     * Gets the booked CinemaItem.
     *
     * @return The CinemaItem.
     */
    public CinemaItem getItem() {
        return item;
    }

    /**
     * Sets the booked CinemaItem.
     *
     * @param item The new CinemaItem.
     * @return void
     */
    public void setItem(CinemaItem item) {
        this.item = item;
    }

    /**
     * Gets the customer who booked the ticket.
     *
     * @return The Customer.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer for the ticket.
     *
     * @param customer The new Customer.
     * @return void
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Gets the booking day of the ticket.
     *
     * @return The booking day.
     */
    public String getBookingDay() {
        return bookingDay;
    }

    /**
     * Sets the booking day of the ticket.
     *
     * @param bookingDay The new booking day.
     * @return void
     */
    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    /**
     * Gets the show day of the ticket.
     *
     * @return The show day.
     */
    public String getShowDay() {
        return showDay;
    }

    /**
     * Sets the show day of the ticket.
     *
     * @param showDay The new show day.
     * @return void
     */
    public void setShowDay(String showDay) {
        this.showDay = showDay;
    }

    /**
     * Gets the status of the ticket.
     *
     * @return The ticket status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of the ticket.
     *
     * @param status The new status.
     * @return void
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Calculates the price of the ticket.
     *
     * @return The ticket price.
     */
    public double calculatePrice() {
        return 50.0;
    }

    /**
     * Creates a deep copy of the ticket.
     *
     * @return A cloned Ticket object.
     */
    public Ticket clone() {
        CinemaItem clonedItem = this.item;
        Customer clonedCustomer = this.customer;
        String clonedBookingDay = new String(this.bookingDay);
        String clonedShowDay = new String(this.showDay);

        Ticket copy = new Ticket(clonedItem, clonedCustomer, clonedBookingDay, clonedShowDay);
        copy.status = this.status;
        return copy;
    }

    /**
     * Returns a string representation of the ticket.
     *
     * @return Ticket details as string.
     */
    @Override
    public String toString() {
        return "Ticket for " + item.getTitle() + " \nbooked by " + customer.getName() + "\nbookingDay: " + this.bookingDay + "\nshowDay: " + this.showDay+"\nprice: "+calculatePrice();
    }

}
