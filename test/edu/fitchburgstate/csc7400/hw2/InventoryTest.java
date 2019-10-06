/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Date: 2017-09-20
 */
package edu.fitchburgstate.csc7400.hw2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Assert.assertTrue(this.guitarEquals(new Guitar("76531", 6295.95, GuitarInterface.Manufacturer.MARTIN, "OM-28", GuitarInterface.Type.ACOUSTIC,
                GuitarInterface.Wood.ADIRONDACK, GuitarInterface.Wood.BRAZILIAN_ROSEWOOD, 6), this.guitarInventory.getGuitar("76531")));
        Assert.assertTrue(this.guitarEquals(new Guitar("70108276", 2295.95, GuitarInterface.Manufacturer.GIBSON, "Les Paul",
                GuitarInterface.Type.ELECTRIC, GuitarInterface.Wood.MAHOGANY, GuitarInterface.Wood.MAHOGANY, 6), this.guitarInventory.getGuitar("70108276")));
        Assert.assertTrue(this.guitarEquals(new Guitar("566-62", 8999.95, GuitarInterface.Manufacturer.RYAN, "Cathedral", GuitarInterface.Type.ACOUSTIC,
                GuitarInterface.Wood.CEDAR, GuitarInterface.Wood.COCOBOLO, 6), this.guitarInventory.getGuitar("566-62")));
    }

    /**
     * Test add, use getGuitar
     */
    @Test
    public void test_add() {
        Guitar g1 = new Guitar("122784x", 5495.95, GuitarInterface.Manufacturer.MARTIN, "D-18", GuitarInterface.Type.ACOUSTIC, GuitarInterface.Wood.MAHOGANY, GuitarInterface.Wood.ALDER, 12);
        this.guitarInventory.addGuitar("122784x", 5495.95, GuitarInterface.Manufacturer.MARTIN, GuitarInterface.Type.ACOUSTIC, "D-18", GuitarInterface.Wood.ALDER, GuitarInterface.Wood.MAHOGANY, 12);
        Guitar sg1 = this.guitarInventory.getGuitar("122784x");
        Assert.assertTrue(this.guitarEquals(g1, sg1));
    }

    /**
     * Test fully qualified search
     */
    @Test
    public void test_search() {
        Guitar searchGuitar = new Guitar(null, 0, GuitarInterface.Manufacturer.FENDER, "Stratocastor", GuitarInterface.Type.ELECTRIC, GuitarInterface.Wood.ALDER, GuitarInterface.Wood.ALDER, 6);
        String[] serialNumbers = {"V95693", "V9512"};
        this.searchTester(searchGuitar, serialNumbers);
    }

    /**
     * Test fully qualified search with mixed case
     */
    @Test
    public void test_search_case() {
        Guitar searchGuitar = new Guitar(null, 0, GuitarInterface.Manufacturer.FENDER, "Stratocastor", GuitarInterface.Type.ELECTRIC, GuitarInterface.Wood.ALDER, GuitarInterface.Wood.ALDER, null);
        String[] serialNumbers = {"V95693", "V9512"};
        this.searchTester(searchGuitar, serialNumbers);
    }

    /**
     * Test search with just manufacturer
     */
    @Test
    public void test_search_manufacturer() {
        Guitar searchGuitar = new Guitar(null, 0, GuitarInterface.Manufacturer.GIBSON, null, null, null, null, null);
        String[] serialNumbers = {"70108276", "82765501"};
        this.searchTester(searchGuitar, serialNumbers);

        searchGuitar = new Guitar(null, 0, GuitarInterface.Manufacturer.COLLINGS, null, null, null, null, null);
        String[] serialNumbers2 = {"11277"};
        this.searchTester(searchGuitar, serialNumbers2);
    }

    /**
     * Test search with just type
     */
    @Test
    public void test_search_type() {

        Guitar searchGuitar = new Guitar(null, 0, null, null, GuitarInterface.Type.ACOUSTIC, null, null, null);
        String[] serialNumbers = {"11277", "122784", "76531", "77023", "1092", "566-62"};
        this.searchTester(searchGuitar, serialNumbers);
    }

    /**
     * Test search with 2 attributes (manufacturers and back wood)
     */
    @Test
    public void test_search_2Attrib() {
        Guitar searchGuitar = new Guitar(null, 0, GuitarInterface.Manufacturer.MARTIN, null, null, null, GuitarInterface.Wood.BRAZILIAN_ROSEWOOD, null);
        String[] serialNumbers = {"76531", "77023"};
        this.searchTester(searchGuitar, serialNumbers);
    }

    /**
     * Test search with string
     */
    @Test
    public void test_search_numstrings() {
        Guitar searchGuitar = new Guitar(null, 0, null, null, null, null, null, 12);
        String[] serialNumbers = {"GPC12PA4"};
        this.searchTester(searchGuitar, serialNumbers);
    }

    /**
     * Test to make sure nothing comes back if no match
     */
    @Test
    public void test_search_notFound() {
        Guitar searchGuitar = new Guitar(null, 0, GuitarInterface.Manufacturer.LEXUS, null, null, null, null, null);
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
            this.checkGuitarList(searchGuitar, serialNumbers);
    }

    /**
     * Utility method for testing search. Checks to see that we the guitars in the
     * list contain certain serial numbers
     *
     * @param searchGuitar the matching guitar
     * @param serialNumbers  the serial numbers we expect
     */
    private void checkGuitarList(Guitar searchGuitar, String[] serialNumbers) {
        List<Guitar> matchingGuitars = this.guitarInventory.search(searchGuitar);
        String serialNumber ="";
        Set<String> shouldFind = new HashSet<String>();
        for (String str : serialNumbers) {
            shouldFind.add(str);
        }
        for(Guitar guitar : matchingGuitars){
            if(shouldFind.contains(guitar.getSerialNumber())) serialNumber =guitar.getSerialNumber();
        }
        Assert.assertTrue(shouldFind.contains(serialNumber));
    }

    /**
     * Utility method for checking if 2 guitars are equal.
     *
     * @param g1 first guitar
     * @param g2 second guitar
     * @return true if g1 and g2 are equal
     */
    private boolean guitarEquals(Guitar g1, Guitar g2) {
        GuitarInterface.Manufacturer manufacturer = g1.getManufacturer();
        if ((!manufacturer.equals(g2.getManufacturer())))
            return false;
        String model = g1.getModel();
        if (!model.equalsIgnoreCase(g2.getModel()))
            return false;
        GuitarInterface.Type type = g1.getType();
        if (!type.equals(g2.getType()))
            return false;
        GuitarInterface.Wood backWood = g1.getBackWood();
        if (!backWood.equals(g2.getBackWood()))
            return false;
        GuitarInterface.Wood topWood = g1.getTopWood();
        if (!topWood.equals(g2.getTopWood()))
            return false;
        return true;
    }
}
