package edu.fitchburgstate.csc7400.hw2;

/**
 * GuitarSpec contains information of a specification for a set of values
 * for guitars based on the following values:
 * - manufacturer
 * - type
 * - top wood
 * - back wood
 * - model 
 * 
 * @author xia.jin
 *
 */

public class GuitarSpec implements GuitarInterface {
	/**
	 * Full constructor
	 * @param manufacturer
	 * @param type
	 * @param topWood
	 * @param backWood
	 * @param model
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
	 * Constructor, use string input for all values
	 * @param manufacturer
	 * @param type
	 * @param topWood
	 * @param backWood
	 * @param model
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
	 * Returns the name of the manufacturer in a guitar specification
	 */ 
	@Override
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	/** 
	 * Returns the guitar type in a guitar specification
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 *  Returns the type of the wood used in body in a guitar specification
	 */
	@Override
	public Wood getBackWood() {
		return backWood;
	}
	
	/**
	 *  Returns the type of the wood used in the face in a guitar specification
	 */
	@Override
	public Wood getTopWood() {
		return topWood;
	}

	/**
	 *  Returns the model in a guitar specification
	 */
	@Override
	public String getModel() {
		return model;
	}
	
	// Sets the manufacturer in a guitar specification
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;		
	}
	
	// Sets type in a guitar specification
	public void setType(Type type) {
		this.type = type;
	}

	// Sets top wood in a guitar specification
	public void setTopWood(Wood wood) {
		this.topWood = wood;
	}

	// Sets back wood in a guitar specification
	public void setBackWood(Wood wood) {
		this.backWood = wood;
	}

	// Sets model in a guitar specification
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Finds if the guitar spec equals to another spec
	 * Check if every value equals to the value in another spec
	 * @param otherSpec
	 * @return true if equals, false if not equal
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
	 * Finds if the guitar spec matches to another spec
	 * if value is specified, check if equals to the value in another spec
	 * if value is unspecified, then no need to check
	 * @param otherSpec
	 * @return returns true if matches, false if does not match
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
	 * Turns a guitar object into a readable string
	 */
	public String toString() {
		return String.format(toStringFormat, manufacturer, type, backWood, topWood, model );
	}

	/**
	 * The name of the manufacturer in a guitar specification
	 */
	private Manufacturer manufacturer;

	/**
	 * The manufacturer model number in a guitar specification
	 */
	private String model;

	/**
	 * The guitar type (electric/acoustic) in a guitar specification
	 */
	private Type type;

	/**
	 * The wood used for the back of the guitar in a guitar specification
	 */
	private Wood backWood;

	/**
	 * The wood used for the face of the guitar in a guitar specification
	 */
	private Wood topWood;

	/**
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Type: %s; Back wood: %s; Top wood: %s; Model: %s";

	
}
