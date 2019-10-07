/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.polymorphism;

/**
 *
 * @author Abdelhalim
 */
public class Deer extends Animal implements IVegetarian{
    
}

/** Main Code
 * 
        // All these declaration are legal
        Deer deer= new Deer();
        Animal animal = deer;
        IVegetarian vegetarian = deer;
        Object object = deer;
* 
* deer, animal, vegetarian and object are all reference variables
 */