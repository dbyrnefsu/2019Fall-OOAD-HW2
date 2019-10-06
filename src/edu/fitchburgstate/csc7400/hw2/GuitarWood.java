package edu.fitchburgstate.csc7400.hw2;

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
