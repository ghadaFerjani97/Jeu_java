/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

/**
 * Bonus qui donne une nouvelle arme au viasseau touché.
 * @author kali
 */
public class BonusArme extends Bonus{
    /**
     * l'arme donnée au vaisseau touché
     */
    private final Arme arme;

    public BonusArme(Arme arme){
           super();
           this.arme=arme;
    }

    @Override
    public void effet(Vaisseau v) {
            v.setArme(arme);
    }
    
    
}
