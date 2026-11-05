/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;// Declares that this class belongs to the 'cinema' package

/**
 *
 * @authors Retal Alkabawi
 *          Shimaa Alhazmi, 
 *          AzizahAl-Ejayanm
 */

/**
 * Abstract base class for all cinema items. Defines common attributes like ID
 * and title.
 */
public abstract class CinemaItem implements Comparable<CinemaItem> {

    /**
     * Unique ID of the item
     */
    private Integer itemID;

    /**
     * Title of the item
     */
    private String title;

    /**
     * Default constructor for CinemaItem. Initializes a CinemaItem object
     * without setting any ID or title. This constructor can be used when values
     * will be assigned later through setter methods.
     */
    public CinemaItem() {

    }

    /**
     * Constructs a CinemaItem with the given ID and title.
     *
     * @param itemID The unique ID.
     * @param title The title of the item.
     */
    public CinemaItem(Integer itemID, String title) {
        this.itemID = itemID;
        this.title = title;
    }

    /**
     * Gets the ID of the item.
     *
     * @return The item ID.
     */
    public Integer getItemID() {
        return itemID;
    }

    /**
     * Sets the ID of the item.
     *
     * @param itemID The new item ID.
     */
    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    /**
     * Gets the title of the item.
     *
     * @return The item title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the item.
     *
     * @param title The new item title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns a string representation of the item.
     *
     * @return Item details as a string.
     */
    @Override
    public String toString() {

        return "ID: " + itemID + ", Title: " + title;

    }

    /**
     * Checks equality based on ID.
     *
     * @param o The object to compare.
     * @return True if the IDs are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {

        if (o instanceof CinemaItem) {
            return this.itemID.equals(((CinemaItem) o).itemID);
        }
        return false;

    }

    /**
     * Compares this CinemaItem with another CinemaItem based on their item IDs.
     * This method is used to define the natural ordering of CinemaItem objects.
     * It returns: -1 if this item's ID is less than the other item's ID 1 if
     * this item's ID is greater than the other item's ID 0 if both items have
     * the same ID
     *
     * @param other The other CinemaItem to compare with this one.
     * @return -1, 0, or 1 depending on the comparison result.
     */
    @Override
    public int compareTo(CinemaItem other) {

        if (this.itemID < other.itemID) {
            return -1;

        } else if (this.itemID > other.itemID) {
            return 1;

        } else {
            return 0;

        }
    }

    /**
     * Displays the detailed information of the cinema item. This abstract
     * method must be implemented by subclasses (such as Movie or Show) to
     * provide their specific details (e.g., director for movies, hall for
     * shows).
     *
     * @return A string containing the detailed information of the item.
     */
    public abstract String displayDetails();

}
