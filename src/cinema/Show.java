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
 * Represents a live show in the cinema. Inherits from CinemaItem and implements
 * Borrowable.
 */
public class Show extends CinemaItem implements Borrowable {

    /**
     * Hall where the show takes place
     */
    private String hallName;

    /**
     * Availability status of the show
     */
    private boolean available = true;

    /**
     * Default constructor for Show. Initializes a Show object without setting
     * any attributes. Values such as ID, title, and hall can be assigned later
     * using setter methods.
     */
    public Show() {
    }

    /**
     * Constructs a Show with ID, title, and hall.
     *
     * @param id The show ID.
     * @param title The show title.
     * @param hallName The hall name.
     */
    public Show(Integer id, String title, String hallName) {
        super(id, title);
        this.hallName = hallName;
    }

    /**
     * Gets the hall of the show.
     *
     * @return The hall name.
     */
    public String getHallName() {
        return hallName;
    }

    /**
     * Sets the hall of the show.
     *
     * @param hallName The new hall name.
     * @return void
     */
    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    /**
     * Gets the availability status of the show.
     *
     * @return True if available, false otherwise.
     */
    public boolean getAvailable() {
        return available;
    }

    /**
     * Sets the availability status of the show.
     *
     * @param available True if available, false otherwise.
     * @return void
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Displays the detailed information of the show. This implementation
     * returns a formatted string containing the show's title and the hall name
     * where it takes place.
     *
     * @return A string with the show title and hall name.
     */
    @Override
    public String displayDetails() {
        return "Show: " + getTitle() + " in hall " + hallName;
    }

    /**
     * Checks out the show (marks as unavailable).
     ** @throws ItemNotFoundException If the movie is already booked.
     * @return void
     */
    @Override
    public void checkOut() throws ItemNotFoundException {
        if (!available) {

            throw new ItemNotFoundException("Show already booked!");
        }
        available = false;
    }

    /**
     * Checks in the show (marks as available).
     *
     * @return void
     */
    @Override
    public void checkIn() {
        available = true;
    }

}
