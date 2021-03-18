
public class Bolme extends Matematik {

    private String tip;
    private int deger1;
    private int deger2;

    public Bolme(int deger1, int deger2) {
        this.deger1 = deger1;
        this.deger2 = deger2;
        this.tip="Bölme";
    }
    public String getTip() {
        return tip;
    }

    @Override
    public int hesapla() {
        return this.deger1/this.deger2;
    }
}
