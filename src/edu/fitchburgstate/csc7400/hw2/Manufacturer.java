
package edu.fitchburgstate.csc7400.hw2;

/**
 * Class		: Object-Oriented Design and Analysis
 * Professor	: Orlando Montalvo
 * Assignment	: HW 2 
 * Enum to specify the manufacturer of a guitar 
 * - - predefined values for Guitar's Manufacturer
 * @authors Komal and Zi Lin(@01411726 and @01375707)
 * @since 10-03-2019
 *
 */
public enum Manufacturer {

	Fender,
	Martin,
	Gibson,
	Collings,
	Olson,
	Ryan,
	PRS;
	
	/**
	* Gets string values of the Manufacturer enum values
	* 
	* @return IllegalArgumentException exception in case the enum value is invalid
	*/
	
	public String toString()
	{
		switch(this)
		{
		case Fender:
			return "Fender";
		case Martin:
			return "Martin";
		case Gibson:
			return "Gibson";
		case Collings:
			return "Collings";
		case Olson:
			return "Olson";
		case Ryan:
			return "Ryan";
		case PRS:
			return "PRS";
		default: throw new IllegalArgumentException();
					
				
		}
	}
}
