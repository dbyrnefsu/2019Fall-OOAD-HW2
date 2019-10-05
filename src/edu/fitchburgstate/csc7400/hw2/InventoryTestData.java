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
 * 
 * @author omontalv
 *
 */
public class InventoryTestData {
	/**
	 * Array of manufactures
	 */
	public static Manufacturer[] MANUFACTURERS = { Manufacturer.COLLINGS, Manufacturer.FENDER, Manufacturer.MARTIN,
			Manufacturer.GIBSON, Manufacturer.OLSON, Manufacturer.RYAN, Manufacturer.PRS };

	/**
	 * Array of guitar types
	 */
	public static Type[] TYPES = { Type.ACOUSTIC, Type.ELECTRIC

	};

	/**
	 * Array of guitar wood types
	 */
	public static Wood[] WOODS = { Wood.ADIRONDACK,Wood.ALDER,Wood.BRAZILIAN_ROSEWOOD,Wood.CEDAR,Wood.COCOBOLO,Wood.INDIAN_ROSEWOOD,Wood.MAHOGANY,Wood.MAPLE,Wood.SITKA

	};

	/**
	 * Use for wild card values
	 */
	public static String NONE = "Any";

	/**
	 * Fills inventory with a set of test guitars.
	 */
	public static Inventory initializeInventory(Inventory inventory) {
		System.out.println("atleast");
		inventory.addGuitar("11277", 3999.95, MANUFACTURERS[0], TYPES[0], "CJ", WOODS[0], WOODS[0], 6); //$NON-NLS-1$ //$NON-NLS-2$
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
		return inventory;
	}
}
