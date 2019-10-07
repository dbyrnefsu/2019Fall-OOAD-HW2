/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2019-10-05
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * Guitar contains the information needed to keep track of a type of guitar from
 * Rick's music store
 * 
 * @author Priya
 * @author Parker
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
				topWood,
				numStrings,
				price,
				price);
		
	}
	
	/**
	 * Returns the name of the manufacturer
	 * @return
	 */
	public Manufacturer getManufacturer() {
		return gs.getManufacturer();
	}
	
	/**
	 * Returns the guitar type
	 * @return
	 */
	public Type getType() {
		return gs.getType();
	}
	
	/**
	 * Returns the manufacturer model
	 * @return
	 */
	public String getModel() {
		return gs.getModel();
	}
	
	/**
	 * Returns the type of wood used in the body
	 * @return
	 */
	public Wood getBackWood() {
		return gs.getBackWood();
	}
	
	/**
	 * Returns the type of wood used in the face
	 * @return
	 */
	public Wood getTopWood() {
		return gs.getTopWood();
	}
	
	/**
	 * Returns the manufacturer serial number
	 * @return
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Returns store price of guitar
	 * @return
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
	 * @return
	 */
	public int getNumberOfStrings() {
		return gs.getnumStrings();
	}

	/**
	 * Turn object into a readable string
	 */
	public String toString() {
		return String.format(toStringFormat,
				gs.getManufacturer(),
				gs.getModel(),
				gs.getType(),
				gs.getnumStrings(), 
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
	 * Guitars specification for this class
	 */
	private GuitarSpec gs;
	
	/**
	 * Compares two guitars and return True/false 
	 * 
	 * @param guitar object
	 * @return true if it equals a guitar else false
	 */
	public boolean equals(Guitar otherGuitar) {
		if(!this.gs.equals(otherGuitar.gs)) { // checking passed specifications with current specifications 
			return false; 
		}
		if(this.serialNumber!=otherGuitar.serialNumber) {
			return false;
		}
		if(this.price!=otherGuitar.price) {
			return false;
		}
		return true;
	}
	
	/**
	 * Checks for the matching guitars and return True/false 
	 * 
	 * @param guitar's specifications 
	 * @return true if matching guitars are found else false
	 */
	public boolean matches(GuitarSpec otherGs) {
		if(otherGs.getManufacturer()!= Manufacturer.Any && this.gs.getManufacturer() !=otherGs.getManufacturer())
			return false;
		if(otherGs.getBackWood()!=Wood.Any && this.getBackWood() !=otherGs.getBackWood())
			return false;
		if(otherGs.getTopWood() != Wood.Any && this.getTopWood() !=otherGs.getTopWood())
			return false;
		if(otherGs.getType()!=Type.Any && this.getType() !=otherGs.getType())
			return false;
		if(otherGs.getnumStrings()!=0 && this.getNumberOfStrings() !=otherGs.getnumStrings())
			return false;
		if(!otherGs.getModel().equals("") && !this.getModel().equalsIgnoreCase(otherGs.getModel()))
			return false;
		if(this.price < otherGs.getMinPrice() || this.price>otherGs.getMaxPrice())
			return false;
		return true;
	}
	

	/**
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Model:%s; Type:%s; Num String: %d; Top wood: %s; Back wood:%s; Price:%.2f; Serial Num:%s";
	
	
}
