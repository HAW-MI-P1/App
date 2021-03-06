/******************************************************************************
 * Modellierung von Informationssystemen - Search 4 Facebook 
 ******************************************************************************
 * MIP-Group:       1
 * Component:       Main
 *
 * Authors:         Fenja, Daniel
 *
 * Updated:         2014.11.07
 *
 * Version:         0.01
 ******************************************************************************
 * Description:     ----
 *****************************************************************************/

/******************************************************************************
 *                                 Package                                    *
 *****************************************************************************/

package main;

/******************************************************************************
 *                                 Imports                                    *
 *****************************************************************************/

import gui.*;
import controller.*;
import parser.*;
import facebookWrapper.*;
import dbController.*;

/******************************************************************************
 *                              Class Definition                              *
 *****************************************************************************/

public class Main
{
    
/******************************************************************************
 *                         Construction & Initialization                      *
 *****************************************************************************/
	
	public static void main(String[] args)
	{
		System.out.println("Search 4 Facebook, Version 0.01");
		
		GUI gui = buildTest1();
		
		test1(gui);
		//gui.run/show/fireUp();
	}
	
	public static GUI buildProduction()
	{
		return null;
	}
	
	public static GUI buildTest1()
	{
		IParser          parser          = new Parser         (); 
		IFacebookWrapper facebookWrapper = new FacebookWrapper();
		IDBController    dbController    = new DBController   ();
		
		ISearch4Facebook search4Facebook = new Controller     (parser, facebookWrapper, dbController);
		
		GUI              gui             = new GUI            (search4Facebook);
		
		return gui;
	}
	
/******************************************************************************
 *                               Test Methods                                 *
 *****************************************************************************/
	
	public static void test1(GUI gui)
	{
		gui.testSomething();
	}
}
