/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Students: Komal and Zi Lin(@01411726 and @01375707)
 * @since 10-03-2019
 */
package edu.fitchburgstate.csc7400.hw2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
		inventory.addGuitar("11277", 3999.95, Manufacturer.Collings, Type.Acoustic, "CJ", Wood.IndianRosewood, Wood.Sitka, 6);
		inventory.addGuitar("V95693", 1499.95, Manufacturer.Fender, Type.Electric, "Stratocastor", Wood.Alder, Wood.Alder, 6);
		inventory.addGuitar("V9512", 1549.95, Manufacturer.Fender, Type.Electric, "Stratocastor", Wood.Alder, Wood.Alder, 6);
		inventory.addGuitar("122784", 5495.95, Manufacturer.Martin, Type.Acoustic, "D-18", Wood.Mahogany, Wood.Adirondack, 6);
		inventory.addGuitar("76531", 6295.95, Manufacturer.Martin, Type.Acoustic, "OM-28", Wood.BrazilianRosewood,
				Wood.Adirondack, 6);
		inventory.addGuitar("70108276", 2295.95, Manufacturer.Gibson, Type.Electric, "Les Paul", Wood.Mahogany,
				Wood.Mahogany, 6);
		inventory.addGuitar("82765501", 1890.95, Manufacturer.Gibson, Type.Electric, "SG '61 Reissue", Wood.Mahogany,
				Wood.Mahogany, 6);
		inventory.addGuitar("77023", 6275.95, Manufacturer.Martin, Type.Acoustic, "D-28", Wood.BrazilianRosewood,
				Wood.Adirondack, 6);
		inventory.addGuitar("1092", 12995.95, Manufacturer.Olson, Type.Acoustic, "SJ", Wood.IndianRosewood, Wood.Cedar, 6);
		inventory.addGuitar("566-62", 8999.95, Manufacturer.Ryan, Type.Acoustic, "Cathedral", Wood.Cocobolo, Wood.Cedar, 6);
		inventory.addGuitar("629584", 2100.95, Manufacturer.PRS, Type.Electric, "Dave Navarro Signature", Wood.Mahogany,
				Wood.Maple, 6);
		inventory.addGuitar("GPC12PA4", 1595.95, Manufacturer.Martin, Type.Acoustic, "GPC12PA4", Wood.Maple, Wood.Sitka, 6);
	}

	/**
	 * Test get with serial number
	 */
	@Test
	public void test_get() {
		Assert.assertTrue(this.guitarEquals(new Guitar("76531", 6295.95, Manufacturer.Martin,Type.Acoustic, "OM-28", Wood.BrazilianRosewood,
				Wood.Adirondack, 6), this.guitarInventory.getGuitar("76531")));
		Assert.assertTrue(this.guitarEquals(new Guitar("70108276", 2295.95, Manufacturer.Gibson,Type.Electric,"Les Paul",Wood.Mahogany,
				Wood.Mahogany, 6), this.guitarInventory.getGuitar("70108276")));
		Assert.assertTrue(this.guitarEquals(new Guitar("566-62", 8999.95, Manufacturer.Ryan, Type.Acoustic,"Cathedral", Wood.Cocobolo, Wood.Cedar, 6), 
				this.guitarInventory.getGuitar("566-62")));
	}

	/**
	 * Test add, use getGuitar
	 */
	@Test
	public void test_add() {
		Guitar g1 = new Guitar("122784x", 5495.95, Manufacturer.Martin, Type.Acoustic, "D-18",Wood.Mahogany, Wood.Alder, 12);
		this.guitarInventory.addGuitar("122784x", 5495.95, Manufacturer.Martin,Type.Acoustic, "D-18", Wood.Mahogany, Wood.Alder, 12);
		Guitar sg1 = this.guitarInventory.getGuitar("122784x");
		Assert.assertTrue(this.guitarEquals(g1, sg1));
	}
	
	/**
	 * Test fully qualified search
	 */
	@Test
	public void test_search() {
		guitarInventory.toString();
		GuitarSpec searchGuitarSpec = new GuitarSpec( "Martin", "Acoustic", "BrazilianRosewood", "Adirondack", "D-28");
		String[] serialNumbers = { "77023","V9512" };
		this.searchTester(searchGuitarSpec, serialNumbers);
	}

	/**
	 * Test fully qualified search with mixed case
	 */
	@Test
	public void test_search_case() {
		GuitarSpec searchGuitarSpec = new GuitarSpec("Martin", "Acoustic", "BrazilianRosewood", "Adirondack", "D-28");
		String[] serialNumbers = { "77023","V9512" };
		this.searchTester(searchGuitarSpec, serialNumbers);
	}

	/**
	 * Test search with just manufacturer
	 */
	@Test
	public void test_search_manufacturer() {
	
		  GuitarSpec searchGuitarSpec = new GuitarSpec("Fender", null, null, null, null);
		  String[] serialNumbers = {"V95693","V9512"};
		  this.searchTester(searchGuitarSpec, serialNumbers);
		 

		 searchGuitarSpec = new GuitarSpec("Gibson", null, null, null, null);
		String[] serialNumbers2 = {"70108276","82765501"};
		this.searchTester(searchGuitarSpec, serialNumbers2);
	}
	
	/**
	 * Test search with just type
	 *
	 */ 
	@Test
	public void test_search_type() {
	
		GuitarSpec searchGuitarSpec = new GuitarSpec( null, "Electric", null, null, null);
		String[] serialNumbers = {"V95693","V9512","70108276","82765501","629584"};
		this.searchTester(searchGuitarSpec, serialNumbers);
	}
	
	/**
	 * Test search with 2 attributes (manufacturers and back wood)
	 */
	@Test
	public void test_search_2Attrib() {
		GuitarSpec searchGuitarSpec = new GuitarSpec( "Gibson", null, "Mahogany", null, null);
		String[] serialNumbers = {"70108276","82765501"};
		this.searchTester(searchGuitarSpec, serialNumbers);
	}
	
	/**
	 * Test search with string
	 * No search for numstrings, it is not part of GuitarSpec
	 */
	/** @Test
	 
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
		try
		{
			GuitarSpec searchGuitarSpec = new GuitarSpec("Lexus", null, null, null, null);	
		}catch(IllegalArgumentException e)
		{
			return;
		}
		
		Assert.assertNull("Should not have found any guitars", null);
	}
	
	
	/**
	 * Utility method for testing search. Does the search, then looks to see that we
	 * got guitars with certain serial numbers
	 * @param searchGuitar the search specs
	 * @param serialNumbers the serial numbers we expect
	 */
	
	private void searchTester(GuitarSpec gs, String[] serialNumbers) {
		List<Guitar> matchingGuitars = this.guitarInventory.search(gs);
		this.checkGuitarList(matchingGuitars, serialNumbers);
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
		Manufacturer manufacturer = g1.getManufacturer();
		if ((manufacturer != (g2.getManufacturer())))
			return false;
		String model = g1.getModel();
		if (!model.equalsIgnoreCase(g2.getModel()))
			return false;
		Type type = g1.getType();
		if (type != (g2.getType()))
			return false;
		Wood backWood = g1.getBackWood();
		if (backWood != (g2.getBackWood()))
			return false;
		Wood topWood = g1.getTopWood();
		if (topWood != (g2.getTopWood()))
			return false;
		return true;
	}
}
