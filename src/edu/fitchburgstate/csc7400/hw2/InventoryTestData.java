/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Oleksandr (Alex) Koblosh
 * Date: 10-7-2019
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
			"Collings", // 0
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
			"Electric" // 1
	};

	public static String[] WOODS = {
			"Adirondack", // 0
			"Alder", // 1
			"BrazilianRosewood", // 2
			"Cedar", // 3
			"Cocobolo", // 4
			"IndianRosewood", // 5
			"Mahogany", // 6
			"Maple", // 7
			"Sitka" // 8
	};

	/**
	 * Use for wild card values
	 */
	public static String NONE = "Any";
	//assigning variables to each array value after converting them to enum types.
	public static Manufacturer m0 = Manufacturer.valueOf(MANUFACTURERS[0]);
	public static Manufacturer m1 = Manufacturer.valueOf(MANUFACTURERS[1]);
	public static Manufacturer m2 = Manufacturer.valueOf(MANUFACTURERS[2]);
	public static Manufacturer m3 = Manufacturer.valueOf(MANUFACTURERS[3]);
	public static Manufacturer m4 = Manufacturer.valueOf(MANUFACTURERS[4]);
	public static Manufacturer m5 = Manufacturer.valueOf(MANUFACTURERS[5]);
	public static Manufacturer m6 = Manufacturer.valueOf(MANUFACTURERS[6]);

	public static Type t0 =Type.valueOf(TYPES[0]);
	public static Type t1 =Type.valueOf(TYPES[1]);

	public static Wood w0 = Wood.valueOf(WOODS[0]);
	public static Wood w1 = Wood.valueOf(WOODS[1]);
	public static Wood w2 = Wood.valueOf(WOODS[2]);
	public static Wood w3 = Wood.valueOf(WOODS[3]);
	public static Wood w4 = Wood.valueOf(WOODS[4]);
	public static Wood w5 = Wood.valueOf(WOODS[5]);
	public static Wood w6 = Wood.valueOf(WOODS[6]);
	public static Wood w7 = Wood.valueOf(WOODS[7]);
	public static Wood w8 = Wood.valueOf(WOODS[8]);

	/*
	 * Adding the inventory to Initialize Inventory Class
	 * Initializes inventory data with multiple guitar details
	 *
	 * @param inventory Guitar's Inventory class object
	 */
	static void initializeInventory(Inventory inventory) {


		inventory.addGuitar("11277", 3999.95, m0, t0, "CJ",  w5, w8, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V95693", 1499.95, m0, t1, "Stratocastor",  w1, w1, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V9512", 1549.95, m1, t1, "Stratocastor",  w1, w1, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("122784", 5495.95, m2, t0, "D-18",  w6, w0, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("76531", 6295.95, m2, t0, "OM-28",  w2, //$NON-NLS-1$ //$NON-NLS-2$
				w0, 6);
		inventory.addGuitar("70108276", 2295.95, m3, t1, "Les Paul",  w6, //$NON-NLS-1$ //$NON-NLS-2$
				w6, 6);
		inventory.addGuitar("82765501", 1890.95, m3, t1, "SG '61 Reissue",  w6, //$NON-NLS-1$ //$NON-NLS-2$
				w6, 6);
		inventory.addGuitar("77023", 6275.95, m2, t0, "D-28",  w2, //$NON-NLS-1$ //$NON-NLS-2$
				w0, 6);
		inventory.addGuitar("1092", 12995.95, m4, t0, "SJ",  w5, w3, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("566-62", 8999.95, m6, t0, "Cathedral",  w4, w3, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("6 29584", 2100.95, m5, t1, "Dave Navarro Signature",  w6, //$NON-NLS-1$ //$NON-NLS-2$
				w7, 6);
		inventory.addGuitar("GPC12PA4", 1595.95, m2, t0, "GPC12PA4",  w7, w8, 6); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
