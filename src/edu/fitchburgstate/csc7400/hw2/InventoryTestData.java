/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2019-10-05
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
	public static Manufacturer[] MANUFACTURERS = {
			Manufacturer.Collins, // 0
			Manufacturer.Fender, // 1
			Manufacturer.Martin, // 2
			Manufacturer.Gibson, // 3
			Manufacturer.Olson, // 4
			Manufacturer.PRS, // 5
			Manufacturer.Ryan // 6
	};

	/**
	 * Array of guitar types
	 */
	public static Type[] TYPES = {
		Type.Acoustic, // 0
		Type.Electric // 2
	};
	
	/**
	 * Array of Woods
	 */
	public static Wood[] WOODS = {
		Wood.Adirondack, // 0
		Wood.Alder, // 1
		Wood.BrazilianRosewood, // 2 
		Wood.Cedar, // 3
		Wood.Cocobolo, // 4
		Wood.IndianRosewood, // 5 
		Wood.Mahogany, // 6
		Wood.Maple, // 7
		Wood.Sitka // 8
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
