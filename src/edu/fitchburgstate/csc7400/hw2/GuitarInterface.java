package edu.fitchburgstate.csc7400.hw2;
/**
 * Class        : Object-Oriented Analysis and Design
 * Professor    : Orlando Montalvo
 * Assignment   : HW-2
 * Date         : 10-06-2019
 * @author      : Sravani Veerapureddy and Yamini Gopisetti
 */
 
 
public interface GuitarInterface {
         //Returns the name of the manufacturer
	Manufacturer getManufacturer();
         //Returns the guitar type
	Type getType();
         //Returns the type of wood used in the body
	Wood getTopWood();
         //Returns the type of wood used in the body
	Wood getBackWood();
         //Returns the manufacturer model
	String getModel();
}
