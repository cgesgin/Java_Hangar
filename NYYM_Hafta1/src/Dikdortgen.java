
public class Dikdortgen extends Sekil{

    int k1;
    int k2;
    public Dikdortgen(int k1,int k2) {
        this.k1=k1;
        this.k2=k2;
    }
    @Override
    public double alan() {
       return k1*k2;
    }

    @Override
    public double cevre() {
        return (k1*k2)*2;
    }
    
}
