/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedTopics;

/**
 *
 * @author Abdelhalim
 */
public class GenericMethod {

    // generic mathod printArray
    private static <E> void printArray(E[] inputArray) {

        // display array elements
        for (E element : inputArray) {
            System.out.print(element+ " ");
        }
        System.out.println();
    }
    
    public void executeGeneric(){
        
        Integer[] integerArray = {1,2,3,4,5};
        Double[] doubleArray = {1.5,2.5,3.5,4.5,5.0};
        Character[] charArray = {'H','E','L','L','o'};
        
        System.out.println("Integer Array values are : ");
        printArray(integerArray);
        
        System.out.println("Double Array values are : ");
        printArray(doubleArray);
        
        System.out.println("Character Array values are :");
        printArray(charArray);
    }
}

/**
 * Main Code
 
        new GenericMethod().executeGeneric();
 */