/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

/**
 *
 * @author Abdelhalim
 */
public class InstanceOf {
    
    private String name = "Hello";
    private boolean checkInstance = name instanceof String;
    
    public boolean getCheckInstance(){
        return this.checkInstance;
    }
}

/** Main Code
 * 
        InstanceOf objectRefernece = new InstanceOf();
        boolean checkClassInstance = objectRefernece instanceof InstanceOf;
        System.out.println("Class Instance Boolean = " + checkClassInstance);
        System.out.println("String Instance Boolean = " + objectRefernece.getCheckInstance());
* 
 */
