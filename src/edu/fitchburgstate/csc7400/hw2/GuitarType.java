package edu.fitchburgstate.csc7400.hw2;

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
