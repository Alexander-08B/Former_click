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
public class Cirkel extends Figur{
    private int radie;
    
    public Cirkel( int x, int y, int r){
        super(x,y);
       // x = getPositionX();
      //  y = getPositionY();
        this.radie = r;
    }
    public void setRadie(int r){
        radie = r;
    }
    @Override
    public double räknaArea(){
       return (Math.PI)*(radie*radie);
        
    }

    @Override
    public void rita(Graphics g) {
         //System.out.println("cirkel: "+positionX+" "+radie);
        g.setColor(färg);
        g.fillOval(super.positionX, super.positionY, radie, radie);
    }
}
