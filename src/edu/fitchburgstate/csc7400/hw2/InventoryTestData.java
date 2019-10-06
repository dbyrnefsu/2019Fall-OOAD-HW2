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
	public static GuitarInterface.Manufacturer[] MANUFACTURERS = GuitarInterface.Manufacturer.values();
	/**
	 * Array of guitar types
	 */
	public static GuitarInterface.Type[] TYPES = GuitarInterface.Type.values();

	/**
	 * Array of guitar wood types
	 */
	public static GuitarInterface.Wood[] WOODS = GuitarInterface.Wood.values();
	/**
	 * Use for wild card values
	 */
	public static String NONE = "Any";

	/**
	 * Fills inventory with a set of test guitars.
	 */
	public static Inventory initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, GuitarInterface.Manufacturer.FENDER, GuitarInterface.Type.ELECTRIC, "Stratocastor", GuitarInterface.Wood.ALDER, GuitarInterface.Wood.ALDER, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("V9512", 1549.95, GuitarInterface.Manufacturer.FENDER, GuitarInterface.Type.ELECTRIC, "Stratocastor", GuitarInterface.Wood.ALDER,GuitarInterface.Wood.ALDER, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("122784", 5495.95, GuitarInterface.Manufacturer.MARTIN, GuitarInterface.Type.ACOUSTIC, "D-18", GuitarInterface.Wood.MAHOGANY, GuitarInterface.Wood.ADIRONDACK, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("76531", 6295.95, GuitarInterface.Manufacturer.MARTIN, GuitarInterface.Type.ACOUSTIC, "OM-28", GuitarInterface.Wood.BRAZILIAN_ROSEWOOD,GuitarInterface.Wood.ADIRONDACK,6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("70108276", 2295.95, GuitarInterface.Manufacturer.GIBSON, GuitarInterface.Type.ELECTRIC, "Les Paul", GuitarInterface.Wood.MAHOGANY,GuitarInterface.Wood.MAHOGANY,6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("82765501", 1890.95, GuitarInterface.Manufacturer.GIBSON, GuitarInterface.Type.ELECTRIC, "SG '61 Reissue", GuitarInterface.Wood.MAHOGANY,GuitarInterface.Wood.MAHOGANY,6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("77023", 6275.95, GuitarInterface.Manufacturer.MARTIN, GuitarInterface.Type.ACOUSTIC, "D-28", GuitarInterface.Wood.BRAZILIAN_ROSEWOOD,GuitarInterface.Wood.ADIRONDACK,6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("1092", 12995.95, GuitarInterface.Manufacturer.OLSON, GuitarInterface.Type.ACOUSTIC, "SJ", GuitarInterface.Wood.INDIAN_ROSEWOOD, GuitarInterface.Wood.CEDAR, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("566-62", 8999.95, GuitarInterface.Manufacturer.RYAN, GuitarInterface.Type.ACOUSTIC, "Cathedral", GuitarInterface.Wood.COCOBOLO,GuitarInterface.Wood.CEDAR, 6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("6 29584", 2100.95, GuitarInterface.Manufacturer.PRS, GuitarInterface.Type.ELECTRIC, "Dave Navarro Signature", GuitarInterface.Wood.MAHOGANY,GuitarInterface.Wood.MAPLE,6); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("GPC12PA4", 1595.95, GuitarInterface.Manufacturer.MARTIN, GuitarInterface.Type.ACOUSTIC, "GPC12PA4", GuitarInterface.Wood.MAPLE,GuitarInterface.Wood.SITKA,12); //$NON-NLS-1$ //$NON-NLS-2$
		inventory.addGuitar("11277", 3999.95, GuitarInterface.Manufacturer.COLLINGS, GuitarInterface.Type.ELECTRIC, "CJ",GuitarInterface.Wood.INDIAN_ROSEWOOD,GuitarInterface.Wood.INDIAN_ROSEWOOD, 6); //$NON-NLS-1$ //$NON-NLS-2$
		return inventory;
	}
}
