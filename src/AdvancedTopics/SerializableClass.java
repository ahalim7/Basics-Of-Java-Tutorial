/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedTopics;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.*;

/**
 *
 * @author Abdelhalim
 */
public class SerializableClass implements java.io.Serializable{
    
    public String name;
    public String address;
    //public int transient SSN;
    public int SSN;
    public int number;
    
    public void mailCheck(){
        System.out.println("Mailing a check to "+name+"  "+address);
    }
    
    public void serializeObject(){
        
        this.name = "Ahmed";
        this.address = "Cairo - Egypt";
        this.SSN = 11111;
        this.number = 2;
        try{
            FileOutputStream fileOut = new FileOutputStream("serializable.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(this);
            objectOut.close();
            fileOut.close();
        }catch(IOException ioExp){
            ioExp.printStackTrace();
        }
    }
    
    public void deserializeObject(){
        
        SerializableClass serializble = null;
        try{
            FileInputStream fileIn = new FileInputStream("serializable.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            serializble = (SerializableClass)objectIn.readObject();
            objectIn.close();
            fileIn.close();
        }catch(IOException ioExp){
            ioExp.printStackTrace();
            return;
        }catch(ClassNotFoundException classNotFoundExp){
            System.out.println("Serializble Calss not found");
            classNotFoundExp.printStackTrace();
            return;
        }
        
        System.out.println("Deserializing Class ...");
        System.out.println("Name : "+serializble.name);
        System.out.println("Address : "+serializble.address);
        System.out.println("SSN : "+serializble.SSN);
        System.out.println("Number : "+serializble.number);
    }
}

/**
 * Main Code
 
       SerializableClass serialize = new SerializableClass();
       serialize.serializeObject();
       serialize.deserializeObject();
        
 */