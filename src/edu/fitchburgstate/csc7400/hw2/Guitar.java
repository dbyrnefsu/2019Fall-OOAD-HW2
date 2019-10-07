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
public class Guitar extends GuitarSpec {

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
			String manufacturer,
			String type, 
			String model, 		
			String backWood,
			String topWood,
			Integer numStrings) {		 
		super(manufacturer, model, type, backWood, topWood, 0, price);
		this.serialNumber = serialNumber;
		this.price = price;
		if (numStrings == null) this.numberOfStrings = 0;
		else this.numberOfStrings = numStrings;	
	}	

	public boolean equals(Guitar guitar) {
		if(!this.serialNumber.equals(guitar.serialNumber))
			return false;
		if(this.price != guitar.price) 
			return false;
		if(this.getManufacturer() != guitar.getManufacturer())
			return false;
		if(!this.getModel().equals(guitar.getModel()))
			return false;
		if(this.getType()  != guitar.getType() )
			return false;
		if(this.getTopWood() != guitar.getTopWood())
			return false;
		if(this.getBackWood() != guitar.getBackWood())
			return false;
		if(this.numberOfStrings != guitar.numberOfStrings)
			return false;
		return true;
	}

	public boolean matches(GuitarSpec guitarSpec) {
		if (guitarSpec.getGuitarManufacturer() != null && super.getGuitarManufacturer() != guitarSpec.getGuitarManufacturer())
			return false;
		else if (guitarSpec.getGuitarType() != null && super.getGuitarType() != guitarSpec.getGuitarType())
			return false;
		else if (guitarSpec.getGuitarTopWood() != null && super.getGuitarTopWood() != guitarSpec.getGuitarTopWood())
			return false;
		else if (guitarSpec.getGuitarBackWood() != null && super.getGuitarBackWood() != guitarSpec.getGuitarBackWood())
			return false;		
		else if (guitarSpec.getGuitarModel() != null && !guitarSpec.getGuitarModel().toUpperCase().equals(this.getModel().toUpperCase()))
			return false;
		else if (guitarSpec.getMinPrice() <= this.price && guitarSpec.getMaxPrice() <= this.price)
			return false;
		return true;
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

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public String getModel() {
		return getGuitarModel();
	}
	
	public Manufacturer getGuitarManufacturer() {		
		return super.getGuitarManufacturer();
	}

	public Type getGuitarType() {
		return super.getGuitarType();
	}
	
	public Wood getGuitarTopWood() {
		return super.getGuitarTopWood();
	}

	public Wood getGuitarBackWood() {
		return super.getGuitarBackWood();
	}

	/**
	 * Returns the manufacturer model
	 */
	public String getGuitarModel() {
		return super.getGuitarModel();
	}
	
	/**
	 * Returns the name of the manufacturer
	 */
	public String getManufacturer() {
		if(getGuitarManufacturer() == null)
			return null;
		
		return getGuitarManufacturer().toString();		
	}

	/**
	 * Returns the guitar type
	 * @return
	 */
	public String getType() {
		if(getGuitarType() == null)
			return null;
		
		return getGuitarType().toString();
	}

	/**
	 * Returns the type of wood used in the body
	 */
	public String getBackWood() {
		if(getGuitarBackWood() == null)			
			return null;
		
		return getGuitarBackWood().toString();
	}

	/**
	 * Returns the type of wood used in the face
	 */
	public String getTopWood() {
		if(getGuitarTopWood() == null)			
			return null;
		
		return getGuitarTopWood().toString();
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
		return String.format(toStringFormat, getManufacturer(), getModel(), getType(), numberOfStrings, getTopWood(), getBackWood(), price, serialNumber);
	}

	/**
	 * The guitars manufacturer serial number
	 */
	private String serialNumber;	

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
