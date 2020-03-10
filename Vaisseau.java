/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

import java.awt.event.KeyEvent;
/**
 * Classe abstraite qui gére un vaisseau non spécifié (ni gauche , ni droite).
 * @author kali
 */


public abstract class Vaisseau extends ElemJeu{
    /**
     * la hauteur initiale du vaisseau
     */
    public static final int INIT_H = 60;
    /**
     * la largeur initiale du vaisseau
     */
    public static final int INIT_W = 60;
    /**
     * les points de vie initiale du vaisseau
     */
    public static final int INIT_HP = 100;
    /**
     * les points de vie
     */
    protected int hp;
    /**
     * l'arme du vaisseau
     */
    protected Arme arme; 
    
    protected Vaisseau(int posx, int posy){
        super(posx, posy, INIT_H, INIT_W);
        arme = new Arme();
        hp = INIT_HP;
    }
    
    
    //les actions
    /**
     * Tir sur le vaisseau opposé.
     */
    public abstract void tirer();
      
    
    
    //interface graphique sera implémenté dans les classes filles
 
    
    //lecture de clavier depuis la classe Clavier.java
    /**
     * fait les actions nécessaire quand pour chaque touche appuyé
     */
    public abstract void keyPressed(KeyEvent e);
    
     /**
     * fait les actions nécessaire quand pour chaque touche relaché
     */
    public abstract void keyReleased(KeyEvent e);
    
     /**
     * fait les actions nécessaire quand pour chaque touche tapé
     */
    public abstract void keyTyped(KeyEvent e);

//getters et setters

  

    public int getHp() {
        return hp;
    }
    /**
     * ajoute x au points de vie. 
     */
    public void addHp(int x) {
        hp += x;
        if(hp<0)
            hp = 0;
    }
    /**
     * ajoute dh à la hauteur
     */
    public void addH(int dh) {
        h += dh;
    }
    /**
     * ajoute dw à la largeur 
     */
    public void addW(int dw) {
       w  += dw;
    }
    
    public Arme getArme(){
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }
   
    
    
}

