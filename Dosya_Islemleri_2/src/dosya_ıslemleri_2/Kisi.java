package dosya_ıslemleri_2;

public class Kisi {

    private String ad;
    private String soyad;
    private int tckn;
    private int dt;

    public Kisi(String ad, String soyad, int tckn, int dt) {
        this.ad = ad;
        this.soyad = soyad;
        this.tckn = tckn;
        this.dt = dt;
    }

    public Kisi() {
    }
    

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getTckn() {
        return tckn;
    }

    public void setTckn(int tckn) {
        this.tckn = tckn;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

}
