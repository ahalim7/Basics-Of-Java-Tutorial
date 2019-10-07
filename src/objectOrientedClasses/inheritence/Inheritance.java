/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.inheritence;

/**
 *
 * @author Abdelhalim
 */
public class Inheritance extends InheritanceAndOverRiding{
    
    @Override
    public void printMove(){
        super.printMove();
        System.out.println("You Now Inside Override Method");
    }
}
