/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 *
 * Date: 2018-09-03
 *
 * Students: @Nodir Nabiev
 *          : @Chandralekha 
 * Version 1.0
 * ModifiedDate: 2019-10-07
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 *<h1>GuitarInterface class </h1>
 * It has following getters for Manufacturer, Type, TopWood, BackWood, Model
 */
public interface GuitarInterface {

    /**
     * Get the Manufacturer
     * @return the current Manufacturer
     */
    Manufacturer getManufacturer();

    /**
     *Get the Type
     * @return the Current Type
     */
    Type getType();

    /**
     *Get the TopWood
     * @return the Current TopWood
     */
    Wood getTopWood();

    /**
     *Get the getBackWod
     * @return the current backWood
     */
    Wood getBackWood();

    /**
     *Get the Model
     * @return the current Model
     */
    String getModel();

}
