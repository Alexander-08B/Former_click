/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RitaFigurer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author alebe18
 */
public class FilhanteringFormer_Click {
    public void saveToFile(ArrayList<Figur> list) {
        try{
            
        FileOutputStream fileOut = new FileOutputStream("savedFigurLista");
        
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        
        out.writeObject(list);
        out.flush();
        out.close();
        fileOut.close();
}
        catch (IOException ex){
            System.out.println("IOException is caught");
            System.out.println(ex.getMessage());
        }
    }
    public ArrayList<Figur> readFromFile(){
    ArrayList<Figur> list=null;
    
    try{
       FileInputStream fileIn = new FileInputStream("savedFigurLista");
    
    ObjectInputStream oin = new ObjectInputStream(fileIn);
    
    list = (ArrayList<Figur>)oin.readObject();
    
    oin.close();
    fileIn.close();
    }
    catch(IOException ex){
        System.out.println("Något gick fel med inläsning av filen");
    }
    catch(ClassNotFoundException ex){
        System.out.print("ClassNotFoundException caught");
    }
    return list;  
    
    
    }
}
