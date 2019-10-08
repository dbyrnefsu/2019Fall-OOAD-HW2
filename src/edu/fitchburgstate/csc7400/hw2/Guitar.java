/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Xia Jin, Akhila Lolam
 * Date: 2019-10-03
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * Guitar contains the information needed to keep track of a type of guitar from
 * Rick's music store
 * 
 * @author HeadFirstOODA
 * @author xia.jin
 *
 */
public class Guitar implements GuitarInterface{

	/**
	 * Full constructor 
	 * Takes enums for manufacturers, type, backWood, and topWood
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
			Type type,
			String model, 
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
		spec = new GuitarSpec(this.manufacturer, 
				this.type, 
				this.backWood, 
				this.topWood, 
				this.model);
	}

	/**
	 * Constructor
	 * Takes String for manufacturers, type, backWood, and topWood
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
	public Guitar(String serialNumber, double price, String manufacturer, String type, String model, 
			String backWood, String topWood, Integer numStrings) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.manufacturer = Manufacturer.valueOf(manufacturer.toUpperCase());
		this.model = model;
		this.type = Type.valueOf(type.toUpperCase());
		this.backWood = Wood.valueOf(backWood.toUpperCase());
		this.topWood = Wood.valueOf(topWood.toUpperCase());
		if (numStrings == null) this.numberOfStrings = 0;
		else this.numberOfStrings = numStrings;
		spec = new GuitarSpec(this.manufacturer, 
				this.type, 
				this.backWood, 
				this.topWood, 
				this.model);
	}

	/**
	 * Returns the manufacturer serial number
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Returns the store price of the guitar
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
	@Override
	public Manufacturer getManufacturer() {
		return this.manufacturer;
	}

	/**
	 * Returns the manufacturer model
	 */
	@Override
	public String getModel() {
		return model;
	}

	/**
	 * Returns the guitar type
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * Returns the type of wood used in the body
	 */
	@Override
	public Wood getBackWood() {
		return backWood;
	}

	/**
	 * Returns the type of wood used in the face
	 */
	@Override
	public Wood getTopWood() {
		return topWood;
	}
	
	/**
	 * Returns the number of string for the guitar
	 */
	public int getNumberOfStrings() {
		return numberOfStrings;
	}
	/**
	 * Returns the specification of the guitar
	 */
	public GuitarSpec getGuitarSpec() {
		return spec;
	}
	
	/**
	 * Turns a guitar object into a readable string
	 */
	public String toString() {
		return String.format(toStringFormat, manufacturer, model, type, numberOfStrings, topWood, backWood, price, serialNumber);
	}

	/**
	 * Compares with another guitar by comparing
	 * each and every of the following values:
	 * serialNumber, price, manufacturer, model, 
	 * type, backWood, topWood, numStrings.
	 * If all values are the same, return true. 
	 * If any value is not the same, return false.
	 * 
	 * @param other a guitar to compare
	 * @return returns true if all values are the same,
	 * returns false if not all values are the same.
	 */
	public boolean equals(Guitar other) {
		if(!this.serialNumber.equals(other.serialNumber))
			return false;
		if(this.price != other.price) 
			return false;
		if(this.manufacturer != other.manufacturer)
			return false;
		if(!this.model.equals(other.model))
			return false;
		if(this.type != other.type)
			return false;
		if(this.topWood != other.topWood)
			return false;
		if(this.backWood != other.backWood)
			return false;
		if(this.numberOfStrings != other.numberOfStrings)
			return false;
		return true;
	}
	
	/**
	 * Matches with a guitar specification by comparing
	 * the following values if specified in the guitar specification: 
	 * manufacturer, type, backWood, topWood, model.
	 * If a value is unspecified in the guitar specification, 
	 * then will treat as a wildcard and will not compare this value.
	 * 
	 * @param otherSpec a guitar specification
	 * @return returns true if all specified values in the guitar specification are the same.
	 * returns false if any specified value in the guitar specification is not the same.
	 */
	public boolean matches(GuitarSpec otherSpec) {
		System.out.println("GuitarSpec for search: " + otherSpec.toString());
		System.out.println("Current guitar:        " + this.toString());
		if(otherSpec.getManufacturer()!=null && otherSpec.getManufacturer()!=this.manufacturer)
			return false;
		if(otherSpec.getType()!=null && otherSpec.getType()!=this.type)
			return false;
		if(otherSpec.getBackWood()!=null && otherSpec.getBackWood()!= this.backWood)
			return false;
		if(otherSpec.getTopWood()!=null && otherSpec.getTopWood()!= this.topWood)
			return false;
		if(otherSpec.getModel()!= null && !otherSpec.getModel().equals(this.model))
			return false;
		return true;
	}
	
	/**
	 * The guitar's manufacturer serial number
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
	 * Guitar's number of strings
	 */
	private int numberOfStrings;

	/**
	 * The specification of the guitar
	 */
	private GuitarSpec spec;
	/**
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Model:%s; Type:%s; Num String: %d; Top wood: %s; Back wood:%s; Price:%.2f; Serial Num:%s";
}
