package edu.fitchburgstate.csc7400.hw2;

public interface GuitarInterface {
	
	/**
	 * Returns the manufacturer model
	 */
	public Manufacturer getGuitarManufacturer();
	
	/**
	 * Returns the guitar type	
	 */	
	public Type getGuitarType();
	
	/**
	 * Returns the type of wood used in the face
	 */
	public Wood getGuitarTopWood();
	
	/**
	 * Returns the type of wood used in the body
	 */
	public Wood getGuitarBackWood();
	
	/**
	 * Returns the manufacturer model
	 */
	public String getGuitarModel();
}
