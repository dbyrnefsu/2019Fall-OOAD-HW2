/**
 * 
 */
package edu.fitchburgstate.csc7400.hw2;



/**
 * @author rphillips
 *
 */
public interface GuitarInterface {
	
	public GuitarType getType();
	
	public GuitarManufacturer getManufacturer();
	
	public GuitarWood getTopWood();

	public GuitarWood getBackWood();
	
	public String getModel();
	
}
