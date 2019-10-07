/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.interfaces;

/**
 *
 * @author Abdelhalim
 */
public class Mammal implements IAnimal{
    
    @Override
    public void eat(){
        System.out.println("Mammal eats");
    }
    
    @Override
    public void travel(){
        System.out.println("Mammal travels");
    }

    @Override
    public int numberOfLegs() {
        return 0;
    }
}

/** Main Code
 *   
        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.travel();
        System.out.println("Number of Legs = "+mammal.numberOfLegs());
* 
 */