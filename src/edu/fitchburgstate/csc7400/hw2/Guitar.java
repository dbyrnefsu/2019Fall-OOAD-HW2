package edu.fitchburgstate.csc7400.hw2;
/**
 * Class        : Object-Oriented Analysis and Design
 * Professor    : Orlando Montalvo
 * Assignment   : HW-2
 * Date         : 10-06-2019
 * @author      : Sravani Veerapureddy and Yamini Gopisetti
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class Guitar implements GuitarInterface{
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
	
	private String serialNumber;
	private double price;
	public Manufacturer manufacturer;
	public Type type;
	public Wood topWood;
	public Wood backWood;
	public String model;
	public int numberOfStrings;
	
	
	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	public Guitar(String serialNumber, 
			double price, 
			Manufacturer manufacturer, 
			String model, 
			Type type, 
			Wood backWood,
			Wood topWood,
			Integer numStrings) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.manufacturer = manufacturer;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		if (numStrings == null) this.numberOfStrings = 0;
		else this.numberOfStrings = numStrings;
	}
        /**
	 * Returns the manufacturer serial number
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	@Override
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Guitar guest = (Guitar) obj;
        return this.backWood == guest.backWood
                && (this.topWood == guest.topWood )
                   && (model != null && this.model.equals(guest.getModel()))
                && (this.type == guest.type )
                     && this.manufacturer==guest.manufacturer 
                     && this.price==guest.getPrice() && this.serialNumber.equalsIgnoreCase(guest.getSerialNumber());
    }
	
	   public boolean matches(Object obj) {
	    	 Guitar guest = (Guitar) obj;
	    	 Pattern p = Pattern.compile(guest.toString());
	    	 Matcher m = p.matcher(this.toString());
	    	return m.matches();
	   }	
	   
	   public String toString() {
			return String.format(toStringFormat, manufacturer, model, type, numberOfStrings, topWood, backWood, price, serialNumber);
		}
	   
	   private static String toStringFormat = "Manufacturer: %s; Model:%s; Type:%s; Num String: %d; Top wood: %s; Back wood:%s; Price:%.2f; Serial Num:%s";
}
