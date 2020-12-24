package oop_Survivor_game;

public abstract class SavasBölge extends Bölge {

    protected Canavar canavar;
    protected String loot;

    public SavasBölge(Oyuncu oyuncu, String ad, Canavar canavar,String loot) {
        super(oyuncu);
        this.ad = ad;
        this.canavar = canavar;
        this.loot=loot;
    }

    @Override
    public boolean getBolge() {

        int canavarSayisi = canavar.canavarSayisi();
        System.out.println("Bulundugunuz bölge : " + this.getAd()
                + " Dikkat ediniz. Burada " + canavarSayisi
                + " tane " + canavar.getName() + " yaşıyor ");
        System.out.println("<S>Savas veya <K>Kaç");
        String secim = scan.nextLine();
        secim = secim.toUpperCase();
        if (secim.equals("S")) {
            if (savas(canavarSayisi)) {
                if(this.loot.equals("Yemek") && oyuncu.getEnvanter().isYemek()==false)
                {
                    System.out.println(this.loot+" Kazandınız . ");
                    oyuncu.getEnvanter().setYemek(true);
                }
                else if(this.loot.equals("Su") && oyuncu.getEnvanter().isSu()==false){
                    System.out.println(this.loot+" Kazandınız . ");
                    oyuncu.getEnvanter().setSu(true);
                }
                else if(this.loot.equals("Odun") && oyuncu.getEnvanter().isOdun()==false){
                    System.out.println(this.loot+" Kazandınız . ");
                    oyuncu.getEnvanter().setOdun(true);
                }
                else if(this.loot.equals("Ateş") && oyuncu.getEnvanter().isAtes()==false){
                    System.out.println(this.loot+" Kazandınız . ");
                    oyuncu.getEnvanter().setAtes(true);
                }
                System.out.println(this.getAd() + "Canavarları yendiniz ");
                return true;
            } 
            if(oyuncu.getCan()<=0)
            {
                System.out.println(" öldünüz ");
                System.out.println("game over");
                return false;
            }

        }
        return true;
    }

    public boolean savas(int canavarSayisi) {
        for (int i = 0; i < canavarSayisi; i++) {
            int defaultcanavarCanı=canavar.getCan();
            oyuncuOzelikleri();
            canavarOzellikleri();
            while(oyuncu.getCan() >0 && canavar.getCan()>0)
            {
                System.out.println("Vurmak için : V ");
                System.out.println("Kaçmak için : K ");
                String secim=scan.nextLine();
                secim=secim.toUpperCase();
                
                if (secim.equals("V")) {
                    System.out.println("SALDIRILDI !!");
                    canavar.setCan(canavar.getCan()-oyuncu.getToplamHasar());
                    saldiriSonrasi();
                    if (canavar.getCan()>0) {
                    
                        System.out.println("");
                        System.out.println("Canavar saldırdı . . .");
                        oyuncu.setCan(oyuncu.getCan()-(canavar.getHasar()-oyuncu.getEnvanter().getHasar()));
                         saldiriSonrasi();
                    }
                   
                }
                else{
                    return false;
                }
            }
            if (canavar.getCan() < oyuncu.getCan()) {
                System.out.println(" canavarları yendiniz  .");
                oyuncu.setPara(oyuncu.getPara()+canavar.getLoot());
                System.out.println(oyuncu.getAd() + "  Toplam paranız : "+oyuncu.getPara());
                canavar.setCan(defaultcanavarCanı);
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public void oyuncuOzelikleri() {
        System.out.println("Oyuncu Bilgileri \n -----------------------------------------------");
        System.out.println("Can             : "+oyuncu.getCan());
        System.out.println("Hasar           : "+oyuncu.getToplamHasar());
        System.out.println("Para            : "+oyuncu.getPara());
        System.out.println("Silah           : "+oyuncu.getEnvanter().getSilahAd());
        
        if (oyuncu.getEnvanter().getHasar()>0) {
            System.out.println("Silah           : "+oyuncu.getEnvanter().getSilahAd());            
        }
        if (oyuncu.getEnvanter().getZırh()>0) {
            System.out.println("Zırh           : "+oyuncu.getEnvanter().getZırhAd());            
        }
        
    }

    public void canavarOzellikleri() {
        System.out.println(canavar.getName() + "Özellikleri \n ------------------------------- ");
        System.out.println("Can      : "+canavar.getCan());
        System.out.println("Hasar    : "+canavar.getHasar());
        System.out.println("Ödül     : "+canavar.getLoot());
    }
    public void saldiriSonrasi()
    {   
        System.out.println(oyuncu.getAd()+ " Canı "+ oyuncu.getCan());
        System.out.println(canavar.getName()+" Canı "+canavar.getCan());
    }

    
}
