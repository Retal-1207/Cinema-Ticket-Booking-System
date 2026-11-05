/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cinema;

/**
 *
 * @authors Retal Alkabawi 
 *          Shimaa Alhazmi, 
 *          Azizah Al-Ejayanm
 */

/**
 * Interface that defines borrowable behavior for cinema items. Any class that
 * implements this interface must provide methods to borrow (check out) and
 * return (check in) items.
 */
public interface Borrowable {

    /**
     * Borrows or books the item. Implementations should mark the item as
     * unavailable.
     *
     * @return void
     */
    void checkOut() throws ItemNotFoundException;

    /**
     * Returns the item back to the cinema system. Implementations should mark
     * the item as available again.
     *
     * @return void
     */
    void checkIn();

}
