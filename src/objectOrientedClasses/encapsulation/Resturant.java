/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.encapsulation;

/**
 *
 * @author Abdelhalim
 */
public class Resturant {
    
    private String name;
    private String address;
    
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
}

/** Main Code
 * 
        Resturant rest = new Resturant();
        rest.setName("HOGO-MOGO");
        rest.setAddress("# Hello third Block");
        
        System.out.println("Resturant Name is "+ rest.getName()+
                "and the Address is "+rest.getAddress());
* 
 */