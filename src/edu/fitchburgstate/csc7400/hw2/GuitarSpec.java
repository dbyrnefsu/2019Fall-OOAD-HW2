package edu.fitchburgstate.csc7400.hw2;

public class GuitarSpec implements GuitarInterface {
	
	public GuitarSpec(Manufacturer manufacturer,
			String model,
			Type type,
			Wood backWood,
			Wood topWood
			) {
		setManufacturer(manufacturer);
		setModel(model);
		setType(type);
		setTopWood(topWood);
		setBackWood(backWood);
	}
	
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	/**
	 * Returns the name of the manufacturer
	 */
	public Manufacturer getManufacturer() {
		return this.manufacturer;
	}
	
	public void setModel(String model) {
		if(model==null) 
			this.model="";
		else
			this.model = model;
	}

	/**
	 * Returns the manufacturer model
	 */
	public String getModel() {
		return model;
	}

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
	
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	/**
	 * Returns the type of wood used in the body
	 */
	public Wood getBackWood() {
		return backWood;
	}
	
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	/**
	 * Returns the type of wood used in the face
	 */
	public Wood getTopWood() {
		return topWood;
	}
	
	public boolean equals(GuitarSpec gs) {
		if(this.manufacturer !=gs.manufacturer)
			return false;
		if(this.backWood !=gs.backWood)
			return false;
		if(this.topWood !=gs.topWood)
			return false;
		if(this.type !=gs.type)
			return false;
		if(!this.model.equalsIgnoreCase(gs.model))
			return false;
		return true;
	}
	public boolean matches(GuitarSpec gs) {
		if(gs.manufacturer!= Manufacturer.Any && this.manufacturer !=gs.manufacturer)
			return false;
		if(gs.backWood!=Wood.Any && this.backWood !=gs.backWood)
			return false;
		if(gs.topWood != Wood.Any && this.topWood !=gs.topWood)
			return false;
		if(gs.type!=Type.Any && this.type !=gs.type)
			return false;
		if(!gs.model.equals("") && !this.model.equalsIgnoreCase(gs.model))
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
