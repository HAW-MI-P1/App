/******************************************************************************
 * Modellierung von Informationssystemen - Search 4 Facebook 
 ******************************************************************************
 * MIP-Group:       1
 * Component:       Controller
 *
 * Authors:         Hagen, Ren�, Matthies
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

package controller;

/******************************************************************************
 *                                 Imports                                    *
 *****************************************************************************/

import common.ComponentID;
import common.JsonObject;
import common.Logger;
import parser.IParser;
import dbController.IDBController;
import facebookWrapper.IFacebookWrapper;
import common.Person;
import java.util.Collection;

/******************************************************************************
 *                              Class Definition                              *
 *****************************************************************************/

public class Controller implements ISearch4Facebook
{
	
/******************************************************************************
 *                                  Fields                                    *
 *****************************************************************************/

    public IParser          parser;
    public IFacebookWrapper facebookWrapper;
    public IDBController    dbController;
    
/******************************************************************************
 *                         Construction & Initialization                      *
 *****************************************************************************/

	public Controller(IParser parser, IFacebookWrapper facebookWrapper, IDBController dbController)
	{
		this.parser          = parser;
		this.facebookWrapper = facebookWrapper;
		this.dbController    = dbController;
	}

/******************************************************************************
 *                              Public Methods                                *
 *****************************************************************************/
	
    public Collection<Person> search(int searchID, String naturalLanguage)
    {
        Logger.log("<search()>", ComponentID.Controller);
        
        JsonObject         requests = parser         .parse  (naturalLanguage);
        Collection<Person> result   = facebookWrapper.collect(requests);
                                      dbController   .save   (searchID, naturalLanguage, requests, result);
        
		return result;
    }
}