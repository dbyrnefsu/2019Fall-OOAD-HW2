/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
 */

package edu.fitchburgstate.csc7400.hw2;

import edu.fitchburgstate.csc7400.hw2.GuitarInterface.GuitarManufacturer;
import edu.fitchburgstate.csc7400.hw2.GuitarInterface.GuitarWood;
import edu.fitchburgstate.csc7400.hw2.GuitarInterface.GuitarType;

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
		inventory.addGuitar("11277", 3999.95, GuitarManufacturer.COLLINS, GuitarType.ACOUSTIC, "CJ", GuitarWood.INDIANROSEWOOD, GuitarWood.SITKA, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V95693", 1499.95, GuitarManufacturer.FENDER, GuitarType.ELECTRIC, "Stratocastor", GuitarWood.ALDER, GuitarWood.ALDER, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V9512", 1549.95, GuitarManufacturer.FENDER, GuitarType.ELECTRIC, "Stratocastor", GuitarWood.ALDER, GuitarWood.ALDER, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("122784", 5495.95, GuitarManufacturer.MARTIN, GuitarType.ACOUSTIC, "D-18", GuitarWood.MAHOGANY, GuitarWood.ADIRONDACK, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("76531", 6295.95, GuitarManufacturer.MARTIN, GuitarType.ACOUSTIC, "OM-28", GuitarWood.BRAZILIANROSEWOOD, //$NON-NLS-1$ //$NON-NLS-2$
				GuitarWood.ADIRONDACK, 6);
		inventory.addGuitar("70108276", 2295.95, GuitarManufacturer.GIBSON, GuitarType.ELECTRIC, "Les Paul", GuitarWood.MAHOGANY, //$NON-NLS-1$ //$NON-NLS-2$
				GuitarWood.MAHOGANY, 6);
		inventory.addGuitar("82765501", 1890.95, GuitarManufacturer.GIBSON, GuitarType.ELECTRIC, "SG '61 Reissue", GuitarWood.MAHOGANY, //$NON-NLS-1$ //$NON-NLS-2$
				GuitarWood.MAHOGANY, 6);
		inventory.addGuitar("77023", 6275.95, GuitarManufacturer.MARTIN, GuitarType.ACOUSTIC, "D-28", GuitarWood.BRAZILIANROSEWOOD, //$NON-NLS-1$ //$NON-NLS-2$
				GuitarWood.ADIRONDACK, 6);
		inventory.addGuitar("1092", 12995.95, GuitarManufacturer.OLSON, GuitarType.ACOUSTIC, "SJ", GuitarWood.INDIANROSEWOOD, GuitarWood.CEDAR, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("566-62", 8999.95, GuitarManufacturer.RYAN, GuitarType.ACOUSTIC, "Cathedral", GuitarWood.COCOBOLO, GuitarWood.CEDAR, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("6 29584", 2100.95, GuitarManufacturer.PRS, GuitarType.ELECTRIC, "Dave Navarro Signature", GuitarWood.MAHOGANY, //$NON-NLS-1$ //$NON-NLS-2$
				GuitarWood.MAPLE, 6);
		inventory.addGuitar("GPC12PA4", 1595.95, GuitarManufacturer.MARTIN, GuitarType.ACOUSTIC, "GPC12PA4", GuitarWood.MAPLE, GuitarWood.SITKA, 12); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
