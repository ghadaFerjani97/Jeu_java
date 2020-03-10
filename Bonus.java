/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Le bonus du jeu qui vont être récupérer par les vaisseau.
 * @author kali
 */
public abstract class Bonus extends ElemJeu implements TempObject{
    /**
     * crée une instance de Bonus positioné aléatoirement sur le terrain
     */
    protected Bonus() {
        super((int)(Math.random()*Terrain.WTERRAIN),(int)(Math.random()*Terrain.HTERRAIN),10,15);
        
    }
   
    @Override
    public void move() {
        
        
    }
 
    @Override
    public void paint(Graphics2D g2d) {
        g2d.setColor(Color.GREEN);
        g2d.fillRect(posx, posy, w, h);
    }
    
    
    
    @Override
    public boolean collision(Vaisseau v){
     int vx=v.getPosx();
        int vy=v.getPosy();
        int vh=v.getH();
        int vw=v.getW();
        boolean b1=(vx==posx+w)&&(vy+h>=posy)&&(vy-h<=posy);
        boolean b2=(posx+w>=vx)&&(posx+w<=vx+vw)&&(posy+h>=vy-(vh/2))&&(posy+h<=vy+(vh/2));
        boolean b3=(vx==posx)&&(vy+h>=posy)&&(vy-h<=posy);
        boolean b4=(posx>=vx-vw)&&(posx<=vx)&&(posy+h>=vy-(vh/2))&&(posy+h<=vy+(vh/2));
        
        return b1||b2||b3||b4;
    }
    
    
    
}
