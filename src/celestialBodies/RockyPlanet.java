package celestialBodies;


import celestialBodies.Planet;

/* **********************************************************
 * Programmer:	Evan Chartrand
 * Class:		CS30S
 * 
 * Assignment:	A4:Inheiritance
 *
 * Description:	Derived class of planet with a unique property of rockyPlanets
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class RockyPlanet extends Planet
 {  // begin class
 	 	
     public enum rpType{
     silicate, carbon, iron, coreless  
     }
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********

     private rpType type;
     
 	// ********** constructors ***********
     
     public RockyPlanet(){
          name = "unidentified";  
     }//end rocky planets
     
 	public RockyPlanet(String n, double m, int r, int s, int a, int at, double o, int moon, rpType c) {
        super(n, m, r, s, a, at, o, moon);
        type = c;
    }//end initialized constructor
 	// ********** accessors **********
 
       public rpType getRPType(){
       return this.type;    
       }
        
        
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
    s += "\nType of core = " + this.getRPType();
         return s;
    }
 
            
// ********** mutators **********

   

 
 }  // end class