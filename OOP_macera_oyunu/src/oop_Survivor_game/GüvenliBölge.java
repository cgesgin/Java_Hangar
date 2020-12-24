
package oop_Survivor_game;

public  abstract class GüvenliBölge extends Bölge{

    public GüvenliBölge(Oyuncu oyuncu,String ad) {
        super(oyuncu);
        this.ad=ad;
    }
    
    public boolean getBölge()
    {
        return true;
    }
    
    
}
