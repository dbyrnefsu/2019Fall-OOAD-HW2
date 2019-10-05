/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2019-10-05
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * GuitarSpec contains the specifications needed to keep track of a type of guitar from
 * Rick's music store
 * 
 * @author Priya
 *
 */
public class GuitarSpec implements GuitarInterface {
	
	/**
	 * Full constructor
	 * 
	 * @param manufacturer the guitar's manufacturer
	 * @param model the manufacturers model
	 * @param type guitar type (electric/acoustic)
	 * @param backWood the wood used for the guitar body
	 * @param topWood the wood used for the guitar's face
	 */
	public GuitarSpec(Manufacturer manufacturer,
			String model,
			Type type,
			Wood backWood,
			Wood topWood,
			Integer numStrings)
			 {
		setManufacturer(manufacturer);
		setModel(model);
		setType(type);
		setTopWood(topWood);
		setBackWood(backWood);
		setnumStrings(numStrings);
	}
	
	/**
	 * Sets the manufacturer of the guitar
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	/**
	 * Returns the name of the manufacturer
	 * @return 
	 */
	public Manufacturer getManufacturer() {
		return this.manufacturer;
	}
	
	/**
	 * Sets the model of the guitar
	 */
	public void setModel(String model) {
		if(model==null) 
			this.model="";
		else
			this.model = model;
	}

	/**
	 * Returns the manufacturer model
	 * @return
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Sets the type of the guitar
	 */
	public void setType(Type type) {
		this.type = type;
	}
	
	/**
	 * Returns the guitar type
	 * @return
	 */
	public Type getType() {
		return type;
	}
	
	/**
	 * Sets the backwoods of the guitar
	 */
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	/**
	 * Returns the type of wood used in the body
	 * @return
	 */
	public Wood getBackWood() {
		return backWood;
	}
	
	/**
	 * Sets the topwood of the guitar
	 */
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	/**
	 * Returns the type of wood used in the face
	 * @return
	 */
	public Wood getTopWood() {
		return topWood;
	}
	
	public void setnumStrings(Integer numStrings) {
		if (numStrings == null) this.numStrings = 0;
		else this.numStrings = numStrings;
	}
	
	public Integer getnumStrings() {
		return numStrings;
	}
	
	
	/**
	 * Compares two guitars with the specifications and return True/false 
	 * 
	 * @param guitarSpec object
	 * @return true if it equals a guitar else false
	 */
	public boolean equals(GuitarSpec otherGs) {
		if(this.manufacturer !=otherGs.manufacturer)
			return false;
		if(this.backWood !=otherGs.backWood)
			return false;
		if(this.topWood !=otherGs.topWood)
			return false;
		if(this.type !=otherGs.type)
			return false;
		if(this.numStrings != otherGs.numStrings)
			return false;
		if(!this.model.equalsIgnoreCase(otherGs.model))
			return false;
		return true;
	}
	
	/**
	 * Checks for the matching guitars and return True/false 
	 * 
	 * @param guitar's specifications
	 * @return true if matching guitars are found else false
	 */
	public boolean matches(GuitarSpec otherGs) {
		if(otherGs.manufacturer!= Manufacturer.Any && this.manufacturer !=otherGs.manufacturer)
			return false;
		if(otherGs.backWood!=Wood.Any && this.backWood !=otherGs.backWood)
			return false;
		if(otherGs.topWood != Wood.Any && this.topWood !=otherGs.topWood)
			return false;
		if(otherGs.type!=Type.Any && this.type !=otherGs.type)
			return false;
		if(otherGs.numStrings!=0 && this.numStrings !=otherGs.numStrings)
			return false;
		if(!otherGs.model.equals("") && !this.model.equalsIgnoreCase(otherGs.model))
			return false;
		return true;
	}
	
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
	 * The num of strings of the guitar
	 */
	private Integer numStrings;
	
	/**
	 * Turn object into a readable string
	 */
	public String toString() {
		return String.format(toStringFormat,
				getManufacturer(),
				getModel(),
				getType(),
				getTopWood(),
				getBackWood() );
	}

	
	/**
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Model:%s; Type:%s; Top wood: %s; Back wood:%s;";

}
