package edu.fitchburgstate.csc7400.hw2;

public class GuitarSpec implements GuitarInterface {

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

	public double getMinPrice() {
		return minPrice;
	}	

	public double getMaxPrice() {
		return maxPrice;
	}

	public Manufacturer getGuitarManufacturer() {		
		return manufacturer;
	}

	public Type getGuitarType() {
		return type;
	}

	public Wood getGuitarTopWood() {
		return topWood;
	}

	public Wood getGuitarBackWood() {
		return backWood;
	}

	public String getGuitarModel() {
		return model;
	}	

	private String model;	

	private Manufacturer manufacturer;	

	private Type type;	

	private Wood backWood, topWood;	

	private double minPrice, maxPrice;
}
