/**
 * 
 */
package edu.fitchburgstate.csc7400.hw2;

import edu.fitchburgstate.csc7400.hw2.GuitarSpec.*;

/**
 * @author rphillips
 * @author ssribhas
 *
 */
public interface GuitarInterface {
	
	public GuitarType getType();
	
	public GuitarManufacturer getManufacturer();
	
	public GuitarWood getTopWood();

	public GuitarWood getBackWood();
	
	public String getModel();
	
}
