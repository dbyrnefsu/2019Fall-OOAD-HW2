
package edu.fitchburgstate.csc7400.hw2;

/**
 * Class		: Object-Oriented Design and Analysis
 * Professor	: Orlando Montalvo
 * Assignment	: HW 2 
 * Interface class that has below methods defined
 * @authors Komal and Zi Lin(@01411726 and @01375707)
 * @since 10-03-2019
 */
public interface GuitarInterface {

	public Manufacturer getManufacturer(); //Returns the name of the manufacturer
	public Type getType(); //Returns the guitar type
	public Wood getBackWood(); //Returns the type of wood used in the body
	public Wood getTopWood(); //Returns the type of wood used in the face
	public String getModel(); //Returns the manufacturer model
}
