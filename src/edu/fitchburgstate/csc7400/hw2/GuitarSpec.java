package edu.fitchburgstate.csc7400.hw2;


/**
 * 
 * @author ssribhas
 *
 */
public class GuitarSpec implements GuitarInterface {
	
	private GuitarManufacturer manufacturer;
	private GuitarType type;
	private GuitarWood topWood;
	private GuitarWood backWood;
	private String model;
	
	public GuitarSpec (
			GuitarManufacturer manufacturer, 
			GuitarType type, 
			GuitarWood topWood, 
			GuitarWood backWood, 
			String model ) {
		
		this.manufacturer = manufacturer;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
		this.model = model;
	}
	
	/**
	 * Returns type of Guitar
	 */
	@Override
	public GuitarType getType() {
		return this.type;
	}

	/**
	 * Returns manufacturer of Guitar
	 */
	@Override
	public GuitarManufacturer getManufacturer() {
		return this.manufacturer;
	}

	/**
	 * Returns topwood of Guitar
	 */
	@Override
	public GuitarWood getTopWood() {
		return this.topWood;
	}

	/**
	 * Returns backwood of Guitar
	 */
	@Override
	public GuitarWood getBackWood() {
		return this.backWood;
	}

	/**
	 * Returns model of Guitar
	 */
	@Override
	public String getModel() {
		return this.model;
	}
	
	/**
	 * Setter for manufacturer
	 * @param manufacturer
	 */
	public void setManufacturer(GuitarManufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * Setter for model
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Setter for type
	 * @param type
	 */
	public void setType(GuitarType type) {
		this.type = type;
	}

	/**
	 * Setter for backwood
	 * @param backWood
	 */
	public void setBackWood(GuitarWood backWood) {
		this.backWood = backWood;
	}

	/**
	 * Setter for topwood
	 * @param topWood
	 */
	public void setTopWood(GuitarWood topWood) {
		this.topWood = topWood;
	}
	
	/**
	 * Compares all properties of new guitar spec to this guitar spec
	 * 
	 * @param GuitarSpec newGuitarSpec new Guitar spec
	 * @return true if all properties of new guitar spec matches this guitar spec
	 */
	public boolean equals(GuitarSpec newGuitarSpec) {
	
		return	this.manufacturer == newGuitarSpec.getManufacturer() &&
				this.model == newGuitarSpec.getModel() &&
				this.backWood == newGuitarSpec.getBackWood() &&
				this.topWood == newGuitarSpec.getTopWood() &&
				this.type == newGuitarSpec.getType();
			
	}
	
	/**
	 * Compares anyone property of new guitar spec to this guitar spec
	 * 
	 * @param GuitarSpec newGuitarSpec new Guitar spec
	 * @return true if any property of new guitar spec matches this guitar spec
	 */
	public boolean matches(GuitarSpec newGuitarSpec) {
		
		return  this.manufacturer == newGuitarSpec.getManufacturer() ||
				this.model == newGuitarSpec.getModel() ||
				this.backWood == newGuitarSpec.getBackWood() ||
				this.topWood == newGuitarSpec.getTopWood() ||
				this.type == newGuitarSpec.getType();
		
	}

}
