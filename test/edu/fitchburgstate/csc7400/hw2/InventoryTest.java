/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
 */
package edu.fitchburgstate.csc7400.hw2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.fitchburgstate.csc7400.hw2.Guitar;
import edu.fitchburgstate.csc7400.hw2.Inventory;

/**
 * Unit tests for guitar inventory
 * 
 * @author Orlando Montalvo 
 */
public class InventoryTest {
	
	Inventory guitarInventory;

	/**
	 * Fills inventory
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.guitarInventory = new Inventory();
		Inventory inventory = this.guitarInventory;
		inventory.addGuitar("11277", 3999.95, "COLLINGS", "ACOUSTIC", "CJ", "INDIAN_ROSEWOOD", "SITKA", 6);
		inventory.addGuitar("V95693", 1499.95, "FENDER", "ELECTRIC", "Stratocastor", "ALDER", "ALDER", 6);
		inventory.addGuitar("V9512", 1549.95, "FENDER", "ELECTRIC", "Stratocastor", "ALDER", "ALDER", 6);
		inventory.addGuitar("122784", 5495.95, "MARTIN", "ACOUSTIC", "D-18", "MAHOGANY", "ADIRONDACK", 6);
		inventory.addGuitar("76531", 6295.95, "MARTIN", "ACOUSTIC", "OM-28", "BRAZILIAN_ROSEWOOD",
				"ADIRONDACK", 6);
		inventory.addGuitar("70108276", 2295.95, "GIBSON", "ELECTRIC", "Les Paul", "MAHOGANY",
				"MAHOGANY", 6);
		inventory.addGuitar("82765501", 1890.95, "GIBSON", "ELECTRIC", "SG '61 Reissue", "MAHOGANY",
				"MAHOGANY", 6);
		inventory.addGuitar("77023", 6275.95, "MARTIN", "ACOUSTIC", "D-28", "BRAZILIAN_ROSEWOOD",
				"ADIRONDACK", 6);
		inventory.addGuitar("1092", 12995.95, "OLSON", "ACOUSTIC", "SJ", "INDIAN_ROSEWOOD", "CEDAR", 6);
		inventory.addGuitar("566-62", 8999.95, "RYAN", "ACOUSTIC", "Cathedral", "COCOBOLO", "CEDAR", 6);
		inventory.addGuitar("6 29584", 2100.95, "PRS", "ELECTRIC", "Dave Navarro Signature", "MAHOGANY",
				"MAPLE", 6);
		inventory.addGuitar("GPC12PA4", 1595.95, "MARTIN", "ACOUSTIC", "GPC12PA4", "MAPLE", "SITKA", 12);
	}

	/**
	 * Test get with serial number
	 */
	@Test
	public void test_get() {
		Assert.assertTrue(this.guitarEquals(new Guitar("76531", 6295.95, "MARTIN", "ACOUSTIC", "OM-28", "BRAZILIAN_ROSEWOOD",
				"ADIRONDACK", 6), this.guitarInventory.getGuitar("76531")));
		Assert.assertTrue(this.guitarEquals(new Guitar("70108276", 2295.95, "GIBSON", "ELECTRIC", "Les Paul", "MAHOGANY",
				"MAHOGANY", 6), this.guitarInventory.getGuitar("70108276")));
		Assert.assertTrue(this.guitarEquals(new Guitar("566-62", 8999.95, "RYAN", "ACOUSTIC", "Cathedral", "COCOBOLO", "CEDAR", 6), 
				this.guitarInventory.getGuitar("566-62")));
	}

	/**
	 * Test add, use getGuitar
	 */
	@Test
	public void test_add() {
		Guitar g1 = new Guitar("122784x", 5495.95, "MARTIN",  "ACOUSTIC", "D-18","MAHOGANY", "ALDER", 12);		
		this.guitarInventory.addGuitar("122784x", 5495.95, "MARTIN", "ACOUSTIC", "D-18", "MAHOGANY", "ALDER", 12);
		Guitar sg1 = this.guitarInventory.getGuitar("122784x");
		Assert.assertTrue(this.guitarEquals(g1, sg1));
	}
	
	/**
	 * Test fully qualified search
	 */
	@Test
	public void test_search() {
		GuitarSpec searchGuitarSpec = new GuitarSpec( "FENDER", "ELECTRIC", "ALDER", "ALDER", "Stratocastor");
		String[] serialNumbers = { "V95693","V9512" };
		this.searchTester(searchGuitarSpec, serialNumbers);
	}

	/**
	 * Test fully qualified search with mixed case
	 */
	@Test
	public void test_search_case() {
		GuitarSpec searchGuitarSpec = new GuitarSpec("Fender", "Electric", "Alder", "Alder", "stratocastor");
		String[] serialNumbers = { "V95693","V9512" };
		this.searchTester(searchGuitarSpec, serialNumbers);
	}

	/**
	 * Test search with just manufacturer
	 */
	@Test
	public void test_search_manufacturer() {
		GuitarSpec searchGuitarSpec = new GuitarSpec("GIBSON", null, null, null, null);
		String[] serialNumbers = { "70108276","82765501" };
		this.searchTester(searchGuitarSpec, serialNumbers);

		searchGuitarSpec = new GuitarSpec("COLLINGS", null, null, null, null);
		String[] serialNumbers2 = { "11277" };
		this.searchTester(searchGuitarSpec, serialNumbers2);
	}
	
	/**
	 * Test search with just type
	 *
	 */ 
	@Test
	public void test_search_type() {
	
		GuitarSpec searchGuitarSpec = new GuitarSpec( null, "ACOUSTIC", null, null, null);
		String[] serialNumbers = { "11277","122784", "76531", "77023", "1092", "566-62","GPC12PA4","122784x" };
		this.searchTester(searchGuitarSpec, serialNumbers);
	}
	
	/**
	 * Test search with 2 attributes (manufacturers and back wood)
	 */
	@Test
	public void test_search_2Attrib() {
		GuitarSpec searchGuitarSpec = new GuitarSpec( "MARTIN", null, "BRAZILIAN_ROSEWOOD", null, null);
		String[] serialNumbers = { "76531","77023" };
		this.searchTester(searchGuitarSpec, serialNumbers);
	}
	
	/**
	 * Test search with string
	 * No search for numstrings, it is not part of GuitarSpec
	 */
	/*
	 * @Test
	 
	public void test_search_numstrings() {
		Guitar searchGuitar = new Guitar(null, 0, null, null, null, null, null, 12);
		String[] serialNumbers = { "GPC12PA4" };
		this.searchTester(searchGuitar, serialNumbers);
}
	*/
	/**
	 * Test to make sure nothing comes back if no match
	 * Add LEXUS to Manufacturer enum???
	 */
	@Test
	public void test_search_notFound() {
		GuitarSpec searchGuitarSpec = new GuitarSpec("LEXUS", null, null, null, null);
		Assert.assertNull("Should not have found any guitars", this.guitarInventory.search(searchGuitarSpec));
	}
	
	/**
	 * Utility method for testing search. Does the search, then looks to see that we
	 * got guitars with certain serial numbers
	 * @param searchGuitar the search specs
	 * @param serialNumbers the serial numbers we expect
	 */
	private void searchTester(GuitarSpec searchGuitarSpec, String[] serialNumbers) {
		List<Guitar> matchedGuitars = this.guitarInventory.search(searchGuitarSpec);
		this.checkGuitarList(matchedGuitars, serialNumbers);
	}

	/**
	 * Utility method for testing search. Checks to see that we
	 * the guitars in the list contain certain serial numbers
	 * 
	 * @param matchingGuitar the matching guitar
	 * @param serialNumbers the serial numbers we expect
	 */
	private void checkGuitarList(List<Guitar> matchedGuitars, String[] serialNumbers) {

		Set<String> shouldFind = new HashSet<String>();
		for (String str: serialNumbers) {
			shouldFind.add(str);
		}
		for (Iterator<Guitar> it = matchedGuitars.iterator(); it.hasNext();) {
			Guitar g = it.next();
			Assert.assertTrue(shouldFind.contains(g.getSerialNumber()));
		}
		
	}

	/**
	 * Utility method for checking if 2 guitars are equal.
	 * 
	 * @param g1 first guitar
	 * @param g2 second guitar
	 * @return true if g1 and g2 are equal
	 */
	private boolean guitarEquals(Guitar g1, Guitar g2) {
		String manufacturer = g1.getManufacturer().toString();
		if (!manufacturer.equalsIgnoreCase(g2.getManufacturer().toString()))
			return false;
		String model = g1.getModel();
		if (!model.equalsIgnoreCase(g2.getModel()))
			return false;
		String type = g1.getType().toString();
		if (!type.equalsIgnoreCase(g2.getType().toString()))
			return false;
		String backWood = g1.getBackWood().toString();
		if (!backWood.equalsIgnoreCase(g2.getBackWood().toString()))
			return false;
		String topWood = g1.getTopWood().toString();
		if (!topWood.equalsIgnoreCase(g2.getTopWood().toString()))
			return false;
		return true;
	}
}
