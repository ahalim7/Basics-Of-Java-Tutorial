/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.virtualMethods;

/**
 *
 * @author Abdelhalim
 */
public class Salary extends Employee {

    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public void setSalary(double value) {
        this.salary = value;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class");
        System.out.println("Mailing check to " + getName() + " With Salary" + this.salary);
    }
    
    public double computePay(){
        System.out.println("Computing salaty to "+getName());
        return this.salary/52;
    }
}

/** Main Code
 * 
        Salary salary = new Salary("Mohamed", "Cairo", 20, 2000);
        Employee employee = new Salary("Ahmed", "Alex", 30, 3000);
        
        System.out.println("Call mailCheck using the salary reference -- ");
        salary.mailCheck();
        
        System.out.println("Call mailCheck using the employee reference -- ");
        employee.mailCheck();
* 
 */