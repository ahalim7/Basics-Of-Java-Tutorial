/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

/**
 *
 * @author Abdelhalim
 */
public class StaticAndFinal {
    
    // private static variable the naming convention is normal
    private static double salary;
    
    // public static final variable is all in the UPPERCASE -> DEPARTMENT is constant
    public static final String DEPARTMENT = "Development";
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return this.salary;
    }
}

/** Main Code
 *      StaticAndFinal staticAndFinal = new StaticAndFinal();
        staticAndFinal.setSalary(10000);
        System.out.println(""+StaticAndFinal.DEPARTMENT+" average salary = "+staticAndFinal.getSalary());
* 
 */
