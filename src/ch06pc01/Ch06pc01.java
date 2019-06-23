package ch06pc01;


/**
 *
 * @author Frank
 * date 11/8/2017
 * purpose: to create an employee class and display 3 employees
 */
public class Ch06pc01 {

    public static void main(String[] args) {
        //variables
        
        
        //create employee objects
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        System.out.printf("%15s %8s %25s %20s\n", "Name", "ID Number", "Department", "Position");
        System.out.println("_______________________________________________________________________");
        System.out.printf("%15s %8d %25s %20s\n", emp1.getName(), emp1.getIDNumber(), emp1.getDepartment(), emp1.getPosition());
        System.out.printf("%15s %8d %25s %20s\n", emp2.getName(), emp2.getIDNumber(), emp2.getDepartment(), emp2.getPosition());
        System.out.printf("%15s %8d %25s %20s\n", emp3.getName(), emp3.getIDNumber(), emp3.getDepartment(), emp3.getPosition());
        
        
    }
    
}