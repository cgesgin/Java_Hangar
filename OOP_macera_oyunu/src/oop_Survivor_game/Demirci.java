package oop_Survivor_game;

public class Demirci extends GüvenliBölge {

    public Demirci(Oyuncu oyuncu) {
        super(oyuncu, "Demirci");
    }

    @Override
    public boolean getBolge() {

        System.out.println("Hos gelfiniz ben Demirci Ahmet usta");
        System.out.println("silahlar ----> 1");
        System.out.println("zırhlar  ----> 2");
        int secim = scan.nextInt();
        int secimID;

        switch (secim) {
            case 1:
                secimID = silahmenü();
                if (envanterSilahKontol(secimID) == false) {
                    System.out.println("Envanter bos");
                    break;
                }
                silahAl(secimID);
                break;
            case 2:
                secimID = zirhmenü();
                if (envanterZirhKontol(secimID) == false) {
                    System.out.println("Envanter bos");
                    break;
                }
                zirhAl(secimID);
                break;
               
        }
        return true;
    }

    public boolean envanterSilahKontol(int item) {
        if (item == 1 && (oyuncu.getEnvanter().getSilahAd() != null && oyuncu.getEnvanter().getSilahAd().equals("Tabanca"))) {
            return true;
        }
        if (item == 2 && (oyuncu.getEnvanter().getSilahAd() != null && oyuncu.getEnvanter().getSilahAd().equals("Kılıç"))) {// 

            return true;
        }
        if (item == 3 && (oyuncu.getEnvanter().getSilahAd() != null && oyuncu.getEnvanter().getSilahAd().equals("Tüfek"))) {// 

            return true;
        }
        return false;
    }

    public boolean envanterZirhKontol(int item) {
        if (item == 1 && (oyuncu.getEnvanter().getZırhAd() != null && oyuncu.getEnvanter().getZırhAd().equals("hafif"))) {
            return true;
        }
        if (item == 2 && (oyuncu.getEnvanter().getZırhAd() != null && oyuncu.getEnvanter().getZırhAd().equals("orta"))) {// 
            return true;
        }
        if (item == 3 && (oyuncu.getEnvanter().getZırhAd() != null && oyuncu.getEnvanter().getZırhAd().equals("agir"))) {// 
            return true;
        }
        return false;
    }
    public int zirhmenü(){
        System.out.println("1- hafif zırh   -->>   para : 15,     koruma : 1 ");
        System.out.println("2- orta  zırh   -->>   para : 25,     koruma : 3 ");
        System.out.println("3- agir  zırh   -->>   para : 40 ,    koruma : 5 ");
        System.out.println("4- Cıkış");
        System.out.println("zirh seciniz : ");
        int secim = scan.nextInt();
        return secim;
    }
    
    public void zirhAl(int item) {
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
                oyuncu.getEnvanter().setZırh(zirh+oyuncu.getEnvanter().getZırh());
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
    
    public int silahmenü() {

        System.out.println("1- tabanca  -->>  para : 40,      hasar : +5  ekler");
        System.out.println("2- kılıç    -->>  para : 35,      hasar : +3  ekler");
        System.out.println("3- tüfek    -->>  para : 100,     hasar : +7  ekler");
        System.out.println("4- Cıkış");
        System.out.println("Silah seciniz : ");
        int secim = scan.nextInt();
        return secim;
    }

    public void silahAl(int item) {
        int hasar = 0, fiyat = 0;
        String silahAd = "";
        switch (item) {
            case 1:
                hasar = 5;
                silahAd = "Tabanca";
                fiyat = 40;
                break;
            case 2:
                hasar = 3;
                silahAd = "Kılıç";
                fiyat = 35;
                break;
            case 3:
                hasar = 7;
                silahAd = "Tüfek";
                fiyat = 100;
                break;
            case 4:
                System.out.println("Cıkiş yapılıyor ... ");
                break;
            default:
                System.out.println("gecersiz işlem");
                break;
        }
        if (oyuncu.getPara() >= fiyat) {
            int oncekiHasar=oyuncu.getEnvanter().getHasar();
            oyuncu.getEnvanter().setHasar(hasar+oyuncu.getEnvanter().getHasar());
            oyuncu.getEnvanter().setSilahAd(silahAd);
            oyuncu.setPara(oyuncu.getPara() - fiyat);
            System.out.println("Silah satin aldınız ,"
                    + " Önceki hasar :  " + oyuncu.getEnvanter().getHasar()
                    + ",  yeni hasar  : " + oyuncu.getToplamHasar());

            System.out.println("Kalan para : " + oyuncu.getPara());
        } else {
            System.out.println(" yetersiz bakiye ");
        }

    }

}
