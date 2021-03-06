/******************************************************************************
 * Modellierung von Informationssystemen - Search 4 Facebook 
 ******************************************************************************
 * MIP-Group:       1
 * Component:       FacebookWrapper
 *
 * Authors:         Raimund, Lotte, Vitalij
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

package facebookWrapper;

/******************************************************************************
 *                                 Imports                                    *
 *****************************************************************************/

import common.Logger;

import java.util.Collection;
import java.util.Collections;

import common.ComponentID;
import common.Person;
import common.JsonObject;

/******************************************************************************
 *                              Class Definition                              *
 *****************************************************************************/

public class FacebookWrapper implements IFacebookWrapper
{
    
/******************************************************************************
 *                         Construction & Initialization                      *
 *****************************************************************************/
	
	public FacebookWrapper()
	{
		
	}
	
/******************************************************************************
 *                              Public Methods                                *
 *****************************************************************************/
	
    public Collection<Person> collect(JsonObject requests)
    {
        Logger.log("<collect()>", ComponentID.FacebookWrapper);
        
		return Collections.emptyList();
    }
}