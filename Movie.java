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
 * Represents a movie in the cinema system. Inherits from CinemaItem and
 * implements Borrowable. Stores movie details such as director and availability
 * status. Provides methods to display details, borrow (check out), and return
 * (check in).
 */
public class Movie extends CinemaItem implements Borrowable {

    private String director;

    private boolean available = true;

    /**
     * Default constructor for Movie.
     */
    public Movie() {
    }

    /**
     * Constructs a Movie with ID, title, and director.
     *
     * @param id The movie ID.
     * @param title The movie title.
     * @param director The movie director.
     */
    public Movie(Integer id, String title, String director) {
        super(id, title);

        this.director = director;

    }

    /**
     * Gets the director of the movie.
     *
     * @return The director's name.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the director of the movie.
     *
     * @param director The new director's name.
     * @return void
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Gets the availability status of the movie.
     *
     * @return True if available, false otherwise.
     */
    public boolean getAvailable() {
        return available;
    }

    /**
     * Sets the availability status of the movie.
     *
     * @param available True if available, false otherwise.
     * @return void
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Displays the detailed information of the movie.
     *
     * @return A string with the movie title and director.
     */
    @Override
    public String displayDetails() {
        return "Movie: " + getTitle() + " directed by " + director;
    }

    /**
     * Borrows or books the movie. Marks the movie as unavailable if it is not
     * already booked.
     *
     * @return void
     * @throws ItemNotFoundException If the movie is already booked.
     */
    @Override
    public void checkOut() throws ItemNotFoundException {
        if (!available) {

            throw new ItemNotFoundException("Movie already booked!");
        }
        available = false;
    }

    /**
     * Returns the movie back to the cinema system. Marks the movie as available
     * again.
     *
     * @return void
     */
    @Override
    public void checkIn() {
        available = true;
    }

}
