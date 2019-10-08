package edu.fitchburgstate.csc7400.hw2;
/**
 * @subject:OOAD
 * @author:kyathi
 *@version1.1
 *@01405072 priya and sana
 */


public class guitarspec
{
	     private String model;
	/**
	* guitar type in guitar specification
	*/
	     
	     private Manufacturer manufacturer;
	/**
	* manufacturer model number in guitar specification
	*/
	     private Type type;
	/**
	* wood used for back of the guitar in a guitar specification
	*/

	     private woodmodel backwood;
	/**
	* wood used for guitar face in guitar specification
	*/
	     private woodmodel topwood;
	/**
	* full constructor of guitarSpec with parameters
	* @param manufacturer Guitar's manufacturer
	* @param model guitar's model
	* @param type guitar's type
	* @param backwood guitar's backwood
	* @param topwood guitar's topwood
	*/
	     public guitarspec(Manufacturer manufacturer,String model,Type type,Woodmodel backwood,woodmodel topwood)
	     {
	    	   this.manufacturer=manufacturer;
	    	   this.type=type;
	    	   this.backwood=backwood;
	    	   this.topwood=topwood;
	    	   this.model=model;

	   }
	     public boolean match(guitarspec g)
	     {
	    	    if((manufacturer==g.manufacturer)||(type==g.type)||(backwood==g.backwood)||topwood==g.topwood)||(model.toLowerCase().equals(g.model.tolowercase())))
                 
                  return manufacturer;
		     /** 
		     *get guitar manufacturer
		     */
		     
                  
	     }
	     public type gettype()
	     {
	    	      return type;
		     /**
		     * set guitar type with the value passed as a parameter
		     * @param type guitar's type
		     */
	     }
	     public Woodmodel getbackwood()
	     {
	    	 return backwood;
		     /**
		     * sets backwood value of guitar with the value passed as a parameter
		     * @param backwood guitar's backwood type
		     */
	     }
	     public Woodmodel gettopwood()
	     {
	    	 return topwood;
		     /**
		     * sets topwood value of guitar with the value passes as a parameter
		     * @param topwood guitar's topwood type
		     */
	     }
	     public String getmodel()
	     {
	    	 return model;
	     }
	/** 
	* sets model of the guitar with the value passed as a parameter
	* @param model string value of guitar's model
	*/
	     
	     
	     }
}
