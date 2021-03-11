
public class Ucgen extends Sekil{

    private int kenar1;
    private int kenar2;
    private int kenar3;

    public Ucgen(int kenar1, int kenar2, int kenar3) {
        
        this.tip="ucgen";
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public int cevre() {
        int toplam=this.kenar1+this.kenar2+this.kenar3;
        return toplam;
    }

    @Override
    public int alan() {
        int s =this.cevre()/2;
        int alan = s*(s-this.kenar1)*(s-this.kenar2)*((s-this.kenar3));
        alan= (int) Math.sqrt(alan);
        return alan;
    }
    
}
