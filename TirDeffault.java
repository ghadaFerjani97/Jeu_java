/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Le Tir pour l'Arme par deffault ajouté à la création d'un vaisseau.
 * @author kali
 */
public class TirDeffault extends Tir implements TempObject {
    

    
    public TirDeffault(int posx,int posy,int dir){
           super(posx,posy,2,4,5,dir);
           dx = 10;
    }

    @Override
    public void paint(Graphics2D g2d) {
      g2d.setColor(Color.RED);
      g2d.fillRect(posx, posy, w, h);
    }

  
    
}
