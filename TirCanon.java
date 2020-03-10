/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Le Tir pour l'Arme ArmeCanon
 * @author kali
 */

public class TirCanon extends Tir implements TempObject {
    
    public TirCanon(int posx,int posy,int dir){
           super(posx,posy,9,9,20,dir);
           dx = 5;
    }

    @Override
    public void paint(Graphics2D g2d) {
      g2d.setColor(Color.BLUE);
      g2d.fillOval(posx, posy, w, h);
    }

  
    
} 