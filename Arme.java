/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

import java.util.ArrayList;

/**
 * la classe des armes utilisées par les vaisseau.
 * @author kali
 */
public class Arme {
    /**
     * nombre de cartouches restant
     */
    protected int nbCartouches;
    /**
     * nom de l'arme
     */
    private final String nomArme;
    /**
     * ArrayList contenant tous les Tirs tiré pendant le jeu.
     */
    protected static ArrayList<Tir> tirs = new ArrayList<>();
    /**
     * crée une arme par deffault.
     */
    public Arme(){
       nbCartouches=100;
       nomArme="ARME";
        
    }
    protected Arme(int nbCartouches,String nomArme){
       this.nbCartouches=nbCartouches;
       this.nomArme=nomArme;
    }
    /**
     * Tir sur un vaisseau.
     * @param posx position en x du vaisseau attaquant
     * @param posy position en y du vaisseau attaquant
     * @param dir  direction du mouvement du tir(+1 à doite, -1 à gauche)
     */
    public void tirer(int posx, int posy, int dir){
        if(nbCartouches>0){
        nbCartouches--;
        tirs.add(new TirDeffault(posx,posy,dir));
        }
    }

    public static ArrayList<Tir> getTirs() {
        return tirs;
    }
    /**
     * Ajoute le nombre de cartouches du vaisseau de 10.
     */
    public void addNbCartouches(){
            nbCartouches+=10;
    }

    public String getNomArme() {
        return nomArme;
    }

    public int getNbCartouches() {
        return nbCartouches;
    }
    
}
