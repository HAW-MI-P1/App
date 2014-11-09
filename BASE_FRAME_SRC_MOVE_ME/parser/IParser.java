/******************************************************************************
 * Modellierung von Informationssystemen - Search 4 Facebook 
 ******************************************************************************
 * MIP-Group:       1
 * Component:       Parser
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

package parser;

/******************************************************************************
 *                                 Imports                                    *
 *****************************************************************************/

import common.JsonObject;

/******************************************************************************
 *                              Class Definition                              *
 *****************************************************************************/

public interface IParser
{
	
/******************************************************************************
 *                              Public Methods                                *
 *****************************************************************************/
	
    public JsonObject parse(String naturalLanguage);
}