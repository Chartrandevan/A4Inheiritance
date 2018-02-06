package celestialBodies;

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
 
 
 public class CelestialBody
 {  // begin class
 	
 	// *********** class constants **********

        
 	// ********** instance variable **********
 	
        private int radius = 0; // measured in kilometers
        private double mass = 0; //measured int solar masses
        private int surfacetemp = 0;//masured in kelvin
        String name = "";
        private int age = 0;//in millions of years
        
 	// ********** constructors ***********
 	
        public CelestialBody(){
        name = "Unidentified";
        }// end default constructor
         
        public CelestialBody(String n, double m, int r, int s, int a){
        radius = r;
        mass = m;
        surfacetemp = s;
        name = n;
        age = a;
                 
        }//end inicialized constructor
        
 	// ********** accessors **********
 	
            public int getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    public int getSurfacetemp() {
        return surfacetemp;
    }

    public String getName() {
        return name;
    }
    
    public int getAge(){
    return age;  
    }
    
    public int getDiameter(){
     return radius*2;   
    }
    
    public long getVolume(){//in squarekm
    return   (long) ((radius*radius*radius) * 3.1415926 * 4 / 3);           
    }
    
    public double getDensity(){
    return this.getMass()/this.getVolume();
    }
      
 	// ********** mutators **********

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setSurfacetemp(int surfacetemp) {
        this.surfacetemp = surfacetemp;
    }

    public void setName(String name) {
        this.name = name;
    }
    
 }  // end class