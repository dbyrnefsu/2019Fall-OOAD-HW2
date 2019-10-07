package edu.fitchburgstate.csc7400.hw2;
/**
 * @subject:OOAD
 * @author:kyathi
 *@version1.1
 *@01405072 priya
 */


public class guitarspec
{
	     private String model;
	     
	     private Manufacturer manufacturer;
	     private Type type;
	     private woodmodel backwood;
	     private woodmodel topwood;
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
                  
	     }
	     public type gettype()
	     {
	    	      return type;
	     }
	     public Woodmodel getbackwood()
	     {
	    	 return backwood;
	     }
	     public Woodmodel gettopwood()
	     {
	    	 return topwood;
	     }
	     public String getmodel()
	     {
	    	 return model;
	     }
	     
	     
	     }
}