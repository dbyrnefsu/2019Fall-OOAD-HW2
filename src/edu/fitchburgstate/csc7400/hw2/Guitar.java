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
 * Guitar contains the information needed to keep track of a type of guitar from
 * Rick's music store
 * 
 * @author Nodir.Nabiev
 * @author chandralekha 
 *
 */
public class Guitar {

	private double price;
	private int numberOfStrings;
	private String serialNumber;
	private GuitarSpec guitarSpec;

	/**
	 * Full constructor
	 * 
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param numStrings the number of strings for this guitar
	 *
	 */
	public Guitar(String serialNumber, double price, GuitarSpec guitarSpec, Integer numStrings) {

		this.serialNumber = serialNumber;
		this.price = price;
		if (numStrings == null) this.numberOfStrings = 0;
		else this.numberOfStrings = numStrings;
		this.guitarSpec = guitarSpec;
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
	 *
	 * @return
	 */
	public GuitarSpec getGuitarSpec() {
		return this.guitarSpec; 
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
		return String.format(toStringFormat, this.guitarSpec.getManufacturer(), this.guitarSpec.getModel(),
				this.guitarSpec.getType(), numberOfStrings, this.guitarSpec.getTopWood(), this.guitarSpec.getBackWood(), price, serialNumber);
	}

	/**
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Model:%s; Type:%s; Num String: %d; Top wood: %s; Back wood:%s; Price:%.2f; Serial Num:%s";

}
