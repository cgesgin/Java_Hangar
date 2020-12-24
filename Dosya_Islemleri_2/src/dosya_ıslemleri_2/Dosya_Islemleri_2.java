package dosya_ıslemleri_2;

import java.io.IOException;

public class Dosya_Islemleri_2 {

    public static void main(String[] args) throws IOException {

        DosyaIO dosya=new DosyaIO("kisi.txt");
        Kisi kisi=new Kisi("ahmet","mehmet",121212,15);
        dosya.dosyaYaz(kisi);
        dosya.dosyaOku();
    }
}
