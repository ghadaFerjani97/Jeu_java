/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitJeu;

/**
 * La classe qui gére les tir fait par les armes.
 * @author kali
 */
public abstract class Tir extends ElemJeu implements TempObject {
    /**
     * les degats causé par le tir
     */
    protected int degat;
    /**
     * la direction du tir, +1 à droite et -1 à gauche
     */
    protected int dir;
    protected Tir(int posx, int posy, int h, int w,int degat, int dir) {
        super(posx+1, posy+1, h, w);// pour eviter une collision avec le vaisseau
        this.degat=degat;
        this.dir=dir;
        
    }
    @Override
    public void effet(Vaisseau v) {
        if (v.getHp()>0){
            v.addHp(-degat);
        }
    }

   @Override
    public boolean collision(Vaisseau v) {
        int vx=v.getPosx();
        int vy=v.getPosy();
        int vh=v.getH();
        int vw=v.getW();
        boolean b1=(vx==posx+w)&&(vy+h>=posy)&&(vy-h<=posy);
        boolean b2=(posx+w>=vx)&&(posx+w<=vx+vw)&&(posy+h>=vy-(vh/2))&&(posy+h<=vy+(vh/2));
        boolean b3=(vx==posx)&&(vy+h>=posy)&&(vy-h<=posy);
        boolean b4=(posx>=vx-vw)&&(posx<=vx)&&(posy+h>=vy-(vh/2))&&(posy+h<=vy+(vh/2));
        if((v instanceof VaisseauL) && dir == -1){//tir du vaisseau de droite vers le vaisseau de gauche 

            return(b3||b4);
        }
        else if((v instanceof VaisseauR)&& dir == 1){// tir du vaisseau de gauche vers le vaisseau de droite
            return (b1||b2);
        }
        return false;
    }
    
    @Override
    public void move() {
        
        posx+=dir*dx;
              
        
    }
    
    /**
     * teste si le tir est sortie du jeu.
     * @return true quand le tir et sortie du terrain de jeu.
     */
    public boolean Sortie(){
        return (posx<=0)||(posx>=Terrain.WTERRAIN);
            
    }
    
}       
        
                
            
      