/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
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
			"Collins", // 0
			"Fender", // 1
			"Martin", // 2
			"Gibson", // 3
			"Olson", // 4
			"PRS", // 5
			"Ryan" // 6
	};

	/**
	 * Array of guitar types
	 */
	public static String[] TYPES = {
		"Acoustic", // 0
		"Electric" // 2
	};
	
	public static String[] WOODS = {
		"Adirondack", // 0
		"Alder", // 1
		"Brazilian Rosewood", // 2 
		"Cedar", // 3
		"Cocobolo", // 4
		"Indian Rosewood", // 5 
		"Mahogany", // 6
		"Maple", // 7
		"Sitka" // 8
	};

	/**
	 * Use for wild card values
	 */
	public static String NONE = "Any";
	
	/**
	 * Fills inventory with a set of test guitars.
	 */
	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, MANUFACTURERS[0], TYPES[0], "CJ", WOODS[5], WOODS[8], 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V95693", 1499.95, MANUFACTURERS[1], TYPES[1], "Stratocastor", WOODS[1], WOODS[1], 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V9512", 1549.95, MANUFACTURERS[1], TYPES[1], "Stratocastor", WOODS[1], WOODS[1], 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("122784", 5495.95, MANUFACTURERS[2], TYPES[0], "D-18", WOODS[6], WOODS[0], 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("76531", 6295.95, MANUFACTURERS[2], TYPES[0], "OM-28", WOODS[2], //$NON-NLS-1$ //$NON-NLS-2$
				WOODS[0], 6);
		inventory.addGuitar("70108276", 2295.95, MANUFACTURERS[3], TYPES[1], "Les Paul", WOODS[6], //$NON-NLS-1$ //$NON-NLS-2$
				WOODS[6], 6);
		inventory.addGuitar("82765501", 1890.95, MANUFACTURERS[3], TYPES[1], "SG '61 Reissue", WOODS[6], //$NON-NLS-1$ //$NON-NLS-2$
				WOODS[6], 6);
		inventory.addGuitar("77023", 6275.95, MANUFACTURERS[2], TYPES[0], "D-28", WOODS[2], //$NON-NLS-1$ //$NON-NLS-2$
				WOODS[0], 6);
		inventory.addGuitar("1092", 12995.95, MANUFACTURERS[4], TYPES[0], "SJ", WOODS[5], WOODS[3], 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("566-62", 8999.95, MANUFACTURERS[6], TYPES[0], "Cathedral", WOODS[4], WOODS[3], 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("6 29584", 2100.95, MANUFACTURERS[5], TYPES[1], "Dave Navarro Signature", WOODS[6], //$NON-NLS-1$ //$NON-NLS-2$
				WOODS[7], 6);
		inventory.addGuitar("GPC12PA4", 1595.95, MANUFACTURERS[2], TYPES[0], "GPC12PA4", WOODS[7], WOODS[8], 12); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
