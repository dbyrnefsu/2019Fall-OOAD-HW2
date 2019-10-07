

package edu.fitchburgstate.csc7400.hw2;

/**
 * Class		: Object-Oriented Design and Analysis
 * Professor	: Orlando Montalvo
 * Assignment	: HW 2 
 * Guitar contains the information needed to keep track of a type of guitar from
 * Rick's music store.
 * Contains manufacturer's serial number, price and GuitarSpec 
 * which can be used to search guitars in the inventory.
 *  
 * @students: Komal and Zi Lin(@01411726 and @01375707)
 * @since 10-03-2019
 * @author Orlando
 *
 */
public class Guitar implements GuitarInterface{
	
	 //gs object to hold the specifications of Guitar
	
	private GuitarSpec gs;


	/**
	 * Full constructor
	 * 
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param manufacturer the guitar's manufacturer
	 * @param type guitar type (electric/acoustic)
	 * @param model the manufacturers model
	 * @param backWood the wood used for the guitar body
	 * @param topWood the wood used for the guitar's face
	 * @param numString the number of strings for this guitar
	 */
	public Guitar(String serialNumber, 
			double price, 
			Manufacturer manufacturer, 
			Type type, 
			String model, 
			Wood backWood,
			Wood topWood,
			Integer numStrings) {
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
		this.model = model;
		this.type = type;
		this.price = price;
		this.backWood = backWood;
		this.topWood = topWood;
		//Build a GuitarSpec object
		 gs = new GuitarSpec(this.manufacturer, 
					this.type, 
					this.backWood, 
					this.topWood, 
					this.model);
	
	    if (numStrings == null) this.numberOfStrings = 0;
		else this.numberOfStrings = numStrings;
	   
		}
	
	//Full constructor for conditions where original datataype values are sent as parameters
	public Guitar(String serialNumber, double price, String manufacturer, String type, String model, 
			String backWood, String topWood, Integer numStrings) {
		if(manufacturer!=null) {
			this.manufacturer = Manufacturer.valueOf(manufacturer);
		}
		if(type != null) {
			this.type = Type.valueOf(type);
		}
		if(backWood != null) {
			this.backWood = Wood.valueOf(backWood);
		}
		if(topWood != null) {
			this.topWood = Wood.valueOf(topWood);
		}
		if(model != null) {
			this.model = model;
		}
		gs = new GuitarSpec(this.manufacturer, 
				this.type, 
				this.backWood, 
				this.topWood, 
				this.model);
		if (numStrings == null) this.numberOfStrings = 0;
		else this.numberOfStrings = numStrings;
	
	}
	
	
	/**
	 * Returns the manufacturer serial number
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Returns store price of guitar
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the store price of the guitar
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}


	/** Returns the number of string for this guitar
	 */
	public int getNumberOfStrings() {
		return numberOfStrings;
	}
	
	 public void setSpec(GuitarSpec spec)
	 {
		 this.gs = spec;
	 }

	/**
	 * Returns specifications of the guitar - GuitarSpec object
	 * 
	 * @return GuitarSpec returns GuitarSpec object of a guitar
	 */
	  
	 public GuitarSpec getSpec()
	 {
		 return gs;
	 }

	/**
	 * Turn object into a readable string
	 */
	public String toString() {
		return String.format(toStringFormat, manufacturer, model, type, numberOfStrings, topWood, backWood, price, serialNumber);
	}

	/**
	 * The guitars manufacturer serial number
	 */
	private String serialNumber;

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
	 * Rick's price for the guitar
	 */
	private double price;
	
	/**
	 * Guitars number of strings
	 */
	private int numberOfStrings;

	/**
	 * Formatting string for toString()
	 */
	private static String toStringFormat = "Manufacturer: %s; Model:%s; Type:%s; Num String: %d; Top wood: %s; Back wood:%s; Price:%.2f; Serial Num:%s";

	/** Match guitar with other guitar using different attributes/specifications
	 * True if values are same
	 * else, false is returned
	 * @param g
	 * @return true if match happens else false
	 */
	public boolean matches(GuitarSpec g) {
		System.out.println("GuitarSpec for search: " + g.toString());
		System.out.println("Current guitar:        " + this.toString());
		if(g.getManufacturer()!=null && g.getManufacturer()!=this.manufacturer)
			return false;
		if(g.getType()!=null && g.getType()!=this.type)
			return false;
		if(g.getBackWood()!=null && g.getBackWood()!= this.backWood)
			return false;
		if(g.getTopWood()!=null && g.getTopWood()!= this.topWood)
			return false;
		if(g.getModel()!= null && !g.getModel().equals(this.model))
			return false;
		return true;
	}

	/** Compares 2 guitars using different attributes
	 * True if values are same
	 * else, false is returned
	 * @param other
	 * @return
	 */
	public boolean equals(Guitar other) {
		if(!this.serialNumber.equals(other.serialNumber))
			return false;
		if(this.price != other.price) 
			return false;
		if(this.manufacturer != other.manufacturer)
			return false;
		if(!this.model.equals(other.model))
			return false;
		if(this.type != other.type)
			return false;
		if(this.topWood != other.topWood)
			return false;
		if(this.backWood != other.backWood)
			return false;
		if(this.numberOfStrings != other.numberOfStrings)
			return false;
		return true;
	}
	@Override
	public Manufacturer getManufacturer() {
		// TODO Auto-generated method stub
		return manufacturer;
	}

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public Wood getBackWood() {
		// TODO Auto-generated method stub
		return backWood;
	}

	@Override
	public Wood getTopWood() {
		// TODO Auto-generated method stub
		return topWood;
	}
	

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
	
}
