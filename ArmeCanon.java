/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

/**
 * l'arme canon
 * @author kali
 */
public class ArmeCanon extends Arme{
    
    public ArmeCanon(){
        super(120,"Canon");
    }
    
   @Override
   public void tirer(int posx, int posy, int dir){
       if(nbCartouches>0){
        nbCartouches--;
        tirs.add(new TirCanon(posx,posy,dir));
       }
    }
}
