/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
/**
 * la classe main, pour initialiser et lancer la boucle du jeu.
 * @author kali
 */


public class InitJeu {
 
    public static void main(String [] args){
        JFrame frame = new JFrame("jeu");
        Terrain t = new Terrain();
        frame.setSize(Terrain.WTERRAIN,Terrain.HTERRAIN);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(t);
        
        //boucle de jeu
        while(true){
            
            try {
                t.moveAll();
                t.update();
                t.repaint();
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(InitJeu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
