
public class Carpma extends Matematik {

    private String tip;
    private int deger;
    private int deger2;

    public Carpma(int deger, int deger2) {
        this.deger = deger;
        this.deger2 = deger2;
        this.tip = "Çarpma";
    }

    public int getDeger() {
        return deger;
    }

    public void setDeger(int deger) {
        this.deger = deger;
    }

    public int getDeger2() {
        return deger2;
    }

    public void setDeger2(int deger2) {
        this.deger2 = deger2;
    }

    public String getTip() {
        this.tip = "Topla";
        return tip;
    }

    @Override
    public int hesapla() {
        return  this.deger*this.deger2;
    }
}
