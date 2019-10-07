/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student:Vinitha Gaddampally
 * Date: 2018-09-21
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 *
 * 
 * @author HeadFirstOODA
 *
 */
public class GuitarSpec implements GuitarInterface {
	/**
	 * Specifies manufacturer name in Guitar specification
	 * 
	 */

private Manufacturer manufacturer;
/*
 * manufacturer model number in guitar specification
 */
private String model;
/*
 * Guitar type in guitar specification
 * 
 */
private GuitarType type;
/*
 * type of wood used in the body
 */
private GuitarWood backwood;
/*
 * type of wood used on the top
 */
private GuitarWood topWood;
/*
 * type of wood used in the body
 */

private GuitarWood backWood;

public enum GuitarWood{
   ADIRONDACK("Adirondak"),
   ALDER("Alder"),
   BRAZILIANROSEWOOD("Brazilian Rosewood"),
   CEDAR("Cedar"),
	COCOBOLO("Cocobolo"),
INDIANROSEWOOD("Indian_Rosewood"),
		MAHOGANY("Mahogany"),
		MAPLE("Maple"),
		SITKA("Sitka");

	private String displayName;

GuitarWood(String displayName){
	

         this.displayName = displayName;

       }

  public String displayName() { 
	  return displayName; 
	  }

	    @Override public String toString() 
	    { 
	    	return displayName; 
	    	}
   }


public enum GuitarType {

ACOUSTIC("Acoustic"),
ELECTRIC("Electric");
	
private String displayName;

		GuitarType(String displayName) {
			
this.displayName = displayName;

}

public String displayName() 
{
	return displayName;
	}

 @Override public String toString() {
	 return displayName;
	 }
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

GuitarManufacturer(String displayName)
{
this.displayName = displayName;
}

	public String displayName() {
		
		return displayName;
		}

    @Override public String toString() 
    { 
    	return displayName;
    	}
}
/**

* Returns type of Guitar


 */

	@Override

	public GuitarType getType() {

      return this.type;

   }

/**
 * Returns manufacturer of Guitar
 */

@Override

public Manufacturer getManufacturer() {
	
return this.manufacturer;
}

/**

 * Returns topwood of Guitar

 */

@Override

public gettopWood() {
	
		return this.topWood;
}
/**
 * Returns backwood of Guitar

 */
@Override

public getbackWood() {

return this.backwood;

}

/**
* Returns model of Guitar
*/

@Override

public String getModel() {

return this.model;
}

	/**

      * Set manufacturer for guitar

       * @param manufacturer

        */

public void setManufacturer(GuitarManufacturer manufacturer) {

this.manufacturer = manufacturer;

}

/**

* Set model for guitar

* @param model
 */

public void setModel(String model) {
this.model = model;
}

/**
* Set type for guitar
* @param type
*/

public void setType(GuitarType type) {

		this.type = type;
	}

	/**

* Set back wood for guitar

 * @param backWood
 */

public void setBackWood(GuitarWood backWood) {

this.backwood = backWood;

}

	/**

* Set topwood for guitar

* @param topWood

*/

public void setTopWood(GuitarWood topWood) {

		this.topWood = topWood;

	}


/**
* Compares all properties of new guitar spec to this guitar spec

 * 

 * @param GuitarSpec newGuitarSpec 

 * @return true if all properties of new guitar spec matches this guitar spec

 */

public boolean equals(GuitarSpec newGuitarSpec) {

		if (

this.manufacturer == newGuitarSpec.getManufacturer() &&

       this.model == newGuitarSpec.getModel() &&
			
    this.backWood == newGuitarSpec.getBackWood() &&

     this.topWood == newGuitarSpec.getTopWood() &&

        this.type == newGuitarSpec.getType()

		) {

			return true;

       	}

               return false;

           }


      /**

	 * Compares anyone property of new guitar spec to this guitar spec

      * 

      * @param GuitarSpec newGuitarSpec

      * @return true if any property of new guitar spec matches      this guitar spec

      */

public boolean matches(GuitarSpec newGuitarSpec) {

     if (


this.manufacturer == newGuitarSpec.getManufacturer() ||
       
        this.model == newGuitarSpec.getModel() ||

      this.backWood == newGuitarSpec.getBackWood() ||

	   this.topWood == newGuitarSpec.getTopWood() ||

         this.type == newGuitarSpec.getType()


           ) {

        return true;

             }

       return false;

             }

             }

	

