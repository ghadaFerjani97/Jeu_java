/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

/**
 *Interface pour tous les objets de type Bonus ou Tir qui sont temporaires sur le terrain.
 */
public interface TempObject {
    
    /**
     * réalise son effet sur le vaisseau v.
     * @param v vaisseau ciblé
     */
    public abstract void effet(Vaisseau v);// pour faire les actions au moment du collision avec un vaisseau
    
    /**
     * teste de colision avec v
     * @param v vaisseau ciblé
     * @return true si il y a eu une collision.
     */
    public abstract boolean collision(Vaisseau v);// teste s'il y a collision avec un vaisseau
    
    
}
