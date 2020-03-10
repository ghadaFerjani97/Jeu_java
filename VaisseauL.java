/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
/**
 * la classe qui gére les actions et l'affichage du vaisseau de gauche.
 * @author kali
 */
public class VaisseauL extends Vaisseau{
    
    public VaisseauL() {
        super(Vaisseau.INIT_W+10, Terrain.HTERRAIN/2);
    }
    
    @Override
    public void move(){
        
        if(posx+dx>=w && posx+dx<=Terrain.WTERRAIN/2)
            
            posx+=dx;
        
        if(posy+dy>=h/2 && posy+dy+h/2<=Terrain.HTERRAIN)
            
            posy+=dy;
    }
    
    //interface graphique
    
    @Override
    public void paint(Graphics2D g2d){
        int [] x= {posx, posx-w, posx-w};//les coordonnées en x
        int [] y = {posy, posy+h/2, posy-h/2};//les coordonnées en y
        g2d.fillPolygon(x, y, 3);//creation d'un triangle
        g2d.drawString("Points de vie: "+hp, 0, 20);
        g2d.drawString("Arme: "+arme.getNomArme(), 0, 35);
        g2d.drawString("cartouches: "+arme.getNbCartouches(), 0, 50);
    }
    
    //l'action
    @Override
    public void tirer(){
        arme.tirer(posx+10, posy, 1);
    }
    
    //fonctions de réaction à la lecture de Clavier
    @Override
    public void keyPressed(KeyEvent e){
        if(hp>0){
        switch (e.getKeyCode()) {
        // en haut
            case KeyEvent.VK_Z:
                dy = -1;
                break;
        // en bas
            case KeyEvent.VK_S:
                dy = 1;
                break;
        // à gauche
            case KeyEvent.VK_Q:
                dx = -1;
                break;
        // à droite
            case KeyEvent.VK_D:
                dx = +1;
                break;
            case KeyEvent.VK_F:
                tirer();
            default:
                break;
        }
        }
       
    }
    
    @Override
    public void keyReleased(KeyEvent e){
        dx = 0;
        dy = 0;
    }
    
    @Override
    public void keyTyped(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_F)
            tirer();
    }
}
