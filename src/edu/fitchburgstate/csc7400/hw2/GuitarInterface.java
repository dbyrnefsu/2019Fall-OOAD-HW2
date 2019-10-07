/**
 * 
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * student: Vinitha Gaddampally
 * Date: 2017-09-20
 * 
 */
package edu.fitchburgstate.csc7400.hw2;
/*
 * 
* declaring guitar interface method
*@author HeadFirstOODA
*
*/


public interface GuitarInterface {
	/*
	 * 
	*returns manufacturers name
	*@return
	*
	*/
	public Manufacturer getManufacturer();
	/*
	 * 
	*returns type of the guitar
	*@return
	*
	*/
	public GuitarType getType();
	/*
	 * 
	*returns the type of wood used on the top
	*@return
	*
	*/
	public GuitarWood getTopWood();
	/*
	 * 
	*returns the type of wood used on the body
	*@return
	*
	*/
	public GuitarWood getBackWood();
	/*
	 * 
	*returns the manufacturer's model
	*@return
	*
	*/
	public String getModel();
	
	}



