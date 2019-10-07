/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

/**
 *
 * @author Abdelhalim
 */
public class SwitchCases {
    
    char grad;
    
    public void setGrade(char passedGrade){
        this.grad = passedGrade;
    }
    
    public void executeSwitch(){
        
        switch(this.grad){
            case 'A':
                System.out.println("Your Grade is A");
                break;
            case 'B':
                System.out.println("Your Grade is B");
                break;
            case 'C':
                System.out.println("Your Grade is C");
                break;
            default:
                System.out.println("No Grade Found");
                break;
        }
    }
}
/** Main Code
 * 
        SwitchCases caseSwitch = new SwitchCases();
        caseSwitch.setGrade('A');
        caseSwitch.executeSwitch();
* 
 */