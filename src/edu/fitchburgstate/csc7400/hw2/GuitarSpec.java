/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Students: Abha Kumari, Divya Mallepally, Vineela Venula 
 * Date: 2019-10-06
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * GuitarSpec contains the information needed to keep track guitar specs from
 * Rick's music store
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
	 * @param min price to search guitar
	 * @param max price to search guitar
	 */
	
	public GuitarSpec(String manufacturer, String model, String type, String backWood, String topWood, double minPrice, double maxPrice) {
		if (manufacturer == null) this.manufacturer = null;
		else this.manufacturer =  Enum.valueOf(Manufacturer.class, manufacturer.toUpperCase());
		
		this.model = model;
		
		if (type == null) this.type = null;
		else this.type =  Enum.valueOf(Type.class, type.toUpperCase());		
	
		if (backWood == null) this.backWood = null;
		else this.backWood =  Enum.valueOf(Wood.class, backWood.toUpperCase());
		
		if (topWood == null) this.topWood = null;
		else this.topWood =  Enum.valueOf(Wood.class, topWood.toUpperCase());
		
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
	}

	/**
	 * Verifies guitar specs equals with another guitar specs
	 * @param guitar is the guitar
	 * @return if equals returns true else false
	 */	
	public boolean equals(GuitarSpec guitarSpec) {
		if (this.manufacturer != guitarSpec.manufacturer)
			return false;
		else if (this.type != guitarSpec.type)
			return false;
		else if (this.topWood != guitarSpec.topWood)
			return false;
		else if (this.backWood != guitarSpec.backWood)
			return false;
		else if (!this.model.toUpperCase().equals(guitarSpec.model.toUpperCase()))
			return false;
		return true;
	}

	/**	
	 * Verifies guitar specs matches with another guitar specs
	 * @param guitarSpec spec of guitar
	 * * @return if spcs matches returns true else false
	 */
	public boolean matches(GuitarSpec guitarSpec) {
		if (guitarSpec.manufacturer != null && this.manufacturer != guitarSpec.manufacturer)
			return false;
		else if (guitarSpec.type != null && this.type != guitarSpec.type)
			return false;
		else if (guitarSpec.topWood != null && this.topWood != guitarSpec.topWood)
			return false;
		else if (guitarSpec.backWood != null && this.backWood != guitarSpec.backWood)
			return false;		
		else if (guitarSpec.model != null && !guitarSpec.model.toUpperCase().equals(this.model.toUpperCase()))
			return false;
		return true;
	}

	/**
	 * Returns min price for searching guitar
	 */
	public double getMinPrice() {
		return minPrice;
	}
	
	/**
	 * Returns max price for searching guitar
	 */
	public double getMaxPrice() {
		return maxPrice;
	}

	/**
	 * Returns the name of the manufacturer
	 */
	public Manufacturer getGuitarManufacturer() {		
		return manufacturer;
	}

	/**
	 * Returns the guitar type
	 * @return electric or acoustic
	 */
	public Type getGuitarType() {
		return type;
	}

	/**
	 * Returns the type of wood used in the face
	 */
	public Wood getGuitarTopWood() {
		return topWood;
	}

	/**
	 * Returns the type of wood used in the body
	 */
	public Wood getGuitarBackWood() {
		return backWood;
	}

	/**
	 * Returns the manufacturer model
	 */
	public String getGuitarModel() {
		return model;
	}
	
	/**
	 * The manufacturer model
	 */
	private String model;
	
	/**
	 * The name of the manufacturer
	 */
	private Manufacturer manufacturer;
	
	/**
	 * The guitar type (electric/acoustic)
	 */
	private Type type;
	
	/**
	 * The wood used for the back and front of the guitar
	 */
	private Wood backWood, topWood;
	
	/**
	 * Min and max price to search the guitar
	 */
	private double minPrice, maxPrice;
}
