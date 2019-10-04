package edu.fitchburgstate.csc7400.hw2;

public interface GuitarInterface {

	//return the guitar's manufacturer
	public Manufacturer getManufacturer();
	
	//return the guitar's type
	public Type getType();
	
	//return the guitar's top wood
	public Wood getTopWood();
	
	//return the guitar's back wood
	public Wood getBackWood();
	
	//return the guitar's model
	public String getModel();
	
}
