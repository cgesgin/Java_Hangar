package oop_Survivor_game;

public class Envanter {
    private boolean su,yemek,odun,ates;
    private String silahAd,zırhAd;
    private int hasar,zırh;

    public Envanter() {
        this.su=false;
        this.yemek=false;
        this.odun=false;
        this.ates=false;
        this.hasar=0;
        this.zırh=0;
        this.silahAd=null;
        this.zırhAd=null;
    }

    public boolean isSu() {
        return su;
    }

    public void setSu(boolean su) {
        this.su = su;
    }

    public boolean isYemek() {
        return yemek;
    }

    public void setYemek(boolean yemek) {
        this.yemek = yemek;
    }

    public boolean isOdun() {
        return odun;
    }

    public void setOdun(boolean odun) {
        this.odun = odun;
    }

    public String getSilahAd() {
        return silahAd;
    }

    public void setSilahAd(String silahAd) {
        this.silahAd = silahAd;
    }

    public String getZırhAd() {
        return zırhAd;
    }

    public void setZırhAd(String zırhAd) {
        this.zırhAd = zırhAd;
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public int getZırh() {
        return zırh;
    }

    public void setZırh(int zırh) {
        this.zırh = zırh;
    }

    public boolean isAtes() {
        return ates;
    }

    public void setAtes(boolean ates) {
        this.ates = ates;
    }
    
    
}
