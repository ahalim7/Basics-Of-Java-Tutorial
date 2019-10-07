/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdelhalim
 */
public class NewClass {

    public void functionOne() {
        ArrayList<String> array = new ArrayList<String>();

        array.add("Hello");
        array.add("World");
        functionTwo(array);
    }

    private void functionTwo(ArrayList temp) {
        JOptionPane.showMessageDialog(null, temp);
    }

    private void convertArrayList() {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("item1");
        arraylist.add("item2");
        String[] stringArray = new String[arraylist.size()];
        stringArray = arraylist.toArray(stringArray);
        JOptionPane.showMessageDialog(null, stringArray);
    }
}
