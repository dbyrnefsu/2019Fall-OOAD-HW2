/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2018-09-03
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * GuitarInterface defines getters, those are implemented in the Guitar and GuitarSpec classes
 * 
 * @author HeadFirstOODA
 *
 */
public interface GuitarInterface {
	
	/**
	 * Returns the name of the manufacturer
	 * @return
	 */
	public Manufacturer getManufacturer();
	
	/**
	 * Returns the guitar type
	 * @return
	 */
	public Type getType();
	
	/**
	 * Returns the manufacturer model
	 * @return
	 */
	public String getModel();
	
	/**
	 * Returns the type of wood used in the body
	 * @return
	 */
	public Wood getBackWood();
	
	/**
	 * Returns the type of wood used in the face
	 * @return
	 */
	public Wood getTopWood();
	
}
