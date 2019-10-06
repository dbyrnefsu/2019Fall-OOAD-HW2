package edu.fitchburgstate.csc7400.hw2;

import java.util.Arrays;

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
	
	public static String[] getStringArray() {
		return Arrays.toString(GuitarManufacturer.values()).replaceAll("^.|.$", "").split(", ");
	}

    @Override public String toString() { return displayName; }
}
