
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] konular = {"konu0",
            "konu1",
            "konu2",
            "konu3",
            "konu4",
            "konu5",
            "konu6",
            "konu7"};
        ArrayList<Integer> rastgele = new ArrayList<Integer>();
        for (int i = 0; i < konular.length; i++) {
            rastgele.add(new Integer(i));
        }
        Collections.shuffle(rastgele);
        int i = 0;

        String secim = null;

        do {
            System.out.println(konular[rastgele.get(i)]);
            System.out.println("Çıkış '-1'giriniz");
            System.out.println("");
            secim = br.readLine();
            i++;
            if (i == konular.length) {
                System.out.println("konular bitti");
            }
        } while (i != konular.length && !secim.equals("-1"));
    }

}
