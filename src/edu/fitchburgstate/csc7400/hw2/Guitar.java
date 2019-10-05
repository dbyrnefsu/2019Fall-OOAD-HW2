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
			Wood backWood,
			Wood topWood,			
			Integer numStrings) {
		if(serialNumber==null) 
			this.serialNumber="";
		else
			this.serialNumber = serialNumber;
		this.price = price;
		gs = new GuitarSpec(manufacturer,
				model,
				type,
				backWood,
				topWood);
		if (numStrings == null) this.numberOfStrings = 0;
		else this.numberOfStrings = numStrings;
	}

	public Manufacturer getManufacturer() {
		return gs.getManufacturer();
	}
	public Type getType() {
		return gs.getType();
	}
	public String getModel() {
		return gs.getModel();
	}
	public Wood getBackWood() {
		return gs.getBackWood();
	}
	public Wood getTopWood() {
		return gs.getTopWood();
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
	 * Returns the number of string for this guitar
	 */
	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	/**
	 * Turn object into a readable string
	 */
	public String toString() {
		return String.format(toStringFormat,
				gs.getManufacturer(),
				gs.getModel(),
				gs.getType(),
				numberOfStrings, 
				gs.getTopWood(),
				gs.getBackWood(),
				price,
				serialNumber);
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
	
	private GuitarSpec gs;
	
	public boolean equals(Guitar g) {
		if(!this.gs.equals(g.gs)) { // checking passed specs with current specs
			return false; 
		}
		if(this.serialNumber!=g.serialNumber) {
			return false;
		}
		if(this.price!=g.price) {
			return false;
		}
		if(this.numberOfStrings!=g.numberOfStrings) {
			return false;
		}
		return true;
	}
	
	public boolean matches(GuitarSpec gs) {
		return this.gs.matches(gs);
	}
	

	/**
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Model:%s; Type:%s; Num String: %d; Top wood: %s; Back wood:%s; Price:%.2f; Serial Num:%s";
	
	
}
