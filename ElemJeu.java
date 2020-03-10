/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

import java.awt.Graphics2D;

/**
 * classe abstraite pour gérer tous les elements affichié du jeu.
 * @author kali
 */
public abstract class ElemJeu {
    /**
     * position en x
     */
    protected int posx;
    /**
     * position en y
     */
    protected int posy;
    /**
     * deplacement en x
     */
    protected int dx;
    /**
     * deplacement en y
     */
    protected int dy;
    /**
     * hauteur de l'element
     */
    protected int h;
    /**
     * largeur de l'element
     */
    protected int w; 
   
    protected ElemJeu(int posx, int posy, int h, int w){
        
        this.posx = posx;
        this.posy = posy;
        this.h = h;
        this.w = w;
        dx = 0;
        dy = 0;
    }
    
    /**
     * dessine la représentation graphique de chaque element du jeu.
     * @param g2d 
     */
    public abstract void paint(Graphics2D g2d);
    
    /**
     * fait bouger l'element.
     */
    public abstract void move();
    
    public int getPosx() {
        return posx;
    }


    public int getPosy() {
        return posy;
    }
    
     public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }
  
}
