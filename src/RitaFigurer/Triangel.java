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
public class Triangel extends Figur {
    private int höjd;
    private int bass;
            
    public Triangel( int x, int y, int h, int b){
        //x = getPositionX();
        //y = getPositionY();
        super(x,y);
        höjd = h;
        bass = b;
    }
    public void setHöjd(int h){
        höjd = h;
    }
    
    public void setBass(int b){
        bass = b;
    }
    @Override
    public double räknaArea(){
       return (höjd*bass)/2;
    }

    @Override
    public void rita(Graphics g) {

        int [] yPoints = {super.positionY, super.positionY + höjd, super.positionY};
        int [] xPoints = {super.positionX, super.positionX + bass / 2, super.positionX + bass};
        g.setColor(färg);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
