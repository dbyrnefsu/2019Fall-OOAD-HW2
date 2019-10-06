/**
 * 
 */
package edu.fitchburgstate.csc7400.hw2;

/**
 * @author Rudrapriya Subudhi , Poorani Jagadeesan
 *
 */
public interface GuitarInterface {

	/**
	 * Enum for Guitar Manufacturers
	 */
	public enum Manufacturer {
		FENDER,
		MARTIN,
		GIBSON,
		COLLINGS,
		OLSON,
		RYAN,
		PRS,
		LEXUS
	}

	/**
	 * Enum for Guitar Type
	 */
	public enum Type {
		ELECTRIC, ACOUSTIC
	}

	/**
	 * Enum for Guitar Wood type - Both Topwood and Backwood
	 */
	public enum Wood {
		INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA
	}

	// return the guitar's manufacturer
	public Manufacturer getManufacturer();

	// return the guitar's type
	public Type getType();

	// return the guitar's top wood
	public Wood getTopWood();

	// return the guitar's back wood
	public Wood getBackWood();

	// return the guitar's model
	public String getModel();

}
