/**
 * 
 */
package edu.fitchburgstate.csc7400.hw2;



/**
 * @author rphillips
 *
 */
public interface GuitarInterface {
	
	public enum GuitarWood {
		ADIRONDACK("Adirondack"),
		ALDER("Alder"),
		BRAZILIANROSEWOOD("Brazilian Rosewood"),
		CEDAR("Cedar"),
		COCOBOLO("Cocobolo"),
		INDIANROSEWOOD("Indian_Rosewood"),
		MAHOGANY("Mahogany"),
		MAPLE("Maple"),
		SITKA("Sitka");
		
		private String displayName;
		
		GuitarWood(String displayName) {
			this.displayName = displayName;
		}
		
		public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}

	public enum GuitarType {
		ACOUSTIC("Acoustic"),
		ELECTRIC("Electric");
		
		private String displayName;
		
		GuitarType(String displayName) {
			this.displayName = displayName;
		}
		
		public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}

	public enum GuitarManufacturer {
		COLLINS("Collins"),
		FENDER("Fender"),
		MARTIN("Martin"),
		GIBSON("Gibson"),
		OLSON("Olson"),
		PRS("PRS"),
		RYAN("Ryan");
		
		private String displayName;
		
		GuitarManufacturer(String displayName) {
			this.displayName = displayName;
		}
		
		public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}
	
	public GuitarType getType();
	
	public GuitarManufacturer getManufacturer();
	
	public GuitarWood getTopWood();

	public GuitarWood getBackWood();
	
	public String getModel();
	
}
