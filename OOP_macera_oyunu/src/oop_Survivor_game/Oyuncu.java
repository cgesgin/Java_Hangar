package oop_Survivor_game;

import java.util.Scanner;

public class Oyuncu {

    private int hasar, can, para,fullCan;
    private String ad, karakterAd;
    private Envanter envanter;
    Scanner scan = new Scanner(System.in);
    
    //Constructor
    public Oyuncu(String ad) {
        this.ad = ad;
        envanter=new Envanter();
        
    }
    //getter-setter baslangıc
    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getPara() {
        return para;
    }

    public void setPara(int para) {
        this.para = para;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKarakterAd() {
        return karakterAd;
    }

    public void setKarakterAd(String karakterAd) {
        this.karakterAd = karakterAd;
    }

    public Envanter getEnvanter() {
        return envanter;
    }

    public void setEnvanter(Envanter envanter) {
        this.envanter = envanter;
    }

    public int getFullCan() {
        return fullCan;
    }

    public void setFullCan(int fullCan) {
        this.fullCan = fullCan;
    }
    
    
    

     

    public void karakterSecim(){
        switch (karakterMenü()) {
            case 1:
                karakterOlustur("Samuray",5,21,100 );
                break;            
            case 2:
                 karakterOlustur("Okçu",7,18,20 );
                break;
            case 3:
                 karakterOlustur("Şövalye",8,24,5 );
                break;
            default:
                 karakterOlustur("Şövalye",8,24,5 );
                break; 
        }
        System.out.println("\nKarakter :   "+getKarakterAd()+
                           "\nHasar    :   "+getHasar()+
                           "\nCan      :   "+getCan()+
                           "\nPara     :   "+getPara());
    }

    public int karakterMenü() {
        System.out.println("Hosgeldin : "+getAd());
        System.out.println("Lütfen bir character secin  : ");
        System.out.println("1-Samuray   hasar : 5   Can : 21   Para : 100 ");
        System.out.println("2-Okçu      hasar : 7   Can : 18   Para : 20 ");
        System.out.println("3-Şövalye   hasar : 8   Can : 24   Para : 5 ");
        System.out.println("Seciminiz : ");
        int karakterID = scan.nextInt();
        while (karakterID < 1 || karakterID > 3) {
            System.out.println("Lütfen gecerli bir karakter seciniz .");
            karakterID = scan.nextInt();
        }
        return karakterID;
    }
    public void karakterOlustur(String karakterAd,int hasar, int can ,int para  )
    {
        setKarakterAd(karakterAd);
        setCan(can);
        setHasar(hasar);
        setPara(para);
        setFullCan(can);
    }
    
    public int getToplamHasar()
    {
        return this.getHasar()+this.getEnvanter().getHasar();
    }
    
}
