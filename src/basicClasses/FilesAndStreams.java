/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdelhalim
 */
public class FilesAndStreams {

    public void readFromInput() {

        BufferedReader bufferReader = new BufferedReader(
                new InputStreamReader(System.in));

        String word = "";

        System.out.println("Enter your Line, \" q to exit");
        do {
            try {
                word = (String) bufferReader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(FilesAndStreams.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (!word.equals("q"));
        System.out.println(word);
    }

    public void readFromFile() {
        try {
            InputStream inputStream = new FileInputStream("C:\\Users\\Abdelhalim\\Documents\\NetBeansProjects\\JavaApplication1\\src\\files\\file.txt");
            int size = 0;
            try {
                size = inputStream.available();
                System.out.println("The File conatains");
                for (int counter = 0; counter < size; counter++) {
                    System.out.println((char) inputStream.read() + "   ");
                }
                inputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(FilesAndStreams.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesAndStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createOrWriteFile() {
        try {
            byte[] valuesToBeWritten = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            OutputStream outputStream = new FileOutputStream("C:\\Users\\Abdelhalim\\Documents\\NetBeansProjects\\JavaApplication1\\src\\files\\Program.txt");
            try {
                for (int counter = 0; counter < valuesToBeWritten.length; counter++) {
                    outputStream.write(valuesToBeWritten[counter]);
                }
                outputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(FilesAndStreams.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesAndStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createDiroctries(){
        
        String directoryPath = "C:\\Users\\Abdelhalim\\Documents\\NetBeansProjects\\JavaApplication1\\src\\files\\FolderByProgram";
        File file = new File(directoryPath);
        // create the directory
        file.mkdirs();
    }
    
    public void dealWithDirectory(){
        String directoryPath = "C:\\Users\\Abdelhalim\\Documents\\NetBeansProjects\\JavaApplication1\\src\\files";
        File file = new File(directoryPath);
        
        if(file.isDirectory()){
            System.out.println("Directory of "+directoryPath);
            String[] listOfFiles = file.list();
            for(int i=0;i<listOfFiles.length;i++){
                File insideFile = new File(directoryPath +"\\"+listOfFiles[i]);
                if(insideFile.isDirectory()){
                    System.out.println(listOfFiles[i] +"is a directory");
                }else{
                    System.out.println(listOfFiles[i]+ "is a File");
                }
            }
        }else{
            System.out.println(directoryPath+ "is not a directory");
        }
    }
}

/** Main Code 
 * 
        FilesAndStreams fileAndStream = new FilesAndStreams();
        //fileAndStream.readFromInput();
        //fileAndStream.createOrWriteFile();
        //fileAndStream.readFromFile();
        //fileAndStream.createDiroctries();
        fileAndStream.dealWithDirectory();
* 
 */
