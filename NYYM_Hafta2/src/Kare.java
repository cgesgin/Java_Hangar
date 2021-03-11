
public class Kare extends Sekil{
    
    private int kenar;

    public Kare(int kenar) {
        this.tip="kare";
        this.kenar = kenar;
    }
    
    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public int cevre() {
        return this.kenar*4;
    }

    @Override
    public int alan() {
        return this.kenar*this.kenar;
    }
}
