/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Students: @Nodir Nabiev
 *          : @Chandralekha 
 * Version 2.1
 * ModifiedDate: 2019-10-07
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
	 *            the guitar's manufacturer
	 * @param model
	 *            the manufacturer model id
	 * @param type
	 *            type of guitar
	 * @param topWood
	 *            wood used in front of guitar
	 * @param backWood
	 *            wood used in back of guitar
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
	public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec, Integer numStrings) {
		assert serialNumber != null;
		assert price > 0;
		assert guitarSpec.getManufacturer() != null;
		assert guitarSpec.getType() != null;
		assert guitarSpec.getModel() != null;
		assert guitarSpec.getTopWood() != null;
		assert guitarSpec.getBackWood() != null;
		assert numStrings >= 0;
		
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec, numStrings);
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
	 * Finds and returns a guitar that matches a provided guitar. Any null in
	 * spec are consider wildcards.
	 * 
	 * @param searchGuitar
	 *            the guitar with qualities we want to match
	 * @return the found guitar, may be null
	 */
	public LinkedList search(Object searchGuitar) {
		//Need a new list to add all matched guitars and return the list of multiple matched guitars
		LinkedList matchedGuitars = new LinkedList();
		//hasNext returns true if it has more guitars elements to iterate
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			//It returns the next element of the list 
	 	//@exception- if there is no next element in the list ,It throws ‘NoSuchElementException’
			Guitar guitar = (Guitar) i.next();
			GuitarSpec guitarSpec = guitar.getGuitarSpec();
			// Ignore serial number since that's unique
			// Ignore price since that's unique

			if (guitarSpec.matches((GuitarSpec) searchGuitar)) {
				matchedGuitars.add(guitar);
			}

		}
		return matchedGuitars;
	}

	private List<Guitar> guitars; // guitar inventory
}
