/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

/**
 *
 * @author Abdelhalim
 */
public class ClassesAndObjectConcept {

    private int age;

    public ClassesAndObjectConcept(String name) {
        // this constructor has one parameter called name of type string
        System.out.println("Passed Name :" + name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.println("Passed Age :" + this.age);
        return this.age;
    }
}

/** Main Code
 * 
    ClassesAndObjectConcept objectClass = new ClassesAndObjectConcept("Tommy");
    objectClass.setAge(10);
    objectClass.getAge();
 * 
 */
