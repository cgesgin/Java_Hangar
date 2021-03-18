
public class Topla extends Matematik{

    private String tip ;
    private int deger;
    private int deger2;
    
    public Topla(int deger ,int deger2) {
        this.tip = "Topla";
        this.deger = deger;
        this.deger2 = deger2;
    }

    public int getDeger2() {
        return deger2;
    }

    public void setDeger2(int deger2) {
        this.deger2 = deger2;
    }

    public int getDeger() {
        return deger;
    }

    public void setDeger(int deger) {
        this.deger = deger;
    }
    
    
    public String getTip() {
        return tip;
    }

    @Override
    public int hesapla() {
        return this.deger+this.deger2;
    }
    
}
