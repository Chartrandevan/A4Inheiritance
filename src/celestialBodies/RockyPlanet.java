package celestialBodies;


import celestialBodies.Planet;

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
 
 
 public class RockyPlanet extends Planet
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
     boolean plateTectonics;
     boolean life;
     
 	// ********** constructors ***********
     
     public RockyPlanet(){
          name = "unidentified";  
     }//end rocky planets
     
 	public RockyPlanet(String n, double m, int r, int s, int a, int at, double o, int moon, boolean pt, boolean l) {
        super(n, m, r, s, a, at, o, moon);
        plateTectonics = pt;
        life = l;
    }//end initialized constructor
 	
 	// ********** accessors **********
 	
      public boolean getPlateTectonics() {
        return plateTectonics;
    }

    public boolean getLife() {
        return life;
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
    s += "\nHas plate tectonices = " + this.getPlateTectonics();
    s += "\nHas known life = " + this.getLife()+ "\n\n";
         return s;
    }
 
            
// ********** mutators **********

    public void setPlateTectonics(boolean plateTectonics) {
        this.plateTectonics = plateTectonics;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

   

 
 }  // end class