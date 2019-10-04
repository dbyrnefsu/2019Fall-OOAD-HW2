/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Students: @Nodir Nabiev
 *          : @Chandralekha 
 * Version 2.0
 * ModifiedDate: 2019-10-07
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

		inventory.addGuitar("11277", 3999.95, new GuitarSpec("CJ", Manufacturer.COLLINGS, Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V95693", 1499.95, new GuitarSpec("Stratocastor", Manufacturer.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V9512", 1549.95, new GuitarSpec("D-18", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("122784", 5495.95, new GuitarSpec("D-18", Manufacturer.MARTIN, Type.ELECTRIC, Wood.MAHOGANY, Wood.ADIRONDACK), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("76531", 6295.95, new GuitarSpec("OM-28", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.BRAZILLIAN_ROSEWOOD, Wood.ADIRONDACK), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("70108276", 2295.95, new GuitarSpec("Les-Paul", Manufacturer.GIBSON, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("82765501", 1890.95, new GuitarSpec("SG '61 Reissue", Manufacturer.GIBSON, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("77023", 6275.95, new GuitarSpec("D-28", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.BRAZILLIAN_ROSEWOOD, Wood.ADIRONDACK), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("1092", 12995.95, new GuitarSpec("SJ", Manufacturer.OLSON, Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.CEDAR), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("566-62", 8999.95, new GuitarSpec("Cathedral", Manufacturer.RYAN, Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("6 29584", 2100.95, new GuitarSpec("Dave Navarro Signature", Manufacturer.PRS, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("GPC12PA4", 1595.95, new GuitarSpec("GPC12PA4", Manufacturer.MARTIN, Type.ACOUSTIC, Wood.MAPLE, Wood.SITKA), 12); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
