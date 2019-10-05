/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2018-09-03
 */

package edu.fitchburgstate.csc7400.hw2;

import edu.fitchburgstate.csc7400.hw2.GuitarSpec.GuitarManufacturer;
import edu.fitchburgstate.csc7400.hw2.GuitarSpec.GuitarType;
import edu.fitchburgstate.csc7400.hw2.GuitarSpec.GuitarWood;

/**
 * Guitar contains the information needed to keep track of a type of guitar from
 * Rick's music store
 * 
 * @author HeadFirstOODA
 *
 */
public class Guitar implements GuitarInterface {

	/**
	 * Full constructor
	 * 
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param guitarSpec guitar specifications for this guitar
	 * @param numString the number of strings for this guitar
	 */
	public Guitar(String serialNumber, 
			double price, 
			GuitarSpec guitarSpec,
			Integer numStrings) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
		if (numStrings == null) this.numberOfStrings = 0;
		else this.numberOfStrings = numStrings;
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
	 * Returns guitar spec of guitar
	 * @return
	 */
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	/**
	 * Sets the store price of the guitar
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	/**
	 * Sets the guitar spec for the guitar
	 * @param guitarSpec
	 */
	public void setGuitarSpec(GuitarSpec guitarSpec) {
		this.guitarSpec = guitarSpec;
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
		return String.format(toStringFormat, guitarSpec, numberOfStrings, price, serialNumber);
	}

	/**
	 * The guitars manufacturer serial number
	 */
	private String serialNumber;
	
	/**
	 * Specifications for this guitar
	 */
	private GuitarSpec guitarSpec;

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
	private static String toStringFormat = "Specifications: %s; Num String: %d; Price:%.2f; Serial Num:%s";

	/**
	 * Returns type of Guitar
	 */
	@Override
	public GuitarType getType() {
		return this.guitarSpec.getType();
	}

	/**
	 * Returns manufacturer of Guitar
	 */
	@Override
	public GuitarManufacturer getManufacturer() {
		return this.guitarSpec.getManufacturer();
	}

	/**
	 * Returns topwood of Guitar
	 */
	@Override
	public GuitarWood getTopWood() {
		return this.guitarSpec.getTopWood();
	}

	/**
	 * Returns backwood of Guitar
	 */
	@Override
	public GuitarWood getBackWood() {
		return this.guitarSpec.getBackWood();
	}

	/**
	 * Returns model of Guitar
	 */
	@Override
	public String getModel() {
		return this.guitarSpec.getModel();
	}
	
	/**
	 * Compares all properties of new guitar to this guitar
	 * 
	 * @param Gutiar newGuitar new Guitar
	 * @return true if all properties of new guitar matches this guitar
	 */
	public boolean equals(Guitar newGuitar) {
		if (
				this.serialNumber == newGuitar.getSerialNumber() &&
				this.price == newGuitar.getPrice() &&
				this.numberOfStrings == newGuitar.getNumberOfStrings() &&
				this.guitarSpec.equals(newGuitar.getGuitarSpec())
			) {
			return true;
		}
		return false;
	}
	
	/**
	 * Compares anyone property of new guitar to this guitar
	 * 
	 * @param Guitar newGuitar new Guitar
	 * @return true if any property of new guitar matches this guitar
	 */
	public boolean matches(Guitar newGuitar) {
		if (
				this.serialNumber == newGuitar.getSerialNumber() ||
				this.price == newGuitar.getPrice() ||
				this.numberOfStrings == newGuitar.getNumberOfStrings() ||
				this.guitarSpec.matches(newGuitar.getGuitarSpec())
			) {
			return true;
		}
		return false;
	}
}
