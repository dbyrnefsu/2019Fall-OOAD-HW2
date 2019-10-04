/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
 */
package edu.fitchburgstate.csc7400.hw2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Inventory keeps a searchable collection of Guitars. It is meant to be use to
 * find matching guitars for customers.
 * 
 * @author orlando
 * @version 2.0
 */
public class Inventory {
	/**
	 * Default constructor
	 */
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	/**
	 * Adds a guitar to the inventory
	 * 
	 * @param guitar
	 *            a fully qualified guitar
	 */
	public void addGuitar(Guitar guitar) {
		guitars.add(guitar);
	}

	/**
	 * Adds a new guitar to the inventory given all the guitars information.
	 * 
	 * @param serialNumber
	 *            the guitars manufacturer serial number
	 * @param price
	 *            the customer price
	 * @param manufacturer
	 *            the guitar's manufacturer, enum Manufacturer
	 * @param model
	 *            the manufacturer model id
	 * @param type
	 *            type of guitar
	 * @param backWood
	 *            wood used in back of guitar
	 * @param topWood
	 *            wood used in front of guitar
	 * @param numStrings
	 *            the number of strings
	 * 
	 * @precondition serialNumber is not empty
	 * @precondition price > 0
	 * @precondition manufacturer != null
	 * @precondition model is not empty
	 * @precondition type != null
	 * @precondition topWood != null
	 * @precondition backWood != null
	 * @precondition numStrings >= 6 or null
	 */
	public void addGuitar(String serialNumber, double price, Manufacturer manufacturer, Type type, String model, 
			Wood backWood, Wood topWood, Integer numStrings) {	
		assert serialNumber != null;
		assert price > 0;
		assert manufacturer != null;
		assert type != null;
		assert model != null;
		assert topWood != null;
		assert backWood != null;
		assert numStrings >= 0;
			
		Guitar guitar = new Guitar(serialNumber, price, manufacturer, type, model, backWood, topWood, numStrings);
		this.addGuitar(guitar);
	}
	/**
	 * Constructor, input value for manufacturer, type, backWood, topWood are strings instead of enum types
	 * @param serialNumber
	 * @param price
	 * @param manufacturer
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 * @param numStrings
	 */
	public void addGuitar(String serialNumber, double price, String manufacturer, String model, String type,
			String backWood, String topWood, Integer numStrings) {
		assert serialNumber != null;
		assert price > 0;
		assert manufacturer != null;
		assert type != null;
		assert model != null;
		assert topWood != null;
		assert backWood != null;
		assert numStrings >= 0;
			
		Guitar guitar = new Guitar(serialNumber, price, manufacturer, model, type, backWood, topWood, numStrings);
		this.addGuitar(guitar);
		
	}
	/**
	 * Finds and returns a guitar that has the provided serial number
	 * 
	 * @param serialNumber
	 *            serial number of guitar
	 * @return the guitar with the correct serial number, or null if not found
	 */
	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	/**
	 * Finds and returns an inventory of guitars that matches a guitar spec. 
	 * Any null in spec are consider wildcards.
	 * 
	 * @param searchGuitar
	 *            the guitar with qualities we want to match
	 * @return the found guitar, may be null
	 */
	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchedGuitars = new LinkedList<Guitar>();
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			// Ignore serial number since that's unique
			// Ignore price since that's unique
			if (guitar.getGuitarSpec().matches(searchSpec))
				matchedGuitars.add(guitar);
		
		}
		if(matchedGuitars.size()>0)
			return matchedGuitars;
		else return null;
	}

	private List<Guitar> guitars; // guitar inventory


}
