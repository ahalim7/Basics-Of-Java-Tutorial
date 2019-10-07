/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

/**
 *
 * @author Abdelhalim
 */
public class MethodOverloading {
    
    public static int max(int num1,int num2){
        return 2;
    }
    
    public static double max(double num1,double num2){
        return 2.5;
    }
}

/** Main Code
 * 
        int integer = MethodOverloading.max(2, 2);
        System.out.println("Integer Method Invoked = "+integer);
        
        double value = MethodOverloading.max(2.5, 2.5);
        System.out.println("DOuble Method Invoked = "+value);
* 
 */
