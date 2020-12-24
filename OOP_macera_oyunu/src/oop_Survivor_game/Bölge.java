package oop_Survivor_game;

import java.util.Scanner;

public abstract class Bölge {

    protected Oyuncu oyuncu;
    protected String ad;
    Scanner scan = new Scanner(System.in);

    public Bölge(Oyuncu oyuncu) {
        this.oyuncu = oyuncu;
    }

    public abstract boolean getBolge();

    public Oyuncu getOyuncu() {
        return oyuncu;
    }

    public void setOyuncu(Oyuncu oyuncu) {
        this.oyuncu = oyuncu;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

}
