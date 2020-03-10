/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
/**
 * classe qui implemente KeyListener et gére les lectures de clavier pendant le jeu.
 * @author kali
 */
public class Clavier implements KeyListener{
    private final Vaisseau l,r;
    public Clavier(Vaisseau l, Vaisseau r){
        this.l = l;
        this.r = r;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l.keyTyped(e);
        r.keyTyped(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l.keyPressed(e);
        r.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l.keyReleased(e);
        r.keyReleased(e);
    }
}
