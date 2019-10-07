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
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.guitarInventory = new Inventory();
		Inventory inventory = this.guitarInventory;
		inventory.addGuitar("11277", 3999.95, Manufacturer.Collins, Type.Acoustic, "CJ",Wood.Indian_Rosewood , Wood.Sitka, 6);
		inventory.addGuitar("V95693", 1499.95, Manufacturer.Fender, Type.Electric, "Stratocastor", Wood.Alder, Wood.Alder, 6);
		inventory.addGuitar("V9512", 1549.95, Manufacturer.Fender, Type.Electric, "Stratocastor", Wood.Alder, Wood.Alder, 6);
		inventory.addGuitar("122784", 5495.95, Manufacturer.Martin, Type.Acoustic, "D-18", Wood.Mahogany, Wood.Adirondack, 6);
		inventory.addGuitar("76531", 6295.95, Manufacturer.Martin, Type.Acoustic, "OM-28", Wood.Brazilian_Rosewood,
				Wood.Adirondack, 6);
		inventory.addGuitar("70108276", 2295.95, Manufacturer.Gibson, Type.Electric, "Les Paul", Wood.Mahogany,
				Wood.Mahogany, 6);
		inventory.addGuitar("82765501", 1890.95, Manufacturer.Gibson, Type.Electric, "SG '61 Reissue", Wood.Mahogany,
				Wood.Mahogany, 6);
		inventory.addGuitar("77023", 6275.95, Manufacturer.Martin, Type.Acoustic, "D-28", Wood.Brazilian_Rosewood,
				Wood.Adirondack, 6);
		inventory.addGuitar("1092", 12995.95, Manufacturer.Olson, Type.Acoustic, "SJ", Wood.Indian_Rosewood, Wood.Cedar, 6);
		inventory.addGuitar("566-62", 8999.95, Manufacturer.Ryan, Type.Acoustic, "Cathedral", Wood.Cocobolo, Wood.Cedar, 6);
		inventory.addGuitar("6 29584", 2100.95, Manufacturer.PRS, Type.Electric, "Dave Navarro Signature", Wood.Mahogany,
				Wood.Maple, 6);
		inventory.addGuitar("GPC12PA4", 1595.95, Manufacturer.Martin, Type.Acoustic, "GPC12PA4", Wood.Maple, Wood.Sitka, 12);
	}

	/**
	 * Test get with serial number
	 */
	@Test
	public void test_get() {
		Assert.assertTrue(this.guitarEquals(new Guitar("76531", 6295.95, Manufacturer.Martin, "OM-28", Type.Acoustic, Wood.Brazilian_Rosewood,
				Wood.Adirondack, 6), this.guitarInventory.getGuitar("76531")));
		Assert.assertTrue(this.guitarEquals(new Guitar("70108276", 2295.95, Manufacturer.Gibson, "Les Paul", Type.Electric, Wood.Mahogany,
				Wood.Mahogany, 6), this.guitarInventory.getGuitar("70108276")));
		Assert.assertTrue(this.guitarEquals(new Guitar("566-62", 8999.95, Manufacturer.Ryan, "Cathedral", Type.Acoustic, Wood.Cocobolo, Wood.Cedar, 6), 
				this.guitarInventory.getGuitar("566-62")));
	}

	/**
	 * Test add, use getGuitar
	 */
	@Test
	public void test_add() {
		Guitar g1 = new Guitar("122784x", 5495.95, Manufacturer.Martin,  "D-18", Type.Acoustic,Wood.Mahogany, Wood.Alder, 12);
		this.guitarInventory.addGuitar("122784x", 5495.95, Manufacturer.Martin, Type.Acoustic, "D-18", Wood.Mahogany, Wood.Alder, 12);
		Guitar sg1 = this.guitarInventory.getGuitar("122784x");
		Assert.assertTrue(this.guitarEquals(g1, sg1));
	}
	
	/**
	 * Test fully qualified search
	 */
	@Test
	public void test_search() {
		Guitar searchGuitar = new Guitar(null, 0, Manufacturer.Fender, "Stratocastor", Type.Electric, Wood.Alder, Wood.Alder, 6);
		String[] serialNumbers = { "V95693","V9512" };
		this.searchTester(searchGuitar, serialNumbers);
	}

	/**
	 * Test fully qualified search with mixed case
	 */
	@Test
	public void test_search_case() {
		Guitar searchGuitar = new Guitar(null, 0, Manufacturer.Fender, "stratocastor", Type.Electric, Wood.Alder, Wood.Alder, null);
		String[] serialNumbers = { "V95693","V9512" };
		this.searchTester(searchGuitar, serialNumbers);
	}

	/**
	 * Test search with just manufacturer
	 */
	@Test
	public void test_search_manufacturer() {
		Guitar searchGuitar = new Guitar(null, 0, Manufacturer.Gibson, null, null, null, null, null);
		String[] serialNumbers = { "70108276","82765501" };
		this.searchTester(searchGuitar, serialNumbers);

		searchGuitar = new Guitar(null, 0, Manufacturer.Collins, null, null, null, null, null);
		String[] serialNumbers2 = { "11277" };
		this.searchTester(searchGuitar, serialNumbers2);
	}
	
	/**
	 * Test search with just type
	 */
	@Test
	public void test_search_type() {
	
		Guitar searchGuitar = new Guitar(null, 0, null,null, Type.Acoustic, null, null, null);
		String[] serialNumbers = { "11277","122784", "76531", "77023", "1092", "566-62" };
		this.searchTester(searchGuitar, serialNumbers);
	}
	
	/**
	 * Test search with 2 attributes (manufacturers and back wood)
	 */
	@Test
	public void test_search_2Attrib() {
		Guitar searchGuitar = new Guitar(null, 0, Manufacturer.Martin, null, null, Wood.Brazilian_Rosewood, null, null);
		String[] serialNumbers = { "76531","77023" };
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
		Guitar searchGuitar = new Guitar(null, 0,Manufacturer.valueOf("LEXUS") , null, null, null, null, null);
		Assert.assertNull("Should not have found any guitars", this.guitarInventory.search(searchGuitar));
	}
	
	/**
	 * Utility method for testing search. Does the search, then looks to see that we
	 * got guitars with certain serial numbers
	 * @param searchGuitar the search specs
	 * @param serialNumbers the serial numbers we expect
	 */
	private void searchTester(Guitar searchGuitar, String[] serialNumbers) {
		Guitar matchingGuitar = this.guitarInventory.search(searchGuitar).get(0);
		this.checkGuitarList(matchingGuitar, serialNumbers);
	}

	/**
	 * Utility method for testing search. Checks to see that we
	 * the guitars in the list contain certain serial numbers
	 * 
	 * @param matchingGuitar the matching guitar
	 * @param serialNumbers the serial numbers we expect
	 */
	private void checkGuitarList(Guitar matchingGuitar, String[] serialNumbers) {

		Set<String> shouldFind = new HashSet<String>();
		for (String str: serialNumbers) {
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
		if ((!manufacturer.name().equalsIgnoreCase(g2.getManufacturer().name())))
			return false;
		String model = g1.getModel();
		if (!model.equalsIgnoreCase(g2.getModel()))
			return false;
		Type type = g1.getType();
		if (!type.name().equalsIgnoreCase(g2.getType().name()))
			return false;
		Wood backWood = g1.getBackWood();
		if (!backWood.name().equalsIgnoreCase(g2.getBackWood().name()))
			return false;
		Wood topWood = g1.getTopWood();
		if (!topWood.name().equalsIgnoreCase(g2.getTopWood().name()))
			return false;
		return true;
	}
}
