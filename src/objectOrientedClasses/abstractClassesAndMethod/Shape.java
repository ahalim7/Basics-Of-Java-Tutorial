/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.abstractClassesAndMethod;

/**
 *
 * @author Abdelhalim
 */
public abstract class Shape {
    
    private double area;
    private double cirumference;
    
    public Shape(){
        
    }
    
    public void setArea(double value){
        this.area = value;
    }
    
    public double getArea(){
        return this.area;
    }
    
    public void setCirumference(double value){
        this.cirumference = value;
    }
    
    public double getCircumference(){
        return this.cirumference;
    }
    
    public abstract double computeArea();
    public abstract double computeCircumference();
}
