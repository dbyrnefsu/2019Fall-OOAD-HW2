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
 * @author kboppana
 *
 */
public class Guitar implements guitarinterface {

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
	 * @param numString the number of strings for this guitar
	 */
	public Guitar(String serialNumber, 
			double price, 
			Manufacturer manufacturer, 
			String model, 
			Type type, 
			woodmodel backWood,
			woodmodel topWood,
			Integer numStrings) {
	
	
		this.serialNumber = serialNumber;
		this.price = price;
	if(numstrings==null)this.numberofstrings=0;
		else this.numberOfStrings=numstrings;
		this.guitarspec=new guitarspec(manufacturer,model,type,backwood,topwood,price);
		
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
	public type getType() {
		return type;
	}

	/**
	 * Returns the type of wood used in the body
	 */
	public wood getBackWood() {
		return backWood;
	}

	/**
	 * Returns the type of wood used in the face
	 */
	public wood getTopWood() {
		return topWood;
	}
	
	/**
	 * Returns the number of string for this guitar
	 */
	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	/**
	 * Turn object into a readable string
	 */
	public String toString() {
		return String.format(toStringFormat, manufacturer, model, type, numberOfStrings, topWood, backWood, price, serialNumber);
	}

	/**
	 * The guitars manufacturer serial number
	 */
	private String serialNumber;

	/**
	 * The name of the manufacturer
	 */
	private manufacturer manufacturer;

	/**
	 * The manufacturer model number
	 */
	private String model;

	/**
	 * The guitar type (electric/acoustic)
	 */
	private type type;

	/**
	 * The wood used for the back of the guitar
	 */
	private wood backWood;

	/**
	 * The wood used for the face of the guitar
	 */
	private wood topWood;

	/**
	 * Rick's price for the guitar
	 */
	private double price;
	
	/**
	 * Guitars number of strings
	 */
	private int numberOfStrings;

	/**
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Model:%s; Type:%s; Num String: %d; Top wood: %s; Back wood:%s; Price:%.2f; Serial Num:%s";
}
