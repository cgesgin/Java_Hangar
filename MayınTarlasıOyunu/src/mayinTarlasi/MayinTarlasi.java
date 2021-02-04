package mayinTarlasi;
import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    
    int sutun;
    int satir;
    int harita[][];
    int oyunTahtasi[][];
    int boyut;
    boolean BittiMi;
    
    Random rand ;
    Scanner scanner;
     
        
    public MayinTarlasi(int satir ,int sutun)
    {
        this.sutun=sutun;
        this.satir=satir;
        this.harita= new int[satir][sutun];
        this.oyunTahtasi= new int[satir][sutun];
        this.boyut=satir*sutun;
        this.BittiMi=true;
        rand= new Random();
        scanner= new Scanner(System.in);
    }

    
    
    public void mayinYerlestir()
    {
        int satir, sutun;
         for (int i = 0; i <= boyut / 4;) { 
            sutun = rand.nextInt(this.sutun);
            satir = rand.nextInt(this.satir);
            if (harita[satir][sutun] != -1) {
                harita[satir][sutun] = -1;
                i++;
            }
        }
    }
    public void göster(int array[][])
    {
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array.length; j++) {
                if(array [i][j]>=0)
                {
                    System.out.print(" ");
                }
                System.out.print(array[i][j] +"  ");                
            }
            System.out.print("\n");
        }
    }
    
    public void baslat()
    {
        mayinYerlestir();
        //göster(harita);
        System.out.println("oyun basladi");
        int satir,sutun,isAlive=0;
        while(BittiMi)
        {
            göster(oyunTahtasi);
            System.out.print("satir giriniz : ");
            satir=scanner.nextInt();
            System.out.print("sutun giriniz :  ");
            sutun=scanner.nextInt();
           
            if (harita[satir][sutun] != -1) {
                kontrol(satir,sutun);
                isAlive++;
                if(isAlive==boyut-(boyut/4))
                {
                    System.out.println("Hayattasınız tebrikler ......");
                }
            }
            else{
                BittiMi=false;
                System.out.println("Kaybettiniz ...");
            }
            
        }
    }
    
    public void kontrol(int satir ,int sutun)
    {
        if(harita[satir][sutun]==0)
        {
            if((sutun< this.sutun-1)&& (harita[satir][sutun+1]==-1))
            {
                oyunTahtasi[satir][sutun]++;
            }
            if((satir< this.satir+1)&& (harita[satir+1][sutun]==-1))
            {
                oyunTahtasi[satir][sutun]++;
            }
            if((satir>0)&& (harita[satir-1][sutun]==-1))
            {
                oyunTahtasi[satir][sutun]++;
            }
            if((sutun>0)&& (harita[satir][sutun-1]==-1))
            {
                oyunTahtasi[satir][sutun]++;
            }
            if(harita[satir][sutun]==0)
            {
                oyunTahtasi[satir][sutun]=-2;
            }
        }
    }
    
    
}
