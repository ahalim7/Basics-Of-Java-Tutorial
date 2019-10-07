/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.virtualMethods;

/**
 *
 * @author Abdelhalim
 */
public class Employee {
    
    private String name;
    private String address;
    private int number;
    
    public Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    public void setName(String value){
        this.name = value;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAddress(String value){
        this.address = value;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setNumber(int value){
        this.number = value;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void mailCheck(){
        System.out.println("Mailing a check to "+ this.name +"   "+ this.address);
    }
    
    public String toString(){
        return this.name + "   " + this.address +"   "+this.number;
    }
    
}
