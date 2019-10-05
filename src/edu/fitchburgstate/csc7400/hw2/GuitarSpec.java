package edu.fitchburgstate.csc7400.hw2;

/**
 * 
 * @author ssribhas
 *
 */
public class GuitarSpec implements GuitarInterface {
	
	/**
	 * The name of the manufacturer
	 */
	private GuitarManufacturer manufacturer;

	/**
	 * The manufacturer model number
	 */
	private String model;

	/**
	 * The guitar type (electric/acoustic)
	 */
	private GuitarType type;

	/**
	 * The wood used for the back of the guitar
	 */
	private GuitarWood backWood;

	/**
	 * The wood used for the face of the guitar
	 */
	private GuitarWood topWood;
	
	public enum GuitarWood {
		ADIRONDACK("Adirondack"),
		ALDER("Alder"),
		BRAZILIANROSEWOOD("Brazilian Rosewood"),
		CEDAR("Cedar"),
		COCOBOLO("Cocobolo"),
		INDIANROSEWOOD("Indian_Rosewood"),
		MAHOGANY("Mahogany"),
		MAPLE("Maple"),
		SITKA("Sitka");
		
		private String displayName;
		
		GuitarWood(String displayName) {
			this.displayName = displayName;
		}
		
		public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}

	public enum GuitarType {
		ACOUSTIC("Acoustic"),
		ELECTRIC("Electric");
		
		private String displayName;
		
		GuitarType(String displayName) {
			this.displayName = displayName;
		}
		
		public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}

	public enum GuitarManufacturer {
		COLLINS("Collins"),
		FENDER("Fender"),
		MARTIN("Martin"),
		GIBSON("Gibson"),
		OLSON("Olson"),
		PRS("PRS"),
		RYAN("Ryan");
		
		private String displayName;
		
		GuitarManufacturer(String displayName) {
			this.displayName = displayName;
		}
		
		public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
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
		if (
				this.manufacturer == newGuitarSpec.getManufacturer() &&
				this.model == newGuitarSpec.getModel() &&
				this.backWood == newGuitarSpec.getBackWood() &&
				this.topWood == newGuitarSpec.getTopWood() &&
				this.type == newGuitarSpec.getType()
			) {
			return true;
		}
		return false;
	}
	
	/**
	 * Compares anyone property of new guitar spec to this guitar spec
	 * 
	 * @param GuitarSpec newGuitarSpec new Guitar spec
	 * @return true if any property of new guitar spec matches this guitar spec
	 */
	public boolean matches(GuitarSpec newGuitarSpec) {
		if (
				this.manufacturer == newGuitarSpec.getManufacturer() ||
				this.model == newGuitarSpec.getModel() ||
				this.backWood == newGuitarSpec.getBackWood() ||
				this.topWood == newGuitarSpec.getTopWood() ||
				this.type == newGuitarSpec.getType()
			) {
			return true;
		}
		return false;
	}

}
