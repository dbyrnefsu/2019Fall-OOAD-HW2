/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Oleksandr (Alex) Koblosh
 * Date: 10-7-2019
 */

package edu.fitchburgstate.csc7400.hw2;


public class GuitarSpec implements IGuitarInterface {
    /**
     * The name of the manufacturer in GuitarSpec
     */
    private Manufacturer manufacturer;

    /**
     * The manufacturer model number in GuitarSpec
     */
    private String model;

    /**
     * The guitar type (electric/acoustic) in GuitarSpec
     */
    private Type type;

    /**
     * The wood used for the back of the guitar GuitarSpec
     */
    private Wood backWood;

    /**
     * The wood used for the face of the guitar GuitarSpec
     */
    private Wood topWood;

    /**
     * Full constructor of GuitarSpec with below parameters
     * @param manufacturer Guitar's manufacturer
     * @param model Guitar's Model
     * @param type Guitar's Type
     * @param backWood Guitar's BackWood
     * @param topWood Guitar's TopWood
     */
    public GuitarSpec(Manufacturer manufacturer, Type type, Wood backWood, Wood topWood, String model) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
    }

    public GuitarSpec(String manufacturer, String type, String backWood, String topWood, String model) {
        if(manufacturer!=null) {
            this.manufacturer = Manufacturer.valueOf(manufacturer);
        }
        if(backWood != null) {
            this.backWood = Wood.valueOf(backWood);
        }
        if(topWood != null) {
            this.topWood = Wood.valueOf(topWood);
        }
        if(model != null) {
            this.model = model;
            if(type != null) {
                this.type = Type.valueOf(type);
            }

        }

    }


    /**
     * Gets manufacturer of the Guitar
     *
     * @return Manufacturer Guitar's manufacturer
     */
    @Override
    public Manufacturer getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets manufacturer of the guitar with the value passed as a parameter
     *
     * @param manufacturer Guitar's manufacturer
     */
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets model of the guitar
     *
     * @return model Guitar's model
     */
    @Override
    public String getModel() {
        return model;
    }


    /**
     * Sets model of the guitar with the value passed as a parameter
     *
     * @param model string value of Guitar's model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets Type of the guitar
     *
     * @return type Guitar's type(electric/accoustic)
     */
    @Override
    public Type getType() {
        return type;
    }


    /**
     * Sets Type of the guitar with the value passed as a parameter
     *
     * @param type Guitar's type(electric/accoustic)
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Returns Wood used for the back of the guitar
     */
    @Override
    public Wood getBackWood() {
        return backWood;
    }

    /**
     * Sets Backwood value of the guitar with the value passed as a parameter
     *
     * @param backWood Guitar's wood value for backWood
     */
    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }


    /**
     * Returns Wood used for the body of the guitar
     */
    @Override
    public Wood getTopWood() {
        return topWood;
    }

    /**
     * Sets Topwood value of the guitar with the value passed as a parameter
     *
     * @param topWood Guitar's wood value for topWood
     */
    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    /**
     * Matches each guitar with search guitar
     * @param guitar GuitarSpec Object for each guitar
     * @return Boolean returns true if a guitar matches with search guitar, false if not.
     */

    public boolean matches(GuitarSpec guitar) {
        if(this.manufacturer != guitar.manufacturer)
            return false;
        else if (guitar.model != null && !this.model.toUpperCase().equals(guitar.model.toUpperCase()));
        else if ((guitar.type != null) && (this.type != guitar.type))
            return false;
        else if ((guitar.topWood != null) && (this.topWood != guitar.topWood))
            return false;
        else if (guitar.backWood !=null && (this.backWood != guitar.backWood))
            return false;

        return true;

    }


    /**
     * Finds if the guitarspec guitar equals to another guitar specification
     * @param guitar GuitarSpec Object for each guitar
     * @return Boolean returns true if a guitar equals to other guitar, false if not.
     */
    public boolean equals(GuitarSpec guitar) {
        if(this.manufacturer != guitar.manufacturer)
            return false;
        else if (this.type != guitar.type)
            return false;
        else if (this.topWood != guitar.topWood)
            return false;
        else if (this.backWood != guitar.backWood)
            return false;
        else return this.model.equals(guitar.model);
    }


    /**
     * Turns a guitar object into a readable string
     */
    public String toString() {
        String toStringFormat = "Manufacturer: %s; Type: %s; Back wood: %s; Top wood: %s; Model: %s";
        return String.format(toStringFormat, manufacturer, type, backWood, topWood, model );
    }


}