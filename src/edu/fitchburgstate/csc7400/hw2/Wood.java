package edu.fitchburgstate.csc7400.hw2;

public enum Wood {
	Adirondack("Adirondack"), 
	Alder("Alder"), 
	Brazilian_Rosewood("Brazilian Rosewood"), 
	Cedar("Cedar"),
	Cocobolo("Cocobolo"), 
	Indian_Rosewood("Indian Rosewood"), 
	Mahogany("Mahogany"), 
	Maple("Maple"), 
	Sitka("Sitka");

	private String displayName;

	Wood(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return displayName;
	}
}
