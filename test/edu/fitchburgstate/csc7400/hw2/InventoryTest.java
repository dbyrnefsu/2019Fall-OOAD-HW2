/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
 */
package edu.fitchburgstate.csc7400.hw2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Unit tests for guitar inventory
 * 
 * @author Orlando Montalvo 
 */
public class InventoryTest {
	
	private Inventory guitarInventory;

	/**
	 * Fills inventory
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.guitarInventory = new Inventory();
		Inventory inventory = this.guitarInventory;

		inventory.addGuitar("11277", 3999.95, new GuitarSpec("CJ", Manufacturer.COLLINGS, Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA),6);
		inventory.addGuitar("V95693", 1499.95, new GuitarSpec("Stratocastor", Manufacturer.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER), 6);
		inventory.addGuitar("V9512", 1549.95, new GuitarSpec("Stratocastor", Manufacturer.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER), 6);
		inventory.addGuitar("122784", 5495.95, new GuitarSpec("D-18", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK), 6);
		inventory.addGuitar("76531", 6295.95, new GuitarSpec("OM-28", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.BRAZILLIAN_ROSEWOOD, Wood.ADIRONDACK), 6);
		inventory.addGuitar("70108276", 2295.95, new GuitarSpec("Les-Paul", Manufacturer.GIBSON, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY), 6);
		inventory.addGuitar("82765501", 1890.95, new GuitarSpec("SG '61 Reissue", Manufacturer.GIBSON, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY),6);
		inventory.addGuitar("77023", 6275.95, new GuitarSpec("D-28", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.BRAZILLIAN_ROSEWOOD, Wood.ADIRONDACK), 6);
		inventory.addGuitar("1092", 12995.95, new GuitarSpec("SJ", Manufacturer.OLSON, Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.CEDAR), 6);
		inventory.addGuitar("566-62", 8999.95, new GuitarSpec("Cathedral", Manufacturer.RYAN, Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR), 6);
		inventory.addGuitar("6 29584", 2100.95, new GuitarSpec("Dave Navarro Signature", Manufacturer.PRS, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE), 6);
		inventory.addGuitar("GPC12PA4", 1595.95, new GuitarSpec("GPC12PA4", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.MAPLE, Wood.SITKA), 12);

	}

	/**
	 * Test get with serial number
	 */
	@Test
	public void test_get() {
		Assert.assertTrue(this.guitarEquals(new Guitar("76531", 6295.95, new GuitarSpec("OM-28", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.BRAZILLIAN_ROSEWOOD, Wood.ADIRONDACK), 6), this.guitarInventory.getGuitar("76531")));
		Assert.assertTrue(this.guitarEquals(new Guitar("70108276", 2295.95, new GuitarSpec("Les-Paul", Manufacturer.GIBSON, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY), 6), this.guitarInventory.getGuitar("70108276")));
		Assert.assertTrue(this.guitarEquals(new Guitar("566-62", 8999.95, new GuitarSpec("Cathedral", Manufacturer.RYAN, Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR), 6),
				this.guitarInventory.getGuitar("566-62")));
	}

	/**
	 * Test add, use getGuitar
	 */
	@Test
	public void test_add() {

		GuitarSpec newGuitarSpec = new GuitarSpec("D-18", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.MAHOGANY, Wood.ALDER);
		Guitar g1 = new Guitar("122784x", 5495.95, newGuitarSpec, 12);
		this.guitarInventory.addGuitar("122784x", 5495.95, newGuitarSpec, 12);
		Guitar sg1 = this.guitarInventory.getGuitar("122784x");
		Assert.assertTrue(this.guitarEquals(g1, sg1));
	}
	
	/**
	 * Test fully qualified search
	 */
	@Test
	public void test_search() {

		GuitarSpec guitarSpec = new GuitarSpec("Stratocastor", Manufacturer.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		Guitar searchGuitar = new Guitar(null, 0, guitarSpec, 6);
		String[] serialNumbers = { "V95693","V9512" };
		this.searchTester(searchGuitar, serialNumbers);
	}

	/**
	 * Test fully qualified search with mixed case
	 */
	@Test
	public void test_search_case() {

		GuitarSpec guitarSpec = new GuitarSpec("stratocastor", Manufacturer.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		Guitar searchGuitar = new Guitar(null, 0, guitarSpec, null);
		String[] serialNumbers = { "V95693","V9512" };
		this.searchTester(searchGuitar, serialNumbers);
	}

	/**
	 * Test search with just manufacturer
	 */
	@Test
	public void test_search_manufacturer() {

		GuitarSpec guitarSpec = new GuitarSpec(null, Manufacturer.GIBSON, null, null, null);
		Guitar searchGuitar = new Guitar(null, 0, guitarSpec, null);
		String[] serialNumbers = { "70108276","82765501" };
		this.searchTester(searchGuitar, serialNumbers);

		guitarSpec = new GuitarSpec(null, Manufacturer.COLLINGS, null, null, null);
		searchGuitar = new Guitar(null, 0, guitarSpec, null);
		String[] serialNumbers2 = { "11277" };
		this.searchTester(searchGuitar, serialNumbers2);
	}
	
	/**
	 * Test search with just type
	 */
	@Test
	public void test_search_type() {

		GuitarSpec guitarSpec = new GuitarSpec(null, null, Type.ACOUSTIC, null, null);

		Guitar searchGuitar = new Guitar(null, 0, guitarSpec, null);
		String[] serialNumbers = { "11277","122784", "76531", "77023", "1092", "566-62" };
		this.searchTester(searchGuitar, serialNumbers);
	}
	
	/**
	 * Test search with 2 attributes (manufacturers and back wood)
	 */
	@Test
	public void test_search_2Attrib() {

		GuitarSpec guitarSpec = new GuitarSpec(null, Manufacturer.MARTIN, null, Wood.BRAZILLIAN_ROSEWOOD, null);

		Guitar searchGuitar = new Guitar(null, 0, guitarSpec, null);
		String[] serialNumbers = { "76531","77023" };
		this.searchTester(searchGuitar, serialNumbers);
	}
	
	/**
	 * Test search with string
	 */
	@Test
	public void test_search_numstrings() {

		GuitarSpec guitarSpec = new GuitarSpec(null, null, null, null, null);

		Guitar searchGuitar = new Guitar(null, 0, guitarSpec, 12);
		String[] serialNumbers = { "GPC12PA4" };
		this.searchTester(searchGuitar, serialNumbers);
}
	
	/**
	 * Test to make sure nothing comes back if no match
	 */
	@Test
	public void test_search_notFound() {


		GuitarSpec guitarSpec = new GuitarSpec("LEXUS", null, null, null, null);
		Guitar searchGuitar = new Guitar(null, 0, guitarSpec, null);
		Assert.assertNull("Should not have found any guitars", this.guitarInventory.search(searchGuitar));
	}
	
	/**
	 * Utility method for testing search. Does the search, then looks to see that we
	 * got guitars with certain serial numbers
	 * @param searchGuitar the search specs
	 * @param serialNumbers the serial numbers we expect
	 */
	private void searchTester(Guitar searchGuitar, String[] serialNumbers) {
		LinkedList matchingGuitar = this.guitarInventory.search(searchGuitar);
		this.checkGuitarList(matchingGuitar, serialNumbers);
	}

	/**
	 * Utility method for testing search. Checks to see that we
	 * the guitars in the list contain certain serial numbers
	 *  @param matchingGuitars the matching guitar
	 * @param serialNumbers the serial numbers we expect
	 */
	private void checkGuitarList(LinkedList matchingGuitars, String[] serialNumbers) {

		Set<String> shouldFind = new HashSet<String>();
		for (String str: serialNumbers) {
			shouldFind.add(str);
		}
		Assert.assertTrue(shouldFind.contains(matchingGuitars.toString()));
	}

	/**
	 * Utility method for checking if 2 guitars are equal.
	 * 
	 * @param g1 first guitar
	 * @param g2 second guitar
	 * @return true if g1 and g2 are equal
	 */
	private boolean guitarEquals(Guitar g1, Guitar g2) {

		return g1.equals(g2);
//		GuitarInterface.Manufacturer manufacturer = g1.getManufacturer();
//		if ((!manufacturer.toString().equalsIgnoreCase(String.valueOf(g2.getManufacturer()))))
//			return false;
//		String model = g1.getModel();
//		if (!model.equalsIgnoreCase(g2.getModel()))
//			return false;
//		GuitarInterface.Type type = g1.getType();
//		if (!type.toString().equalsIgnoreCase(String.valueOf(g2.getType())))
//			return false;
//		GuitarInterface.Wood backWood = g1.getBackWood();
//		if (!backWood.toString().equalsIgnoreCase(String.valueOf(g2.getBackWood())))
//			return false;
//		GuitarInterface.Wood topWood = g1.getTopWood();
//		if (!topWood.toString().equalsIgnoreCase(String.valueOf(g2.getTopWood())))
//			return false;
//		return true;
	}
}
