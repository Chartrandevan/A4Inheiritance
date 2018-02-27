package celestialBodies;

/* **********************************************************
 * Programmer:	Evan Chartrand
 * Class:		CS30S
 * 
 * Assignment:	A4:Inheiritance
 *
 * Description:	derived class of planet with a unique type
 *
 * 
 * *************************************************************
 */
  // import files here as needed
 
 
 public class GasGiant extends Planet
 {  // begin class
 	
     public enum Class{
      AmmoniaClouds, WaterClouds, Cloudless, AlkaliMetal, SilicateClouds   
     }
     
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
    Class classifacation;//the class of gas giant
    
 	
 	
 	// ********** constructors ***********
    
         public GasGiant(){
         name = "unidentified";
         }//end gas giant
    
 	 public GasGiant(String n, double m, int r, int s, int a, int at, double o, int moon, Class c ) {
        super(n, m, r, s, a, at, o, moon);
        classifacation = c;
    }//end initialized constructor
         
 	// ********** accessors **********
 	
    public Class getClassifacation() {
        return classifacation;
    }//end class
 
       public String toString(){
    String s;
    s = this.getName();
    s += "\nMass = " + this.getMass() + " Solar masses";
    s += "\nRadius = " + this.getRadius() + "km";
    s += "\nDiameter = " + this.getDiameter() + " km";
    s += "\nVolume = "+ this.getVolume() + " cubic km";
    s += "\nSurface Tempurate = " + this.getSurfacetemp() + " Kelvin";
    s += "\nAge = " + this.getAge() + " Million years";
    s += "\nAtmospheric Size = " + this.getAtmosphericsize() + " km";
    s += "\nYear length = " + this.getOrbitduration() + "Years";
    s += "\nNumber of moons = " + this.getMoonsorbiting();
    s += "\nClassifacation = " + this.getClassifacation() + "\n\n";
         return s;
    }
    
 	// ********** mutators **********

    public void setClassifacation(Class classifacation) {
        this.classifacation = classifacation;
    }

       
       
 }  // end class