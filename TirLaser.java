/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;


import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Le Tir de l'Arme ArmeLaser.
 * @author kali
 */
public class TirLaser extends Tir implements TempObject {
    

    
    public TirLaser(int posx,int posy,int dir){
           super(posx,posy,2,10,10,dir);
           dx = 10;
    }

    @Override
    public void paint(Graphics2D g2d) {
      g2d.setColor(Color.YELLOW);
      g2d.fillRect(posx, posy, w, h);
    }

  
    
} 