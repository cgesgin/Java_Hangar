package oop_Survivor_game;

import java.util.Scanner;

public class Oyun {

    Oyuncu oyuncu;
    Bölge bölge;
    Scanner scan = new Scanner(System.in);

    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Oyuna hosgeldiniz .....");
        System.out.println("Oyunu baslamadan once isminizi giriniz .");
        String oyuncuAd = scan.nextLine();
        oyuncu = new Oyuncu(oyuncuAd);
        oyuncu.karakterSecim();
        baslat();
    }

    public void baslat() {
        while (true) {
            System.out.println("");
            System.out.println("########################################################");
            System.out.println("");
            System.out.println("Bölge seciniz :");
            System.out.println("1- Ev           ->'güvenli bölge'");
            System.out.println("2- mağara       ->'zombi cıkabilir'");
            System.out.println("3- orman        ->'Vampir cıkabilir'");
            System.out.println("4- nehir        ->'Dikkat ayı vardır'");
            System.out.println("5- Mağaza       ->'Silah ve zırh alabilirsiniz'");
            System.out.println("6- Demirci      ->'Zırh ve silahlarınızı güclendirebilirsiniz'");
            System.out.println("7- Cöl          ->'Dikkat Akrep vardır ve sürü halinde dolasırlar'");           
            System.out.println("Cıkıs -1 giriniz       " );
            System.out.print("Seciminiz : ");
            int secim = scan.nextInt();
            while (secim <0 || secim >8) {
                System.out.println("Gecersiz bölge secimi");
                secim = scan.nextInt();
            }
            switch (secim) {
                case 1:
                    //ev
                    bölge = new Ev(oyuncu);
                    break;
                case 2:
                    //magara
                    bölge = new Magara(oyuncu);
                    break;
                case 3:
                    //orman
                    bölge = new Orman(oyuncu);
                    break;
                case 4:
                    //nehir
                    bölge = new Nehir(oyuncu);
                    break;
                case 5:
                    //magaza
                    bölge = new Magaza(oyuncu);
                    break;
                case 6:
                    //Demrci
                    bölge = new Demirci(oyuncu);
                    break;
                case 7:
                    //Cöl
                    bölge = new Cöl(oyuncu);
                    break;
                default:
                    bölge = new Ev(oyuncu);
                    break;
            }
            if (bölge.getClass().getName().equals("Ev")) {
                if (oyuncu.getEnvanter().isOdun() && oyuncu.getEnvanter().isSu() && oyuncu.getEnvanter().isYemek()
                        && oyuncu.getEnvanter().isAtes() ) {
                    System.out.println("Oyunu kazandınız.");
                    break;
                }
            }
            if (!bölge.getBolge()) {
                System.out.println("Game over....");
                break;
            }
        }
    }
}
