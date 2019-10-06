/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2018-09-03
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * Guitar contains the information needed to keep track of a type of guitar from
 * Rick's music store
 * 
 * @author HeadFirstOODA
 *
 */
public class Guitar implements GuitarInterface {

	/**
	 * The guitars manufacturer serial number
	 */
	private String serialNumber;

	/**
	 * The name of the manufacturer
	 */
	private Manufacturer manufacturer;

	/**
	 * The manufacturer model number
	 */
	private String model;

	/**
	 * The guitar type (electric/acoustic)
	 */
	private Type type;

	/**
	 * The wood used for the back of the guitar
	 */
	private Wood backWood;

	/**
	 * The wood used for the face of the guitar
	 */
	private Wood topWood;

	/**
	 * Rick's price for the guitar
	 */
	private double price;

	/**
	 * Guitars number of strings
	 */
	private int numberOfStrings;

	/**
	 * Specification of the guitar
	 */
	private GuitarSpec guitarSpec;

	/**
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Model:%s; Type:%s; Num String: %d; Top wood: %s; Back wood:%s; Price:%.2f; Serial Num:%s";

	/**
	 * Full constructor
	 * 
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param manufacturer the guitar's manufacturer
	 * @param model the manufacturers model
	 * @param type guitar type (electric/acoustic)
	 * @param backWood the wood used for the guitar body
	 * @param topWood the wood used for the guitar's face
	 * @param numStrings the number of strings for this guitar
	 */
	public Guitar(String serialNumber, 
			double price, 
			Manufacturer manufacturer, 
			String model, 
			Type type, 
			Wood backWood,
			Wood topWood,
			Integer numStrings) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.manufacturer = manufacturer;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		if (numStrings == null) this.numberOfStrings = 0;
		else this.numberOfStrings = numStrings;
		guitarSpec=new GuitarSpec(manufacturer, type, topWood, backWood, model);
	}

	/**
	 * Returns the manufacturer serial number
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Returns store price of guitar
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the store price of the guitar
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	/**
	 * Returns the name of the manufacturer
	 */
	public Manufacturer getManufacturer() {
		return this.manufacturer;
	}

	/**
	 * Returns the manufacturer model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the guitar type
	 * @return
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Returns the type of wood used in the body
	 */
	public Wood getBackWood() {
		return backWood;
	}

	/**
	 * Returns the type of wood used in the face
	 */
	public Wood getTopWood() {
		return topWood;
	}
	
	/**
	 * Returns the number of string for this guitar
	 */
	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	/**
	 * Returns the specification for this guitar
	 */
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	public void setGuitarSpec(GuitarSpec guitarSpec) {
		this.guitarSpec = guitarSpec;
	}

	/**
	 * Turn object into a readable string
	 */
	public String toString() {
		return String.format(toStringFormat, manufacturer, model, type, numberOfStrings, topWood, backWood, price, serialNumber);
	}

	/**
	 * Validates if the given guitar is equal to the other guitar
	 *
	 * @param obj
	 * @return	true	: If there is an exact match / all of the specifications matches
	 * 			false	: If there is NO exact match / any of the specification DOESN'T match
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (null == obj || getClass() != obj.getClass()) return false;
		Guitar other = (Guitar) obj;

		return (serialNumber != null && serialNumber.equalsIgnoreCase(other.getSerialNumber()) &&
				this.getGuitarSpec().equals(other.getGuitarSpec()) &&
				numberOfStrings == other.getNumberOfStrings() &&
				Double.doubleToLongBits(price) == Double.doubleToLongBits(other.getPrice())
		);
	}

	/**
	 * Determines whether the given guitar matches at-least one of the values of the other guitarspec
	 *
	 * @param obj Guitar to be compared
	 * @return 	true	: At-least one specification matches
	 * 			false	: No match found
	 */
	public boolean matches(Object obj) {
		if ((null != obj) && getClass() == obj.getClass()) {
			Guitar other = (Guitar) obj;
			return this.getGuitarSpec().matches(other.getGuitarSpec());
		} else return false;
	}
	
}
