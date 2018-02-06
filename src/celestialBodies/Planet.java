package celestialBodies;


import celestialBodies.CelestialBody;

/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
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

    public void setAtmosphericsize(int atmosphericsize) {
        this.atmosphericsize = atmosphericsize;
    }

    public void setOrbitduration(double orbitduration) {
        this.orbitduration = orbitduration;
    }

    public void setMoonsorbiting(int moonsorbiting) {
        this.moonsorbiting = moonsorbiting;
    }

   
    
 }  // end class