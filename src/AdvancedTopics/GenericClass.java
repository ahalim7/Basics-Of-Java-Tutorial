/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedTopics;

/**
 *
 * @author Abdelhalim
 */
public class GenericClass<T> {
    
    private T passedParameterGenericType;
    
    public void setT(T value){
        this.passedParameterGenericType = value;
    }
    
    public T getT(){
        return this.passedParameterGenericType;
    }
}

/**
 * Main Code

        GenericClass<Integer> genericClassInteger = new GenericClass<Integer>();
        GenericClass<String> genericClassString = new GenericClass<String>();
        
        genericClassInteger.setT(new Integer(10));
        genericClassString.setT(new String("Hello Generic"));
        
        System.out.println("Integer Generic Class Value is "+genericClassInteger.getT());
        System.out.println("String Generic Class Value is "+genericClassString.getT());
 */