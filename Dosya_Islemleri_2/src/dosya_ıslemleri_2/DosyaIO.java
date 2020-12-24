package dosya_ıslemleri_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaIO {

    File dosya;

    public DosyaIO(String name) {
        try {
            dosya = new File(name);
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("**********************************************");
            System.out.println("Dosya yapıcı metodu hatası");
            System.out.println("**********************************************");
        }
    }

    public void dosyaYaz(Kisi kisi) {
        try {
            FileWriter fw = new FileWriter(dosya, true);
            BufferedWriter bw = new BufferedWriter(fw);
            //text dosyaya sadece veriler karakter katarı yazılır
            bw.write(kisi.getAd() + "+"
                    + kisi.getSoyad() + "-"
                    + kisi.getTckn() + "/"
                    + kisi.getDt() + "+");
            bw.newLine();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("**********************************************");
            System.out.println("Dosya yaz metodu hatası");
            System.out.println("**********************************************");
        }
    }

    public Kisi dosyaOku() {
        String s;
        Kisi kisi=new Kisi();
        try {
            FileReader fr = new FileReader(dosya);
            BufferedReader br = new BufferedReader(fr);
            s=br.readLine();
            kisi.setAd(s.substring(0,s.indexOf("+")));
            kisi.setSoyad(s.substring(s.indexOf("+")+1,s.indexOf("-")));
            kisi.setTckn(Integer.parseInt(s.substring(s.indexOf("-")+1,s.indexOf("/"))));
            kisi.setDt(Integer.parseInt(s.substring(s.indexOf("/")+1,s.indexOf("*"))));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("**********************************************");
            System.out.println("Dosya oku metodu hatası");
            System.out.println("**********************************************");
        }
        return kisi;
    }

    public int dosyaSayisi() {
        int sayac = 0;
        try {
            FileReader fr = new FileReader(dosya);
            BufferedReader br = new BufferedReader(fr);
            while (br.readLine() != null) {
                sayac++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("**********************************************");
            System.out.println("Dosya sayisi metodu hatası");
            System.out.println("**********************************************");
        }
        return sayac;
    }

}
