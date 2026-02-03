/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RitaFigurer;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author alebe18
 */
public abstract class Figur {
    private String form;
    protected int positionX;
    protected int positionY;
    protected Color färg;
    
    public Figur( int x, int y){
        
        positionX = x;
        positionY = y;
        int R = (int) (Math.random() * 256);
        int G = (int) (Math.random() * 256);
        int B = (int) (Math.random() * 256); 
        färg = new Color(R, G, B);
    }
    
    public void setForm(String f){
        form = f;
    }
    
    public int getPositionX(){
        return positionX;
    }
    
    public int getPositionY(){
        return positionY;
    }
    
    public String getForm(){
        return "figur";
        
    
    }
    public abstract double räknaArea();
    
    public abstract void rita(Graphics g);//byt ut double
 
}
