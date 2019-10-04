package edu.fitchburgstate.csc7400.hw2;

public interface IGuitarInterface {
    /**
     * return the guitar's manufacturer
     */
    Manufacturer getManufacturer();
    /**
     * return the guitar's Type
     */
    Type getType();
    /**
     * return the guitar's top wood
     */
    WoodType getTopWood();
    /**
     * return the guitar's back wood
     */

    WoodType getBackWood();
    /**
     * return the guitar's model
     */
    String getModel();
}

