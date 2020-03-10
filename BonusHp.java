/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

import java.awt.Graphics2D;

/**
 * Bonus qui augmente les points de vie d'un vaisseau touché.
 * @author kali
 */
public class BonusHp extends Bonus  {
 
    public BonusHp(){
        super();
    }
    
     
    @Override
    public void effet(Vaisseau v) {
             v.addHp((int)(Math.random()*30));
    }

 
 
}
