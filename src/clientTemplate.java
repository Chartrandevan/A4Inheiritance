// **********************************************************************
// Programmer:	Rob Sveinson
// Class:		CS20S
//
// Assignment:	aX qy
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************


import celestialBodies.RockyPlanet;
import celestialBodies.GasGiant;
import static celestialBodies.GasGiant.Class.AmmoniaClouds;

import celestialBodies.Star;
import static celestialBodies.Star.Type.MainSequence;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class clientTemplate/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
	// ***** create objects *****
		
	
        GasGiant neptune = new GasGiant("Neptune", 0.0000515, 24622, 55, 4500, 3693, 164.8, 13, AmmoniaClouds);  
        Star sun = new Star("The Sun", 1.0, 695700, 5778, 4600, MainSequence, 2000000, 8);
        
        ArrayList<RockyPlanet> rps = new ArrayList<RockyPlanet>();
        RockyPlanet earth = new RockyPlanet("Earth", 0.0000033, 6371, 288, 4540, 480, 365.25, 1, true, true);
        rps.add(earth);
        RockyPlanet mars = new RockyPlanet("Mars", 0.000000322, 3390, 218, 4600, 200, 687.0, 2, false, false);
        rps.add(mars);
        RockyPlanet venus = new RockyPlanet("Venus", 0.00000245, 6052, 735, 4600, 250, 224.7, 0, true, false);
        rps.add(venus);
        
  
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Evan Chartrand");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  A4 Celestial Bodies");
		System.out.println("**********************************");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReadr.class into the
		// same folder.
	
	// ***** processing *****
	
		
	// ***** output *****
	
	System.out.println(rps.get(0).toString() + rps.get(1).toString() + rps.get(2).toString());
        System.out.println(neptune.toString());
        System.out.println(sun.toString());
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class