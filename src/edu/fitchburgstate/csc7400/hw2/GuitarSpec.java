/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 *
 * Date: 2018-09-03
 *
 * Students: @Nodir Nabiev
 *          : @Chandralekha 
 * Version 2.0
 * ModifiedDate: 2019-10-07
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * GuitarSpec contains the specification information of guitars
 * that implemented GuitarInterface and modifies its functions.
 *
 * @author Nodir.Nabiev
           chandralekha
 */
public class GuitarSpec implements GuitarInterface {

    private String model;
    private Manufacturer manufacturer;
    private Type type;
    private Wood topWood;
    private Wood backWood;

    /**
     *
     *
     * @param model
     * @param manufacturer
     * @param type
     * @param topWood
     * @param backWood
     */
    GuitarSpec(String model, Manufacturer manufacturer, Type type, Wood topWood, Wood backWood) {
        this.model = model;
        if (null != manufacturer) {
            this.manufacturer = manufacturer;
        }
        if (null != type) {
            this.type = type;
        }
        if (null != topWood) {
            this.topWood = Enum.valueOf(Wood.class, topWood.toString());
        }
        if (null != backWood) {
            this.backWood = Enum.valueOf(Wood.class, backWood.toString());
        }

    }

    /**
     * Returns the guitar manufacturer
     *
     * @return guitar manufacturer
     */
    @Override
    public Manufacturer getManufacturer() {

        return this.manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {

        this.manufacturer = manufacturer;
    }

    @Override
    public Type getType() {

        return this.type;
    }

    public void setType(Type type) {

        this.type = type;
    }

    @Override
    public Wood getTopWood() {

        return this.topWood;
    }

    public void setTopWood(Wood topWood) {

        this.topWood = topWood;
    }

    @Override
    public Wood getBackWood() {

        return this.backWood;
    }

    /**
     * Sets the guitar back wood
     *
     * @param backWood guitar back wood
     */
    public void setBackWood(Wood backWood) {

        this.backWood = backWood;
    }

    /**
     * Returns the guitar model
     *
     * @return guitar model
     */
    @Override
    public String getModel() {

        return this.model;
    }

    /**
     * Sets the guitar model
     *
     * @param model guitar model
     */
    public void setModel(String model) {

        this.model = model;

    }

    /**
     *
     * @param otherGuitarSpec
     * @return
     */
    public boolean matches(GuitarSpec otherGuitarSpec) {

        if (manufacturer != null && manufacturer != otherGuitarSpec.manufacturer)
            return false;
        if (type != null && type != otherGuitarSpec.type)
            return false;
        if (topWood != null && topWood != otherGuitarSpec.topWood)
            return false;
        if (backWood != null && backWood != otherGuitarSpec.backWood)
            return false;
        if (model != null && !model.isEmpty() && !model.equals(otherGuitarSpec.model))
            return false;
        return true;

    }

    /**
     * Checks if other guitar specs equals to another guitar specs
     *
     * @param otherGuitarSpec
     * @return
     */
    @Override
    public boolean equals(Object otherGuitarSpec) {

        GuitarSpec guitarSpec = (GuitarSpec) otherGuitarSpec;

       return guitarSpec.equals(this);

    }

}
