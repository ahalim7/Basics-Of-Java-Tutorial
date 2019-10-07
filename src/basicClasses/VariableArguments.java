/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdelhalim
 */
public class VariableArguments {
 
    public  void printNumbers(int... numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.println(i);
        }
    }
    
    @Override
    protected void finalize(){
        JOptionPane.showMessageDialog(null, "Object Terminated Cleanly");
    }
}

/**
 * 
        VariableArguments v = new VariableArguments();
        v.printNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        
* 
 */
