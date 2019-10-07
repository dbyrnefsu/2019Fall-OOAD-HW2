/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Students: Abha Kumari, Divya Mallepally, Vineela Venula 
 * Date: 2019-10-06
 */
 
package edu.fitchburgstate.csc7400.hw2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fitchburgstate.csc7400.hw2.Guitar;;

/**
 * Simple tests for guitar class methods
 * 
 * @author orlando
 */
class GuitarTest {
	
	Guitar testGuitar;

	/**
	 * Creates a test class that will be used for testing getters and setters
	 */
	@BeforeEach
	void setUp() {
		this.testGuitar = new Guitar(
				"AB123", // serial number
				203.35, // store price
				"Gibson", // Manufacturer
				"electric", // Type of Guitar
				"EasyLearn", // Manufacturer model			
				"Maple", // Back wood
				"Adirondack", // Face wood
				6 // number of strings
				);
	}

	/**
	 * Tests getSerialNumber()
	 */
	@Test
	void test_getSerialNumber() {
		String expected = "AB123";
		String returned = this.testGuitar.getSerialNumber();
		assertEquals(expected, returned, String.format("Serial number %s != %s", expected, returned));

	}

	/**
	 * Tests getPrice()
	 */
	@Test
	void test_getPrice() {
		double expected = 203.35;
		double returned = this.testGuitar.getPrice();
		assertEquals(expected, returned, 0.01, String.format("Price %f != %f", expected, returned));
	}

	/**
	 * Tests setPrice(), by setting price then getting price.
	 */
	@Test
	void test_setPrice() {
		double expected = 225.10;
		this.testGuitar.setPrice(expected);
		double returned = this.testGuitar.getPrice();
		assertEquals(expected, returned, String.format("Price %f != %f", expected, returned));
	}

	/**
	 * TestsgetManufacturer().
	 */
	@Test
	void test_getManufacturer() {
		String expected = "GIBSON";
		String returned = this.testGuitar.getManufacturer();
		assertEquals(expected, returned, String.format("Manufacturer %s != %s", expected, returned));
	}

	/**
	 * Tests getModel().
	 */
	@Test
	void test_getModel() {
		String expected = "EasyLearn";
		String returned = this.testGuitar.getModel();
		assertEquals(expected, returned, String.format("Model %s != %s", expected, returned));
	}

	/**
	 * Tests getType()
	 */
	@Test
	void test_getType() {
		String expected = "ELECTRIC";
		String returned = this.testGuitar.getType();
		assertEquals(expected, returned, String.format("Type %s != %s", expected, returned));
	}

	/**
	 * Tests getBackWood()
	 */
	@Test
	void test_getBackWood() {
		String expected = "MAPLE";
		String returned = this.testGuitar.getBackWood();
		assertEquals(expected, returned, String.format("Back wood %s != %s", expected, returned));
	}

	/**
	 * Test getTopWood()
	 */
	@Test
	void test_getTopWood() {
		String expected = "ADIRONDACK";
		String returned = this.testGuitar.getTopWood();
		assertEquals(expected, returned, String.format("Top wood %s != %s", expected, returned));
	}
	
	/**
	 * Test getNmuberOfStrings()
	 */
	void test_getNumberOfStrings() {
		int expected = 6;
		int returned = this.testGuitar.getNumberOfStrings();
		assertEquals(expected, returned, String.format("Number of string %d != %d", expected, returned));
	}
}
