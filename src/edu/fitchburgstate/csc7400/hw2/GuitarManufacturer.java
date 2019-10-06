package edu.fitchburgstate.csc7400.hw2;

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
