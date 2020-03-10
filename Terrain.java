/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InitJeu;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

/**
 * Le terrain du jeu qui etend JPanel et qui gére l'affichage et les modifications du jeu.
 * @author kali
 */

public class Terrain  extends JPanel{
    /**
     * hauteur du terrain
     */
    public final static int HTERRAIN = 1000;
    /**
     * largeur du terrain
     */
    public final static int WTERRAIN = 1500;
    private final VaisseauL l;
    private final VaisseauR r;
    private final Clavier clavier;
    private final ArrayList<Bonus> bonus;
    private final ArrayList<Tir> tirs;
   
    public Terrain(){
  
     l = new VaisseauL();
     r = new VaisseauR();
     clavier = new Clavier(l,r);
     addKeyListener(clavier);// lecture de clavier
     setFocusable(true);
     tirs = Arme.getTirs();
    bonus = new ArrayList<Bonus>();
     
    }
    
    /**
     * Realise l'affichage graphique du jeu.
     * @param g 
     */
    @Override
    public void paint(Graphics g){// crée l'affichage de tous les elements du jeu
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(0, 0, WTERRAIN, HTERRAIN);
        g2d.setColor(Color.BLACK);
        g2d.drawLine(WTERRAIN/2, 0, WTERRAIN/2, HTERRAIN);
        l.paint(g2d);
        r.paint(g2d);
       for(int i=0; i<tirs.size(); i++){
           tirs.get(i).paint(g2d);
       }
       for(int i=0; i<bonus.size(); i++){
           bonus.get(i).paint(g2d);
       }
      
    }
    /**
     * Fait bouger tous les elements du jeu.
     */
    public void moveAll(){
        
        l.move();
        r.move();
        for(int i=0; i<tirs.size(); i++){
            tirs.get(i).move();
            if(tirs.get(i).Sortie())
                tirs.remove(i);
          
        }
        
       
    }
    /**
     * Ajoute aleatoirement des bonus au jeu, un bonus sera ajouté avec une probabilité de 0.0005.
     */
    public void addBonus(){
        
        double proba = Math.random();
        if(proba<0.001)
            bonus.add(new BonusHp());
        else if(proba>=0.001&&proba<0.002)
            bonus.add(new BonusArme(new ArmeLaser()));
        else if(proba>=0.002&&proba<0.003)
            bonus.add(new BonusArme(new ArmeCanon()));
        else if(proba>=0.003&&proba<0.004)
            bonus.add(new BonusTaille());
        else if(proba>=0.004&&proba<0.005)
            bonus.add(new BonusCartouches());
    }
    /**
     * Met à jour l'état du jeu.
     */
    public void update(){
       
        for(int i=0; i<tirs.size(); i++){
            if(tirs.get(i).collision(l)){
                tirs.get(i).effet(l);
                tirs.remove(i);
                continue;
                
            }
             if(tirs.get(i).collision(r)){
                tirs.get(i).effet(r);
                tirs.remove(i);
            }
        }
        
        for(int i=0; i<bonus.size(); i++){
            if(bonus.get(i).collision(l)){
                bonus.get(i).effet(l);
                bonus.remove(i);
                continue;
            }
             if(bonus.get(i).collision(r)){
                bonus.get(i).effet(r);
                bonus.remove(i);
            }
        }
        addBonus();
    }
   
}
