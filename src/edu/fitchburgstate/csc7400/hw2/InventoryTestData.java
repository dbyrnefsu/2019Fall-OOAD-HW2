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
		inventory.addGuitar("11277", 3999.95, new GuitarSpec(GuitarManufacturer.COLLINS, GuitarType.ACOUSTIC,  GuitarWood.INDIANROSEWOOD, GuitarWood.SITKA, "CJ"), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V95693", 1499.95, new GuitarSpec(GuitarManufacturer.FENDER, GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER, "Stratocastor"), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V9512", 1549.95, new GuitarSpec(GuitarManufacturer.FENDER, GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER, "Stratocastor"), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("122784", 5495.95, new GuitarSpec(GuitarManufacturer.MARTIN, GuitarType.ACOUSTIC, GuitarWood.MAHOGANY, GuitarWood.ADIRONDACK, "D-18"), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("76531", 6295.95, new GuitarSpec(GuitarManufacturer.MARTIN, GuitarType.ACOUSTIC, GuitarWood.BRAZILIANROSEWOOD, GuitarWood.ADIRONDACK, "OM-28"), 6);
		inventory.addGuitar("70108276", 2295.95, new GuitarSpec(GuitarManufacturer.GIBSON, GuitarType.ELECTRIC, GuitarWood.MAHOGANY, GuitarWood.MAHOGANY, "Les Paul"), 6);
		inventory.addGuitar("82765501", 1890.95, new GuitarSpec(GuitarManufacturer.GIBSON, GuitarType.ELECTRIC, GuitarWood.MAHOGANY, GuitarWood.MAHOGANY, "SG '61 Reissue"), 6);
		inventory.addGuitar("77023", 6275.95, new GuitarSpec(GuitarManufacturer.MARTIN, GuitarType.ACOUSTIC, GuitarWood.BRAZILIANROSEWOOD, GuitarWood.ADIRONDACK, "D-28"), 6);
		inventory.addGuitar("1092", 12995.95, new GuitarSpec(GuitarManufacturer.OLSON, GuitarType.ACOUSTIC, GuitarWood.INDIANROSEWOOD, GuitarWood.CEDAR, "SJ"), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("566-62", 8999.95, new GuitarSpec(GuitarManufacturer.RYAN, GuitarType.ACOUSTIC, GuitarWood.COCOBOLO, GuitarWood.CEDAR, "Cathedral"), 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("6 29584", 2100.95, new GuitarSpec(GuitarManufacturer.PRS, GuitarType.ELECTRIC, GuitarWood.MAHOGANY, GuitarWood.MAPLE, "Dave Navarro Signature"), 6);
		inventory.addGuitar("GPC12PA4", 1595.95, new GuitarSpec(GuitarManufacturer.MARTIN, GuitarType.ACOUSTIC, GuitarWood.MAPLE, GuitarWood.SITKA, "GPC12PA4"),  12); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
