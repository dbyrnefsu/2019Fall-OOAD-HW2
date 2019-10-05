/**
 * Class : object-oriented Design and Analysis
 * professor : Ornaldo Montalvo
 * Assignment : HW2
 * Student : Abha Kumari
 */
package edu.fitchburgstate.csc7400.hw2;
/**
 * Guitarspec contains information about guitars from Rick's music store.
 * This data contains manufacturer, model, type of guitar and type of used in the guitars. 
 * This is used to search guitar in inventory.
 * @author abhak
 *
 */

public class GuitarSpec implements GuitarInterface {

/**
 * 
 */


	private String model;

	private Manufacturer manufacturer;

	private Type type;

	private Wood backWood, topWood;

	private double minPrice, maxPrice;
	/**
	 * constructor of guitarspec with the parameter
	 * 
	 * @param manufacturer
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 * @param minPrice
	 * @param maxPrice
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



	public GuitarSpec() {

	}

/**
 * 
 * @param guitarSpec
 * @return boolean value. true if the specification is equals otherwise false
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
 * Match each guitar with search guitar
 * @param guitarSpec
 * @return return the true if guitars specification match with the guitar otherwise return false
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
 * gets the minimum price of guitar
 * @return price
 */
	

	public double getMinPrice() 
	{

		return minPrice;

	}
/**
 * gets the maximum price of guitar
 * @return price of guitar
 */
	

	public double getMaxPrice() {

		return maxPrice;

	}

/**
 * gets the manufacturer of guitar
 */

	public Manufacturer getManufacturer() {		

		return manufacturer;

	}

/**
 * gets the type of guitar
 */

	public Type getType() {

		return type;

	}

/**
 * gets the topwood of guitar
 * @return topwood
 */

	public Wood getTopWood() {

		return topWood;

	}

/**
 * gets the backwood of guitar
 * @return backwood
 */

	public Wood getBackWood() {

		return backWood;

	}
/**
 * gets the model of guitar
 * @return the model
 */


	public String getModel() {

		return model;

	}

}