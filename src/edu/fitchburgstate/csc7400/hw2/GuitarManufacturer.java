package edu.fitchburgstate.csc7400.hw2;

import java.util.Arrays;

public enum GuitarManufacturer {
	COLLINS("Collins"),
	FENDER("Fender"),
	MARTIN("Martin"),
	GIBSON("Gibson"),
	LEXUS("Lexus"),
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
	
	public static GuitarManufacturer getValueFromName(String name) {
		for (GuitarManufacturer g : GuitarManufacturer.values()) {
			if (g.displayName().equals(name)) { return g; }
		}
		return null;
	}

    @Override public String toString() { return displayName; }
}
