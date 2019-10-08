/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Oleksandr (Alex) Koblosh
 * Date: 10-7-2019
 */

package edu.fitchburgstate.csc7400.hw2;

public interface IGuitarInterface {
    /**
     * return the guitar's manufacturer
     */
    Manufacturer getManufacturer();
    /**
     * return the guitar's type
     */
    Type getType();
    /**
     * return the guitar's top wood
     */
    Wood getTopWood();
    /**
     * return the guitar's back wood
     */

    Wood getBackWood();
    /**
     * return the guitar's model
     */
    String getModel();
}

