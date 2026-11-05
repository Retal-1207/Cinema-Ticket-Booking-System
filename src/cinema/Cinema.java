/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinema;

import java.util.*;

/**
 *
 * @authors Retal Alkabawi 
 *          Shimaa Alhazmi, Azizah
 *          Al-Ejayanm
 */

/**
 * Represents the cinema management system for movies and shows. Maintains a
 * catalog of items and a set of customers.
 */
public class Cinema {

    /**
     * Default constructor for Cinema. Initializes empty catalog and customer
     * set.
     */
    public Cinema() {
    }

    /**
     * Catalog of cinema items (movies and shows).
     */
    ArrayList<CinemaItem> catalog = new ArrayList<>();

    /**
     * Set of registered customers (sorted).
     */
    TreeSet<Customer> customers = new TreeSet<>();

    /**
     * Adds a new item to the cinema catalog.
     *
     * @param item The CinemaItem to add.
     * @return void
     */
    public void addItem(CinemaItem item) {

        catalog.add(item);

    }

    /**
     * Registers a new customer in the cinema system.
     *
     * @param c The Customer to register.
     * @return void
     */
    public void registerCustomer(Customer c) {

        customers.add(c);

    }

    /**
     * Searches the catalog for a cinema item by ID.
     *
     * @param id The unique identifier of the item.
     * @return The matching CinemaItem if found.
     */
    public CinemaItem searchItem(Integer id) throws ItemNotFoundException {

        for (CinemaItem item : catalog) {

            if (item.getItemID().equals(id)) {

                return item;

            }
        }
        throw new ItemNotFoundException("This item is not available");

    }

    /**
     * Sorts the cinema catalog using natural ordering of CinemaItem.
     *
     * @return void
     */
    public void sortCatalog() {

        Collections.sort(catalog);

    }

}
