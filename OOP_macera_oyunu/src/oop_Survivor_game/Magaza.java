package oop_Survivor_game;

public class Magaza extends GüvenliBölge {

    public Magaza(Oyuncu oyuncu) {
        super(oyuncu, "Mağaza");
    }

    @Override
    public boolean getBolge() {
        System.out.println("Para : " + oyuncu.getPara());
        System.out.println("1- Silahlar ");
        System.out.println("2- Zırhlar ");
        System.out.println("3- Çıkış ");
        int secim = scan.nextInt();
        int secilenItem;
        switch(secim)
        {
            case 1:
                secilenItem=silahMenü();
                silahSatinAl(secilenItem);
                break;
            case 2:
                secilenItem=zirhMenü();
                zirhSatinAl(secilenItem);
                break;
            case 3:
                System.out.println("Cıkıs yapılıyor .....");
                break;
        }

        return true;
    }

    public int silahMenü() {
        System.out.println("1- tabanca  -->>  para : 25,    hasar : 2 ");
        System.out.println("2- kılıç    -->>  para : 35,    hasar : 3 ");
        System.out.println("3- tüfek    -->>  para : 45     hasar : 7 ");
        System.out.println("4- Cıkış");
        System.out.println("Silah seciniz : ");
        int secim = scan.nextInt();
        return secim;
    }
    public void silahSatinAl(int item) {
        int hasar = 0, fiyat = 0;
        String silahAd = "";

        switch (item) {
            case 1:
                hasar = 2;
                silahAd = "Tabanca";
                fiyat = 25;
                break;
            case 2:
                hasar = 3;
                silahAd = "Kılıç";
                fiyat = 35;
                break;
            case 3:
                hasar = 7;
                silahAd = "Tüfek";
                fiyat = 45;
                break;
            case 4:
                System.out.println("Cıkiş yapılıyor ... ");
                break;
            default:
                System.out.println("gecersiz işlem");
                break;
        }
         
            if (oyuncu.getPara() >= fiyat) {
                oyuncu.getEnvanter().setHasar(hasar);
                oyuncu.getEnvanter().setSilahAd(silahAd);
                oyuncu.setPara(oyuncu.getPara() - fiyat);
                System.out.println("Silah satin aldınız ,"
                        + " Önceki hasar :  " + oyuncu.getHasar()
                        + ",  yeni hasar  : " + oyuncu.getToplamHasar());
                
                System.out.println("Kalan para : " + oyuncu.getPara());
            } else {
                System.out.println(" yetersiz bakiye ");
                System.out.println(" biraz daha avlada para topla ");
            }
         

    }
     public int zirhMenü() {
        System.out.println("1- hafif zırh   -->>   para : 15,     koruma : 1 ");
        System.out.println("2- orta  zırh   -->>   para : 25,     koruma : 3 ");
        System.out.println("3- agir  zırh   -->>   para : 40 ,    koruma : 5 ");
        System.out.println("4- Cıkış");
        System.out.println("zirh seciniz : ");
        int secim = scan.nextInt();
        return secim;

    }
     public void zirhSatinAl(int item) {
        int zirh = 0, fiyat = 0;
        String zirhAd = "";

        switch (item) {
            case 1:
                zirh = 1;
                zirhAd = "hafif";
                fiyat = 15;
                break;
            case 2:
                zirh = 3;
                zirhAd = "orta";
                fiyat = 25;
                break;
            case 3:
                zirh = 5;
                zirhAd = "agir";
                fiyat = 40;
                break;
            case 4:
                System.out.println("Cıkiş yapılıyor ... ");
                break;
            default:
                System.out.println("gecersiz işlem");
                break;
        }
        if (fiyat > 0) {
            if (oyuncu.getPara() >= fiyat) {
                oyuncu.getEnvanter().setZırh(zirh);
                oyuncu.getEnvanter().setZırhAd(zirhAd);
                
                oyuncu.setPara(oyuncu.getPara() - fiyat);                
                System.out.println(
                        zirhAd +"  satin aldınız ,"
                               +" Engellenen hasariniz  : "+oyuncu.getEnvanter().getZırh());
                
                System.out.println("Kalan para : " + oyuncu.getPara());
            } else {
                System.out.println(" yetersiz bakiye ");
            }
        }

    }
}
