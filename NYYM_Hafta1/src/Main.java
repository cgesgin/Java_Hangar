
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int secim = 0;
        
        do {
            System.out.println("1- daire ");
            System.out.println("2- dikdörgen ");
            System.out.println("3- ucgen ");
            System.out.println("4- cıkıs ");
            System.out.print("Secim : ");
            secim=Integer.valueOf(br.readLine());
            System.out.println("");
            switch(secim){
                case 1:
                    System.out.println("Yari çap giriniz :");
                    int r=Integer.valueOf(br.readLine());
                    Daire daire = new Daire(r);
                    System.out.println("Alan : "+daire.alan());
                    System.out.println("CEvre : "+daire.cevre());
                    break;
                case 2:
                    System.out.println("uzun kenarı giriniz :");
                    int k1=Integer.valueOf(br.readLine());
                    System.out.println("kısa kenarı giriniz :");
                    int k2=Integer.valueOf(br.readLine());
                    Dikdortgen d2=new  Dikdortgen(k1, k2);
                    System.out.println("Alan : "+d2.alan());
                    System.out.println("Cevre : "+d2.cevre());
                    break;
                case 3:
                    System.out.println("1. kenarı giriniz :");
                    int a1=Integer.valueOf(br.readLine());
                    System.out.println("2. kenarı giriniz :");
                    int a2=Integer.valueOf(br.readLine());
                    System.out.println("3. kenarı giriniz :");
                    int a3=Integer.valueOf(br.readLine());
                    Ucgen ucgen =new  Ucgen(a1, a2 ,a3);
                    System.out.println("Alan : "+ucgen.alan());
                    System.out.println("Cevre : "+ucgen.cevre());
                    break;
            }
        } while(secim!=4);
    }
}
