package edu.fitchburgstate.csc7400.hw2;

/**
 * @author Rudrapriya Subudhi , Poorani Jagadeesan
 */
public class GuitarSpec implements GuitarInterface {
    /**
     * Manufacture name in a guitar specification.
     */
    private Manufacturer manufacturer;

    /**
     * Guitar type (electric/acoustic) in a guitar specification.
     */
    private Type type;

    /**
     * Wood used for the face of the guitar.
     */
    private Wood topWood;

    /**
     * Wood used for the back of the guitar.
     */
    private Wood backWood;

    /**
     * Manufacturer model number in a guitar specification.
     */
    private String model;

    public GuitarSpec() {

    }

    /**
     * Full constructor
     *
     * @param manufacturer the guitar's manufacturer
     * @param model        the manufacturers model
     * @param type         guitar type (electric/acoustic)
     * @param backWood     the wood used for the guitar body
     * @param topWood      the wood used for the guitar's face
     */
    public GuitarSpec(Manufacturer manufacturer, Type type, Wood topWood, Wood backWood, String model) {

        this.manufacturer = manufacturer;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.model = model;
    }

    /**
     * Returns the name of the manufacturer
     */
    @Override
    public Manufacturer getManufacturer() {

        return manufacturer;
    }

    /**
     * Returns the guitar type
     */
    @Override
    public Type getType() {
        return type;
    }

    /**
     * Returns the type of wood used in the face
     */
    @Override
    public Wood getTopWood() {
        return topWood;
    }

    /**
     * Returns the type of wood used in the body
     */
    @Override
    public Wood getBackWood() {
        return backWood;
    }

    /**
     * Returns the manufacturer model
     */
    @Override
    public String getModel() {
        return model;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Validates if the given guitar specification is equal to other guitar
     * specification.
     *
     * @param other Guitarspec to be compared
     * @return true     : If there is an exact match / all of the five specifications matches
     * false : If there is NO exact match / any of the five specification DOESN'T match
     */
    public boolean equals(GuitarSpec other) {

        if (this == other) return true;
        if (null == other) return false;
        return (manufacturer.equals(other.manufacturer) &&
                model.equalsIgnoreCase(other.model) &&
                type.equals(other.getType()) &&
                backWood.equals(other.backWood) &&
                topWood.equals(other.topWood));
    }

    /**
     * Determines whether the given guitarspec matches atleast one of the values of the other guitarspec
     *
     * @param other Guitarspec to be compared
     * @return true  : At-least one specification matches
     * false : No match found
     */
    public boolean matches(GuitarSpec other) {
        if ((null != other) && (manufacturer.equals(other.getManufacturer()) ||
                model.equalsIgnoreCase(other.model) ||
                type.equals(other.getType()) ||
                backWood.equals(other.backWood) ||
                topWood.equals(other.topWood))
        ) {
            return true;
        } else return false;
    }
}
