/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Xia Jin, Akhila Lolam
 * Date: 2019-10-03
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * GuitarSpec contains information of a specification
 * for guitars based on the following values:
 * - manufacturer
 * - type
 * - top wood
 * - back wood
 * - model 
 * 
 * @author xia.jin
 */

public class GuitarSpec implements GuitarInterface {
	/**
	 * Full constructor
	 * Takes enum type for manufacturer, type, backWood, and topWood
	 * @param manufacturer the guitar's manufacturer
	 * @param type guitar type 
	 * @param backWood the wood used for the guitar body
	 * @param topWood the wood used for the guitar's face
	 * @param model the manufacturers model
	 */
	public GuitarSpec(Manufacturer manufacturer,
			Type type,
			Wood backWood,
			Wood topWood,
			String model) {
		this.manufacturer = manufacturer;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.model = model;
	}
	
	/**
	 * Constructor
	 * Takes String type for manufacturer, type, backWood, and topWood
	 * @param manufacturer the guitar's manufacturer
	 * @param type guitar type 
	 * @param backWood the wood used for the guitar body
	 * @param topWood the wood used for the guitar's face
	 * @param model the manufacturers model
	 */
	public GuitarSpec(String manufacturer, String type, String backWood, String topWood, String model) {
		if(manufacturer!=null) {
			this.manufacturer = Manufacturer.valueOf(manufacturer.toUpperCase());
		}
		if(type != null) {
			this.type = Type.valueOf(type.toUpperCase());
		}
		if(backWood != null) {
			this.backWood = Wood.valueOf(backWood.toUpperCase());
		}
		if(topWood != null) {
			this.topWood = Wood.valueOf(topWood.toUpperCase());
		}
		if(model != null) {
			this.model = model;
		}
		
	}
	
	/**
	 * Returns the name of the manufacturer
	 */ 
	@Override
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	/** 
	 * Returns the guitar type
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 *  Returns the type of the wood used in the body 
	 */
	@Override
	public Wood getBackWood() {
		return backWood;
	}
	
	/**
	 *  Returns the type of the wood used in the face
	 */
	@Override
	public Wood getTopWood() {
		return topWood;
	}

	/**
	 *  Returns the model
	 */
	@Override
	public String getModel() {
		return model;
	}
	
	/** 
	 * Sets the manufacturer in a guitar specification
	 * @param manufacturer
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;		
	}
	
	/**
	 * Sets type in a guitar specification
	 * @param type
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * Sets top wood in a guitar specification
	 * @param wood
	 */
	public void setTopWood(Wood wood) {
		this.topWood = wood;
	}

	/**
	 * Sets back wood in a guitar specification
	 * @param wood
	 */
	public void setBackWood(Wood wood) {
		this.backWood = wood;
	}

	/**
	 * Sets model in a guitar specification
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Finds if the guitar specification equals to another guitar specification
	 * Check if every value equals to the value in another specification
	 * @param otherSpec a guitar specification
	 * @return returns true if equals, false if not equal
	 */
	public boolean equals(GuitarSpec otherSpec) {
		if(this.manufacturer != otherSpec.manufacturer) 
			return false;
		else if (this.type != otherSpec.type)
			return false;
		else if (this.topWood != otherSpec.topWood)
			return false;
		else if (this.backWood != otherSpec.backWood)
			return false;
		else if (!this.model.equals(otherSpec.model))
			return false;
		return true;
	}
	
	/**
	 * Finds if the guitar specification matches to another guitar specification,
	 * Compares values in the guitar specification and another guitar specification,
	 * if a value in another guitar specification is specified, 
	 * check if it equals to the value in the guitar specification;
	 * if a value in another guitar specification is unspecified, 
	 * treat as wildcard and will not compare.
	 * @return returns true if every specified value in another guitar specification equals to 
	 * the value in the guitar specification; 
	 * returns false if any specified value in another guitar specification does not equal to 
	 * the value in the guitar specification.
	 */
	public boolean matches(GuitarSpec otherSpec) {
		if(otherSpec.manufacturer != null && this.manufacturer != otherSpec.manufacturer) 
			return false;
		else if (otherSpec.type != null && this.type != otherSpec.type)
			return false;
		else if (otherSpec.topWood != null && this.topWood != otherSpec.topWood)
			return false;
		else if (otherSpec.backWood !=null && this.backWood != otherSpec.backWood)
			return false;
		else if (otherSpec.model != null && !otherSpec.model.toUpperCase().equals(this.model.toUpperCase()))
			return false;
		return true;
	}
	
	/**
	 * Turns a GuitarSpec object into a readable string
	 */
	public String toString() {
		return String.format(toStringFormat, manufacturer, type, backWood, topWood, model);
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
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Type: %s; Back wood: %s; Top wood: %s; Model: %s";

	
}
