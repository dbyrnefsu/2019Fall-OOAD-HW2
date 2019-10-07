package edu.fitchburgstate.csc7400.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuitarSpec implements GuitarInterface{

	

	public Manufacturer manufacturer;
	public Type type;
	public Wood topWood;
	public Wood backWood;
	public String model;
	
	
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
	
	 @Override
	    public boolean equals(Object obj) {
	        if (obj == this) {
	            return true;
	        }
	        if (obj == null || obj.getClass() != this.getClass()) {
	            return false;
	        }
	        
	        GuitarSpec guest = (GuitarSpec) obj;
	        return this.backWood == guest.backWood
	                && (this.topWood == guest.topWood )
	                   && (model != null && this.model.equals(guest.getModel()))
	                && (this.type == guest.type )
	                     && this.manufacturer==guest.manufacturer;
	    }
	 

	   public boolean matches(Object obj) {
	    	 GuitarSpec guest = (GuitarSpec) obj;
	    	 Pattern p = Pattern.compile(guest.toString());
	    	 Matcher m = p.matcher(this.toString());
	    	return m.matches();
	   }
	
}
