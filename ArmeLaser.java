/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

/**
 * l'arme laser
 * @author kali
 */
public class ArmeLaser extends Arme{
    
    public ArmeLaser(){
        super(100,"Laser");
    }
    
    @Override
    public void tirer(int posx, int posy, int dir){
        if(nbCartouches>0){
        nbCartouches--;
        tirs.add(new TirLaser(posx,posy,dir));
        }
    }

    
    
}
