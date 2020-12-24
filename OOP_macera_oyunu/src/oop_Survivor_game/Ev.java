
package oop_Survivor_game;

public class Ev extends GüvenliBölge{

    public Ev(Oyuncu oyuncu) {
        super(oyuncu, "Ev");
    }

    @Override
    public boolean getBolge() {
        oyuncu.setCan(oyuncu.getFullCan());
        System.out.println("Güvenli Bölge(ev)");
        System.out.println("Can doldu");
        System.out.println("Canınız : "+oyuncu.getCan());
        return true;
    }

    
    
}
