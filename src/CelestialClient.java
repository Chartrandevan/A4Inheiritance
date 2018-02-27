/* **********************************************************
 * Programmer:	Evan Chartrand
 * Class:		CS30S
 * 
 * Assignment:	A4:Inheiritance
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
import celestialBodies.CelestialBody;
import celestialBodies.RockyPlanet;
import celestialBodies.GasGiant;
import static celestialBodies.GasGiant.Class.AmmoniaClouds;
import static celestialBodies.GasGiant.Class.Cloudless;
import static celestialBodies.RockyPlanet.rpType.iron;
import static celestialBodies.RockyPlanet.rpType.silicate;
import celestialBodies.Planet;
import celestialBodies.Star;
import static celestialBodies.Star.Type.MainSequence;
import static celestialBodies.Star.Type.RedGiant;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CelestialClient/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
            String strin;
            int ts;//the amount of time simulated each run through in millions of years
            int te = 0;//total time elapsed
            boolean marsmooncollision = false;
            boolean mercurycrash = false;
            boolean sunchange = false;
            boolean lasteclipse = false;
            boolean starclose = false;
	// ***** create objects *****
		  
      
        
        ArrayList<CelestialBody> list = new ArrayList<CelestialBody>();
        
        list.add(new Star("The Sun", 1.0, 695700, 5778, 4600, MainSequence, 2000000, 8)); 
        list.add( new RockyPlanet("Mercury", 0.000000165, 2440, 703, 4600, 0, 88.0, 0, iron));
        list.add( new RockyPlanet("Venus", 0.00000245, 6052, 735, 4600, 250, 224.7, 0, silicate));
        list.add(new RockyPlanet("Earth", 0.0000033, 6371, 288, 4540, 480, 365.25, 1, silicate));
        list.add(new RockyPlanet("Mars", 0.000000322, 3390, 218, 4600, 200, 687.0, 2, silicate));
        list.add(new GasGiant("Jupiter", 0.0009543, 69911, 418, 4600, 5000, 4300, 67, Cloudless));
        list.add(new GasGiant("Neptune", 0.0000515, 24622, 55, 4500, 3693, 164.8, 13, AmmoniaClouds));
        list.add(new GasGiant("Saturn", 0.0002857, 58232, 130, 4600, 3000, 11000, 62, AmmoniaClouds));
        list.add(new GasGiant("Uranus", 0.0004364, 25362, 49, 4480, 4000, 31000, 27, AmmoniaClouds));
        list.add(new GasGiant("Neptune", 0.0000515, 24622, 55, 4500, 3693, 164.8, 13, AmmoniaClouds));
        

        
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Evan Chartrand");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  A4 Celestial Bodies");
		System.out.println("**********************************");
		
	// ***** get input *****
	
		
	
	// ***** processing *****
	
        
        
	// ***** output *****
	System.out.println("To String ouput using all the getter methods of each class\n");
	for(int count = 0; count < 9; count ++){
        System.out.println(list.get(count).toString());
        }//end for
   
        // **** Time simulation***** 
        
        ts = Integer.parseInt(JOptionPane.showInputDialog("Enter how many million year you would like to have simulated, enter 0 to terminate"));
        while(ts != 0){
        System.out.println("\nSignificant events occuring in the " + ts + " million years to be simulated:");
        te = te + ts;
        for(int count = 0; count < list.size(); count ++){
        list.get(count).setAge(list.get(count).getAge() + ts);
        }   //end for  
                
       
        
        //***** Schedualed events ***** 
        if (te >= 1 && starclose == false){
        System.out.println("Dwarf star comes really close to our solar system - 1 million years/n");
        starclose = true;
        }
        
        if (te >= 50 && marsmooncollision == false){
        System.out.println("Mars's moon Phobos collides with the planet - 50 Million Years");
        ((Planet)list.get(4)).setMoonsorbiting(1);
        System.out.println("    Moons orbiting Mars = " + ((Planet)list.get(4)).getMoonsorbiting() + "\n");
        marsmooncollision = true;
        }//end if mars collision
                
        
        if (te >= 600 && lasteclipse == false){
        System.out.println("Last solar eclipse on earth occurs - 600 Million Years\n");  
        lasteclipse = true;
        }//end if last eclipse

        if (te >= 3300 && mercurycrash == false){
        System.out.println("Jupiter's influence causes mercury to crash into the sun - 3.3 Billion years\n");
        list.remove(1);
        mercurycrash = true;
        }//end if
    
        
        if (te >= 5000 && sunchange == false ){
        System.out.println("The sun becomes a Red Giant and engulfs the inner solar system - 5 Billion years");
        ((Star)list.get(0)).setType(RedGiant);
        System.out.println("    Sun type = " + ((Star)list.get(0)).getType() + "\n");
        list.remove(1);
        list.remove(1);
        sunchange = true;
        }//end if
        
        
        ts = Integer.parseInt(JOptionPane.showInputDialog("Enter how many million year you would like to have simulated, enter 0 to terminate\n"));
        }//end while
        
        // ***** closing message *****
	
		System.out.println("\nend of processing");
	
	}  // end main	
}  // end class