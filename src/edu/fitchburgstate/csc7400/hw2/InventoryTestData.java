/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Xia Jin, Akhila Lolam
 * Date: 2019-10-03
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 * InventoryTestData sets up some test data for us to play with
 * @author omontalv
 *
 */
public class InventoryTestData {
	/**
	 * Array of manufactures
	 */
	public static String[] MANUFACTURERS = {
			"COLLINS", // 0
			"FENDER", // 1
			"MARTIN", // 2
			"GIBSON", // 3
			"OLSON", // 4
			"PRS", // 5
			"RYAN" // 6
	};

	/**
	 * Array of guitar types
	 */
	public static String[] TYPES = {
			"ACOUSTIC", // 0
			"ELECTRIC" // 2
			};
	
	public static String[] WOODS = {
			"ADIRONDACK", // 0
			"ALDER", // 1
			"BRAZILIAN_ROSEWOOD", // 2 
			"CEDAR", // 3
			"COCOBOLO", // 4
			"INDIAN_ROSEWOOD", // 5 
			"MAHOGANY", // 6
			"MAPLE", // 7
			"SITKA" // 8
	};

	/**
	 * Use for wild card values
	 */
	public static String NONE = "Any";
	
	/**
	 * Fills inventory with a set of test guitars.
	 */
	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, Manufacturer.valueOf(MANUFACTURERS[0]), Type.valueOf(TYPES[0]), "CJ",  Wood.valueOf(WOODS[5]), Wood.valueOf(WOODS[8]), 6); 
		inventory.addGuitar("V95693", 1499.95, Manufacturer.valueOf(MANUFACTURERS[1]), Type.valueOf(TYPES[1]), "Stratocastor",  Wood.valueOf(WOODS[1]), Wood.valueOf(WOODS[1]), 6); 
		inventory.addGuitar("V9512", 1549.95, Manufacturer.valueOf(MANUFACTURERS[1]), Type.valueOf(TYPES[1]), "Stratocastor",  Wood.valueOf(WOODS[1]), Wood.valueOf(WOODS[1]), 6); 
		inventory.addGuitar("122784", 5495.95, Manufacturer.valueOf(MANUFACTURERS[2]), Type.valueOf(TYPES[0]), "D-18",  Wood.valueOf(WOODS[6]), Wood.valueOf(WOODS[0]), 6); 
		inventory.addGuitar("76531", 6295.95, Manufacturer.valueOf(MANUFACTURERS[2]), Type.valueOf(TYPES[0]), "OM-28",  Wood.valueOf(WOODS[2]), Wood.valueOf(WOODS[0]), 6);
		inventory.addGuitar("70108276", 2295.95, Manufacturer.valueOf(MANUFACTURERS[3]), Type.valueOf(TYPES[1]), "Les Paul",  Wood.valueOf(WOODS[6]), Wood.valueOf(WOODS[6]), 6);
		inventory.addGuitar("82765501", 1890.95, Manufacturer.valueOf(MANUFACTURERS[3]), Type.valueOf(TYPES[1]), "SG '61 Reissue",  Wood.valueOf(WOODS[6]), Wood.valueOf(WOODS[6]), 6);
		inventory.addGuitar("77023", 6275.95, Manufacturer.valueOf(MANUFACTURERS[2]), Type.valueOf(TYPES[0]), "D-28",  Wood.valueOf(WOODS[2]), Wood.valueOf(WOODS[0]), 6);
		inventory.addGuitar("1092", 12995.95, Manufacturer.valueOf(MANUFACTURERS[4]), Type.valueOf(TYPES[0]), "SJ",  Wood.valueOf(WOODS[5]), Wood.valueOf(WOODS[3]), 6); 
		inventory.addGuitar("566-62", 8999.95, Manufacturer.valueOf(MANUFACTURERS[6]), Type.valueOf(TYPES[0]), "Cathedral",  Wood.valueOf(WOODS[4]), Wood.valueOf(WOODS[3]), 6); 
		inventory.addGuitar("6 29584", 2100.95, Manufacturer.valueOf(MANUFACTURERS[5]), Type.valueOf(TYPES[1]), "Dave Navarro Signature",  Wood.valueOf(WOODS[6]), Wood.valueOf(WOODS[7]), 6);
		inventory.addGuitar("GPC12PA4", 1595.95, Manufacturer.valueOf(MANUFACTURERS[2]), Type.valueOf(TYPES[0]), "GPC12PA4",  Wood.valueOf(WOODS[7]), Wood.valueOf(WOODS[8]), 12); 
	}
}
