package ch06pc01;

/**
 *
 * @author Frank
 * date 11/8/2017
 * purpose: 
 */
public class Employee {
    //fields
    private String name;        //employee name
    private int idNumber;       //employee ID
    private String department;  //employee department
    private String position;    //employee position
    
    //constructors
    public Employee (String eName, int eIDNumber, String eDepartment, String ePosition)
    {
        name = eName;
        idNumber = eIDNumber;
        department = eDepartment;
        position = ePosition;
    }
    public Employee (String eName, int eIDNumber)
    {
        name = eName;
        idNumber = eIDNumber;
        department = "";
        position = "";
    }
    public Employee ()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
    
    //methods
    public String getName()
    {
        return name;
    }
    public void setName (String newName)
    {
        name = newName;
    }
    
    public int getIDNumber()
    {
        return idNumber;
    }
    public void setIDNumber(int newIDNumber)
    {
        idNumber = newIDNumber;
    }
    
    public String getDepartment()
    {
        return department;
    }
    public void setDepartment(String newDepartment)
    {
        department = newDepartment;
    }
    
    public String getPosition()
    {
        return position;
    }
    public void setPosition(String newPosition)
    {
        position = newPosition;
    }
}
