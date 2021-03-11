
public class Daire extends Sekil{

    private int r;

    public Daire(int r) {
        this.tip="daire";
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public int cevre() {
        return (int) (2*3.14*r);
    }

    @Override
    public int alan() {
       return (int) (3.14*this.r*this.r);
    }
    
}
