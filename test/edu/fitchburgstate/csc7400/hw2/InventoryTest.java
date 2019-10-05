/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
 */
package edu.fitchburgstate.csc7400.hw2;

import java.util.HashSet;
import java.util.Set;

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
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Inventory inventory = new Inventory();
		new InventoryTestData();
		inventory = InventoryTestData.initializeInventory(inventory);
		this.guitarInventory = inventory;
	}

	/**
	 * Test get with serial number
	 */
	@Test
	public void test_get() {
		Assert.assertTrue(this.guitarEquals(new Guitar("76531", 6295.95, Manufacturer.MARTIN, "OM-28", Type.ACOUSTIC,
				Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 6), this.guitarInventory.getGuitar("76531")));
		Assert.assertTrue(this.guitarEquals(new Guitar("70108276", 2295.95, Manufacturer.GIBSON, "Les Paul",
				Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY, 6), this.guitarInventory.getGuitar("70108276")));
		Assert.assertTrue(this.guitarEquals(new Guitar("566-62", 8999.95, Manufacturer.PRS, "Cathedral", Type.ACOUSTIC,
				Wood.COCOBOLO, Wood.CEDAR, 6), this.guitarInventory.getGuitar("566-62")));
	}

	/**
	 * Test add, use getGuitar
	 */
	@Test
	public void test_add() {
		Guitar g1 = new Guitar("122784x", 5495.95, Manufacturer.MARTIN,"D-18", Type.ACOUSTIC,Wood.MAHOGANY,Wood.ALDER, 12);
		this.guitarInventory.addGuitar("122784x", 5495.95, Manufacturer.MARTIN,Type.ACOUSTIC, "D-18",Wood.MAHOGANY,Wood.ALDER, 12);
		Guitar sg1 = this.guitarInventory.getGuitar("122784x");
		Assert.assertTrue(this.guitarEquals(g1, sg1));
	}

	/**
	 * Test fully qualified search
	 */
	@Test
	public void test_search() {
		Guitar searchGuitar = new Guitar(null, 0, Manufacturer.FENDER,"Stratocastor", Type.ELECTRIC,Wood.ALDER, Wood.ALDER, 6);
		String[] serialNumbers = { "V95693", "V9512" };
		this.searchTester(searchGuitar, serialNumbers);
	}

	/**
	 * Test fully qualified search with mixed case
	 */
	@Test
	public void test_search_case() {
		Guitar searchGuitar = new Guitar(null, 0, Manufacturer.FENDER,"Stratocastor", Type.ELECTRIC,Wood.ALDER, Wood.ALDER, null);
		String[] serialNumbers = { "V95693", "V9512" };
		this.searchTester(searchGuitar, serialNumbers);
	}

	/**
	 * Test search with just manufacturer
	 */
	@Test
	public void test_search_manufacturer() {
		Guitar searchGuitar = new Guitar(null, 0, Manufacturer.GIBSON, null, null, null, null, null);
		String[] serialNumbers = { "70108276", "82765501" };
		this.searchTester(searchGuitar, serialNumbers);

		searchGuitar = new Guitar(null, 0, Manufacturer.COLLINGS, null, null, null, null, null);
		String[] serialNumbers2 = { "11277" };
		this.searchTester(searchGuitar, serialNumbers2);
	}

	/**
	 * Test search with just type
	 */
	@Test
	public void test_search_type() {

		Guitar searchGuitar = new Guitar(null, 0, null, null,Type.ACOUSTIC, null, null, null);
		String[] serialNumbers = { "11277", "122784", "76531", "77023", "1092", "566-62" };
		this.searchTester(searchGuitar, serialNumbers);
	}

	/**
	 * Test search with 2 attributes (manufacturers and back wood)
	 */
	@Test
	public void test_search_2Attrib() {
		Guitar searchGuitar = new Guitar(null, 0, Manufacturer.MARTIN, null, null,Wood.BRAZILIAN_ROSEWOOD, null, null);
		String[] serialNumbers = { "76531", "77023" };
		this.searchTester(searchGuitar, serialNumbers);
	}

	/**
	 * Test search with string
	 */
	@Test
	public void test_search_numstrings() {
		Guitar searchGuitar = new Guitar(null, 0, null, null, null, null, null, 12);
		String[] serialNumbers = { "GPC12PA4" };
		this.searchTester(searchGuitar, serialNumbers);
	}

	/**
	 * Test to make sure nothing comes back if no match
	 */
	@Test
	public void test_search_notFound() {
		Guitar searchGuitar = new Guitar(null, 0, Manufacturer.LEXUS, null, null, null, null, null);
		Assert.assertNull("Should not have found any guitars", this.guitarInventory.search(searchGuitar));
	}

	/**
	 * Utility method for testing search. Does the search, then looks to see that we
	 * got guitars with certain serial numbers
	 * 
	 * @param searchGuitar  the search specs
	 * @param serialNumbers the serial numbers we expect
	 */
	private void searchTester(Guitar searchGuitar, String[] serialNumbers) {
		Guitar matchingGuitar = this.guitarInventory.search(searchGuitar);
		this.checkGuitarList(matchingGuitar, serialNumbers);
	}

	/**
	 * Utility method for testing search. Checks to see that we the guitars in the
	 * list contain certain serial numbers
	 * 
	 * @param matchingGuitar the matching guitar
	 * @param serialNumbers  the serial numbers we expect
	 */
	private void checkGuitarList(Guitar matchingGuitar, String[] serialNumbers) {

		Set<String> shouldFind = new HashSet<String>();
		for (String str : serialNumbers) {
			shouldFind.add(str);
		}
		Assert.assertTrue(shouldFind.contains(matchingGuitar.getSerialNumber()));
	}

	/**
	 * Utility method for checking if 2 guitars are equal.
	 * 
	 * @param g1 first guitar
	 * @param g2 second guitar
	 * @return true if g1 and g2 are equal
	 */
	private boolean guitarEquals(Guitar g1, Guitar g2) {
		Manufacturer manufacturer = g1.getManufacturer();
		if ((!manufacturer.equals(g2.getManufacturer())))
			return false;
		String model = g1.getModel();
		if (!model.equalsIgnoreCase(g2.getModel()))
			return false;
		Type type = g1.getType();
		if (!type.equals(g2.getType()))
			return false;
		Wood backWood = g1.getBackWood();
		if (!backWood.equals(g2.getBackWood()))
			return false;
		Wood topWood = g1.getTopWood();
		if (!topWood.equals(g2.getTopWood()))
			return false;
		return true;
	}
}
