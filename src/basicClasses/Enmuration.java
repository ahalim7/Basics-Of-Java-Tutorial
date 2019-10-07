/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

import javax.swing.JOptionPane;

/**
 *
 * @author Abdelhalim
 */
public class Enmuration {

    enum FreshJuiceSize {

        SMALL, MEDUIM, LARGE
    };
    FreshJuiceSize size;
}

/** Main Code
 * 
  Enmuration fresh = new Enmuration();
  fresh.size = Enmuration.FreshJuiceSize.MEDUIM;
  JOptionPane.showMessageDialog(null, fresh.size);
  *
 */