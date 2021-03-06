/******************************************************************************
 * Modellierung von Informationssystemen - Search 4 Facebook 
 ******************************************************************************
 * MIP-Group:       1
 * Component:       Common
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

package common;

/******************************************************************************
 *                              Class Definition                              *
 *****************************************************************************/

public class Person
{
    
/******************************************************************************
 *                                  Fields                                    *
 *****************************************************************************/
    
    private String facebookID;
    private String firstname;
    private String lastname;
    private String city;
    
/******************************************************************************
 *                              Getter / Setter                               *
 *****************************************************************************/

    public String getFacebookID()                  { return facebookID;              }
    public void   setFacebookID(String facebookID) {   this.facebookID = facebookID; }
    
    public String getFirstname ()                  { return firstname;               }
    public void   setFirstname (String firstname)  {   this.firstname   = firstname; }
    
    public String getLastname  ()                  { return lastname;                }
    public void   setLastname  (String lastname)   {   this.lastname    = lastname;  }
    
    public String getCity      ()                  { return city;                    }
    public void   setCity      (String city)       {   this.city        = city;      }
    
/******************************************************************************
 *                         Construction & Initialization                      *
 *****************************************************************************/
    
    public Person()
    {
        
    }
    
    public Person(String facebookID, String firstname, String lastname, String city)
    {
        this.facebookID = facebookID;
        this.firstname  = firstname;
        this.lastname   = lastname;
        this.city       = city;
    }
    
/******************************************************************************
 *                              Public Methods                                *
 *****************************************************************************/
    
    @Override
    public String toString()
    {
        return "Person [facebookID=" + facebookID + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + "]";
    }
}
