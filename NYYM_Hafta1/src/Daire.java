
public class Daire extends Sekil{

    int r;
    public Daire(int r) {
     this.r=r;
    }
    
    @Override
    public double alan() {
        return 3.14*r*r;
    }

    @Override
    public double cevre() {
        return 3.14*r*2;
    }
    
}
