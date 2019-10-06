package edu.fitchburgstate.csc7400.hw2;

import java.util.Arrays;

public enum GuitarType {
	ACOUSTIC("Acoustic"),
	ELECTRIC("Electric");
	
	private String displayName;
	
	GuitarType(String displayName) {
		this.displayName = displayName;
	}
	
	public String displayName() { return displayName; }
	
	public static String[] getStringArray() {
		return Arrays.toString(GuitarType.values()).replaceAll("^.|.$", "").split(", ");
	}
	
	public static GuitarType getValueFromName(String name) {
		for (GuitarType g : GuitarType.values()) {
			if (g.displayName().equals(name)) { return g; }
		}
		return null;
	}

    @Override public String toString() { return displayName; }
}
