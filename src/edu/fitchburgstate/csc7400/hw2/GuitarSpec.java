package edu.fitchburgstate.csc7400.hw2;

/**
 * Class		: Object-Oriented Design and Analysis
 * Professor	: Orlando Montalvo
 * Assignment	: HW 2 
 * 
 * GuitarSpec contains information about guitars from Rick's music store.
 * Contains manufacturer, model, type of guitar and type of wood used in the guitars.
 * Used to search guitars in the inventory.
 * 
 * @authors Komal and Zi Lin(@01411726 and @01375707)
 * @since 10-03-2019
 */

public class GuitarSpec implements GuitarInterface {
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
	 * Full constructor of GuitarSpec with below parameters
	 * @param Manufacturer Guitar's manufacturer
	 * @param model Guitar's Model
	 * @param type Guitar's Type
	 * @param backWood Guitar's BackWood
	 * @param topWood Guitar's TopWood
	 */
	public GuitarSpec(Manufacturer manufacturer, Type type, Wood backWood, Wood topWood, String model) {
		this.manufacturer = manufacturer;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.model = model;
	}
	//Full constructor for conditions where original datataype values are sent as parameters
	public GuitarSpec(String manufacturer, String type, String backWood, String topWood, String model) {
		if(manufacturer!=null) {
			this.manufacturer = Manufacturer.valueOf(manufacturer);
		}
		if(backWood != null) {
			this.backWood = Wood.valueOf(backWood);
		}
		if(topWood != null) {
			this.topWood = Wood.valueOf(topWood);
		}
		if(model != null) {
			this.model = model;
		if(type != null) {
			this.type = Type.valueOf(type);
		}

		}
		
	}
	
	
	 /**
	  * Gets manufacturer of the Guitar
	  * 
	  * @return Manufacturer Guitar's manufacturer
	  */
	@Override
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	
	/**
	   * Sets manufacturer of the guitar with the value passed as a parameter
	   * 
	   * @param manufacturer Guitar's manufacturer
	   */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;		
	}
	
	 /**
	   * Gets model of the guitar
	   * 
	   * @return model Guitar's model
	   */
	@Override
	public String getModel() {
		return model;
	}
	

	 /**
	   * Sets model of the guitar with the value passed as a parameter
	   * 
	   * @param model string value of Guitar's model
	   */
		public void setModel(String model) {
			this.model = model;
		}

		 /**
		   * Gets Type of the guitar 
		   * 
		   * @return type Guitar's type(electric/accoustic)
		   */
	@Override
	public Type getType() {
		return type;
	}

	
	/**
	   * Sets Type of the guitar with the value passed as a parameter
	   * 
	   * @param type Guitar's type(electric/accoustic)
	   */
	public void setType(Type type) {
		this.type = type;
	}
	
	 /**
	   * Returns Wood used for the back of the guitar 
	   * 
	   * @param backWood Guitar's backWood type
	   */
	@Override
	public Wood getBackWood() {
		return backWood;
	}
	
	 /**
	   * Sets Backwood value of the guitar with the value passed as a parameter
	   * 
	   * @param Wood Guitar's wood value for backWood
	   */
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	
	/**
	   * Returns Wood used for the body of the guitar 
	   * 
	   * @param topWood Guitar's topWood type
	   */
	@Override
	public Wood getTopWood() {
		return topWood;
	}



	 /**
	   * Sets Topwood value of the guitar with the value passed as a parameter
	   * 
	   * @param Wood Guitar's wood value for topWood
	   */
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	
	 /**
	  * Matches each guitar with search guitar
	  * @param g GuitarSpec Object for each guitar
	  * @return Boolean returns true if a guitar matches with search guitar, false if not.
	  */
	
	  public boolean matches(GuitarSpec g) {
		if(this.manufacturer != g.manufacturer) 
			return false; //check if every attribute is null or empty and return false
		else if (g.model != null && !this.model.toUpperCase().equals(g.model.toUpperCase()));
		//else if ((this.model != null) && (!this.model.equals("")) &&
		     //       (!this.model.toLowerCase().equals(g.model.toLowerCase())))
		   // return false;
		else if ((g.type != null) && (this.type != g.type))
			return false;
		else if ((g.topWood != null) && (this.topWood != g.topWood))
			return false;
		else if (g.backWood !=null && (this.backWood != g.backWood))
			return false;

		return true;

	}
	
	
	/**
	 * Finds if the guitarspec g equals to another guitar specification
	 * @param g GuitarSpec Object for each guitar
	 * @return Boolean returns true if a guitar equals to other guitar, false if not.
	 */
	public boolean equals(GuitarSpec g) {
		if(this.manufacturer != g.manufacturer) 
			return false;
		else if (this.type != g.type)
			return false;
		else if (this.topWood != g.topWood)
			return false;
		else if (this.backWood != g.backWood)
			return false;
		else if (!this.model.equals(g.model))
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
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Type: %s; Back wood: %s; Top wood: %s; Model: %s";

	
}
