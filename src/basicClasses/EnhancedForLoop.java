/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

/**
 *
 * @author Abdelhalim
 */
public class EnhancedForLoop {
        
    private String[] names = {"Ahmed","Ali","Waleed","Ayman"};
    public int[] ids = {1,2,3,4,5,6,7,8,9,10};
    
    public String[] getNames(){
        return this.names;
    }
}

/** Main Code
 * 
        EnhancedForLoop enhanceForLoop = new EnhancedForLoop();

        System.out.println("For Loop Enhancement Using Array variable");
        for (int x : enhanceForLoop.ids) {
            System.out.println("id = " + x);
        }

        System.out.println("FOr Loop Enhancement Using return from Funcation Call");
        for (String s : enhanceForLoop.getNames()) {
            System.out.println("name = " + s);
        }
* 
 */
