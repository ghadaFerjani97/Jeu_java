/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

/**
 * Bonus qui augmente le nombre de carouche du vaisseau touché.
 * @author kali
 */
public class BonusCartouches extends Bonus {
    
    public BonusCartouches(){
        super();
    }

    @Override
    public void effet(Vaisseau v) {
        
        (v.getArme()).addNbCartouches();
        
    }
    
    
}
