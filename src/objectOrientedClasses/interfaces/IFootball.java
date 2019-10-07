/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.interfaces;

/**
 *
 * @author Abdelhalim
 */
public interface IFootball extends ISports, ISportCategory{
    
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
    public void endOfQuarter(int quarter);
    
}
