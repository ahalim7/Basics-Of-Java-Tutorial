/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.abstractClassesAndMethod;

/**
 *
 * @author Abdelhalim
 */
public class Circle extends Shape{

    private final double PI = 3.14;
    private double raduis;
    
    public Circle(double raduis){
        this.raduis = raduis;
    }
    
    public void setRaduis(double value){
        this.raduis = value;
    }
    
    public double getRaduis(){
        return this.raduis;
    }
    
    @Override
    public double computeArea() {
        return raduis*raduis*PI;
    }

    @Override
    public double computeCircumference() {
        return raduis*2*PI;
    }
    
}

/** Main Code
 * 
        Circle circle = new Circle(20);
        System.out.println("The area = "+circle.computeArea());
        System.out.println("The circumference = "+circle.computeCircumference());
* 
 */