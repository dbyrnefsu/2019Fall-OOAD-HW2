
package edu.fitchburgstate.csc7400.hw2;
/**
 * Class		: Object-Oriented Design and Analysis
 * Professor	: Orlando Montalvo
 * Assignment	: HW 2 
 * Enum to specify the type of a guitar 
 * -- Predefined values (Electric/Accoustic) for Guitar's type
 * @authors Komal and Zi Lin(@01411726 and @01375707)
 * @since 10-03-2019
 *
 */
public enum Type {

	Electric, Acoustic;
	
	/**
	* Gets string value of the Type enum value
	* 
	* @return IllegalArgumentException exception in case the enum value is invalid
	*/
	public String toString()
	{
		switch(this)
		{
		case Electric:
			return "Electric";
		case Acoustic:
			return "Acoustic";
		default: throw new IllegalArgumentException();
		
		}
	}
}
