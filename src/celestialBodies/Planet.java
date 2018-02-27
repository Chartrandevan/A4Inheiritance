package celestialBodies;


import celestialBodies.CelestialBody;

/* **********************************************************
 * Programmer:	Evan Chartrand
 * Class:		CS30S
 * 
 * Assignment:	A4:Inheiritance
 *
 * Description:	Derived class from CelestialBody.java and parent class to 
 * GasGiant.java RockyPlanet.java with some properties of planets
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Planet extends CelestialBody
 {  // begin class
 	
     public enum Type{
	Protostar, Tauri , MainSequence , RedGiant, WhiteDwarf, RedDwarf , Neutron ,Supergiant
	 } // end title enum

 	// *********** class constants **********

        
 	// ********** instance variable **********

        int atmosphericsize = 0;//in km
        double orbitduration = 0;//in days
        int moonsorbiting = 0;
       
 	// ********** constructors ***********
        
        public Planet(){
           name = "unidentified"; 
        }//end planet
        
       public Planet(String n, double m, int r, int s, int a, int at, double o, int moon){
		 
		 super(n, m, r, s, a);
        
        atmosphericsize = at;
        orbitduration = o;
        moonsorbiting = moon;
                 
        }//end inicialized constructor
        
 	// ********** accessors **********
 	
        public int getAtmosphericsize() {
        return atmosphericsize;
    }

    public double getOrbitduration() {
        return orbitduration;
    }

    public int getMoonsorbiting() {
        return moonsorbiting;
    }
    

       // *********** mutators ************

    public void setAtmosphericSize(int atmosphericsize) {
        this.atmosphericsize = atmosphericsize;
    }

    public void setOrbitDuration(double orbitduration) {
        this.orbitduration = orbitduration;
    }

    public void setMoonsorbiting(int moonsorbiting) {
        this.moonsorbiting = moonsorbiting;
    }

   
    
 }  // end class