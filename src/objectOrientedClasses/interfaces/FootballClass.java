/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientedClasses.interfaces;

/**
 *
 * @author Abdelhalim
 */
public class FootballClass implements IFootball{

    @Override
    public void homeTeamScored(int points) {
        System.out.println("Home Team Scored = "+points);
    }

    @Override
    public void visitingTeamScored(int points) {
        System.out.println("Visiting Team Scored = "+points);
    }

    @Override
    public void endOfQuarter(int quarter) {
        System.out.println("End of Quarter = "+quarter);
    }

    @Override
    public void setHomeTeam(String name) {
        System.out.println("Home Team is "+name);
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("Visiting Team is "+name);
    }

    @Override
    public void setUsedPartOfBody() {
        System.out.println("Played Using Legs and hands");
    }
    
}

/** Main Code
 * 
       FootballClass foot = new FootballClass();
       foot.setHomeTeam("JAVA");
       foot.setVisitingTeam("JAVA Again");
       foot.homeTeamScored(5);
       foot.visitingTeamScored(3);
       foot.endOfQuarter(2); 
       foot.setUsedPartOfBody();
* 
 */