package edu.fitchburgstate.csc7400.hw2;

import java.util.Arrays;

public enum GuitarWood {
	ADIRONDACK("Adirondack"),
	ALDER("Alder"),
	BRAZILIANROSEWOOD("Brazilian Rosewood"),
	CEDAR("Cedar"),
	COCOBOLO("Cocobolo"),
	INDIANROSEWOOD("Indian Rosewood"),
	MAHOGANY("Mahogany"),
	MAPLE("Maple"),
	SITKA("Sitka");
	
	private String displayName;
	
	GuitarWood(String displayName) {
		this.displayName = displayName;
	}
	
	public String displayName() { return displayName; }
	
	public static String[] getStringArray() {
		return Arrays.toString(GuitarWood.values()).replaceAll("^.|.$", "").split(", ");
	}

    @Override public String toString() { return displayName; }

}
