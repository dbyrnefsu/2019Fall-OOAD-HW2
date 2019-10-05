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
		inventory.addGuitar("11277", 3999.95, Manufacturer.Collins, Type.Acoustic, "CJ", Wood.IndianRosewood, Wood.Sitka, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V95693", 1499.95, Manufacturer.Fender, Type.Electric, "Stratocastor", Wood.Alder, Wood.Alder, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V9512", 1549.95, Manufacturer.Fender, Type.Electric, "Stratocastor", Wood.Alder, Wood.Alder, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("122784", 5495.95, Manufacturer.Gibson, Type.Acoustic, "D-18", Wood.Mahogany, Wood.Adirondack, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("76531", 6295.95, Manufacturer.Gibson, Type.Acoustic, "OM-28", Wood.BrazilianRosewood, //$NON-NLS-1$ //$NON-NLS-2$
				Wood.Adirondack, 6);
		inventory.addGuitar("70108276", 2295.95, Manufacturer.Martin, Type.Electric, "Les Paul", Wood.Mahogany, //$NON-NLS-1$ //$NON-NLS-2$
				Wood.Mahogany, 6);
		inventory.addGuitar("82765501", 1890.95, Manufacturer.Martin, Type.Electric, "SG '61 Reissue", Wood.Mahogany, //$NON-NLS-1$ //$NON-NLS-2$
				Wood.Mahogany, 6);
		inventory.addGuitar("77023", 6275.95, Manufacturer.Gibson, Type.Acoustic, "D-28", Wood.BrazilianRosewood, //$NON-NLS-1$ //$NON-NLS-2$
				Wood.Adirondack, 6);
		inventory.addGuitar("1092", 12995.95, Manufacturer.Olson, Type.Acoustic, "SJ", Wood.IndianRosewood, Wood.Cedar, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("566-62", 8999.95, Manufacturer.Ryan, Type.Acoustic, "Cathedral", Wood.Cocobolo, Wood.Cedar, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("6 29584", 2100.95, Manufacturer.PRS, Type.Electric, "Dave Navarro Signature", Wood.Mahogany, //$NON-NLS-1$ //$NON-NLS-2$
				Wood.Maple, 6);
		inventory.addGuitar("GPC12PA4", 1595.95, Manufacturer.Gibson, Type.Acoustic, "GPC12PA4", Wood.Maple, Wood.Sitka, 12); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
