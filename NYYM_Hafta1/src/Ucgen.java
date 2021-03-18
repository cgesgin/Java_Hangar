
public class Ucgen extends Sekil{
    int k1;
    int k2;
    int k3;
    public Ucgen(int k1,int k2,int k3) {
        this.k1=k1;
        this.k2=k2;
        this.k3=k3;
    }
    
    @Override
    public double alan() {
        return k1*k2*k3;
    }

    @Override
    public double cevre() {
        return k1+k2+k3;
    }
}
