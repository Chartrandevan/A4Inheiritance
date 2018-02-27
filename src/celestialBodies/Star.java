package celestialBodies;


import celestialBodies.CelestialBody;
import java.util.ArrayList;

/* **********************************************************
 * Programmer:	Evan Chartrand
 * Class:		CS30S
 * 
 * Assignment:	A4:Inheiritance
 *
 * Description:	Derived class from CelestialBody.java which adds some other 
 * properties
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Star extends CelestialBody
 {  // begin class
 	
     public enum Type{
	Protostar, Tauri , MainSequence , RedGiant, WhiteDwarf, RedDwarf , Neutron ,Supergiant
	 } // end title enum

 	// *********** class constants **********

        
 	// ********** instance variable **********

       private Type type;
       private int coronatemp = 0;
       private int planetsorbiting = 0;
       
 	// ********** constructors ***********
        
       public Star(){
       name = "unidentified"; 
        }
       
       public Star(String n, double m, int r, int s, int a, Type t, int c , int p){
		 
		 super(n, m, r, s, a);
        
           type = t;
           coronatemp = c;
           planetsorbiting = p;
        }//end inicialized constructor
        
 	// ********** accessors **********
 	
         public Type getType() {
        return type;
    }

    public int getCoronatemp() {
        return coronatemp;
    }

    public int getPlanetsorbiting() {
        return planetsorbiting;
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
    s += "\nStar type = " + this.getType();
    s += "\nCorona temp = " + this.getCoronatemp() + " Kelvin";
    s += "\nNumber of planets orbiting = " + this.getPlanetsorbiting();
         return s;
    }
    
    
       // *********** mutators ************

    public void setType(Type type) {
        this.type = type;
    }

    public void setCoronatemp(int coronatemp) {
        this.coronatemp = coronatemp;
    }

    public void setPlanetsOrbiting(int planetsorbiting) {
        this.planetsorbiting = planetsorbiting;
    }
    
 }  // end class