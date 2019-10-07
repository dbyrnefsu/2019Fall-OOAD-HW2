/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Xia Jin, Akhila Lolam
 * Date: 2019-10-03
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * GuitarInterface 
 * 
 * @author xia.jin
 *
 */

public interface GuitarInterface {

	/**
	 * Returns the name of the manufacturer
	 */
	public Manufacturer getManufacturer();
	
	/**
	 * Returns the guitar type
	 */
	public Type getType();
	
	/**
	 * Returns the type of wood used in the face
	 */
	public Wood getTopWood();
	
	/**
	 * Returns the type of wood used in the body
	 */
	public Wood getBackWood();
	
	/**
	 * Returns the manufacturer model
	 */
	public String getModel();
	
}
