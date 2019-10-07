
package edu.fitchburgstate.csc7400.hw2;

/**
 * Class		: Object-Oriented Design and Analysis
 * Professor	: Orlando Montalvo
 * Assignment	: HW 2 
 * Enum to specify the woodtype of a guitar 
 * - -predefined values for Guitar's topwood and backwood type
 * @authors Komal and Zi Lin(@01411726 and @01375707)
 * @since 10-03-2019
 *
 */
public enum Wood {

	IndianRosewood,
	BrazilianRosewood,
	Mahogany,
	Maple,
	Cocobolo,
	Cedar,
	Adirondack,
	Alder,
	Sitka;
	
	/**
	* Gets string value of the Wood enum 
	* 
	* @return IllegalArgumentException exception in case the enum value is invalid
	*/
	public String toString()
	{
		switch(this)
		{
		case IndianRosewood:
			return "Indian Rosewood";
		case BrazilianRosewood:
			return "Brazilian Rosewood";
		case Mahogany:
			return "Mahogany";
		case Maple:
			return "Maple";
		case Cocobolo:
			return "Cocobolo";
		case Cedar:
			return "Cedar";
		case Adirondack:
			return "Adirondack";
		case Alder:
			return "Alder";
		case Sitka:
			return "Sitka";
		default:throw new IllegalArgumentException();
			
			
		
		}
		
	}
	
	
}

