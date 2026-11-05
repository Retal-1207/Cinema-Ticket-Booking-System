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
 * Custom exception class used in the cinema system. Thrown when a requested
 * item (movie or show) cannot be found in the catalog.
 */
public class ItemNotFoundException extends Exception {

    /**
     * Constructs a new ItemNotFoundException with a detail message.
     *
     * @param message The detail message explaining the cause of the exception.
     */
    public ItemNotFoundException(String message) {
        super(message);

    }

}
