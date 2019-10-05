package edu.fitchburgstate.csc7400.hw2;

public class GuitarSpec implements GuitarInterface {
	/**
	 * Manufacture name in a guitar specification.
	 */
	private Manufacturer manufacturer;

	/**
	 * Guitar type (electric/acoustic) in a guitar specification.
	 */
	private Type type;

	/**
	 * Wood used for the face of the guitar.
	 */
	private Wood topWood;

	/**
	 * Wood used for the back of the guitar.
	 */
	private Wood backWood;

	/**
	 * Manufacturer model number in a guitar specification.
	 */
	private String model;

	public GuitarSpec() {
		
	}

	/**
	 * Full constructor
	 *	
	 * @param manufacturer the guitar's manufacturer
	 * @param model the manufacturers model
	 * @param type guitar type (electric/acoustic)
	 * @param backWood the wood used for the guitar body
	 * @param topWood the wood used for the guitar's face
	 */
	public GuitarSpec(Manufacturer manufacturer, Type type, Wood topWood, Wood backWood, String model) {
		
		this.manufacturer = manufacturer;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
		this.model = model;
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
		// TODO Auto-generated method stub
		return type;
	}

	/**
	 * Returns the type of wood used in the face
	 */
	@Override
	public Wood getTopWood() {
		// TODO Auto-generated method stub
		return topWood;
	}

	/**
	 * Returns the type of wood used in the body
	 */
	@Override
	public Wood getBackWood() {
		return backWood;
	}

	/**
	 * Returns the manufacturer model 	
	 */
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Validates if the given guitar specification is equal to other guitar
	 * specification.
	 * 
	 * @param other
	 * @return true if equals, false if not equal
	 */
	public boolean equals(GuitarSpec other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (getClass() != other.getClass())
			return false;
		if (backWood != other.backWood)
			return false;
		if (manufacturer != other.manufacturer)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (topWood != other.topWood)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	// To be completed
	public boolean mathces(GuitarSpec other) {

		return true;
	}
}
