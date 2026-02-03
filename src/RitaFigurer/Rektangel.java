/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RitaFigurer;

import java.awt.Graphics;

/**
 *
 * @author alebe18
 */
public class Rektangel extends Figur {
    private int höjd;
    private int bredd;
            
    public Rektangel( int x, int y, int h, int b){
        //x = getPositionX();
        //y = getPositionY();
        super(x,y);
        höjd = h;
        bredd = b;
        
    }
    public void setHöjd(int h){
        höjd = h;
    }
    
    public void setBredd(int b){
        bredd = b;
    }
    @Override
    public double räknaArea(){
       return (höjd*bredd);
        
    }

    @Override
    public void rita(Graphics g) {
        g.setColor(färg);
        g.fillRect(super.positionX - bredd/2, super.positionY - höjd/2, höjd, bredd);//inte klar
    }
}

