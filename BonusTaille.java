/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

/**
 * Bonus qui augmente la taille du vaisseau touché.
 * @author kali
 */
public class BonusTaille extends Bonus{
    
    public BonusTaille(){
        super();
    }

    @Override
    public void effet(Vaisseau v) {
        v.addH(10);
        v.addW(20);
    }
    
}
