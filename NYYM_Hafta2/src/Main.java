
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        do {
            input = br.readLine();
            int indis = 0;
            String sekil = "";
            String sayi = "";
            for (int i = 0; i < input.length(); i++) {
                input.charAt(i);
                if (input.charAt(i) != ' ') {
                    sekil += input.charAt(i);
                } else {
                    indis = i + 1;
                    break;
                }
            }
            for (int j = indis; j < input.length(); j++) {
                sayi += input.charAt(j);
                System.out.println();
            }
            if (sekil.equals("kare")) {
                int kenar = Integer.parseInt(sayi);
                Kare kare = new Kare(kenar);
                System.out.println(kare.cevre() + " " + kare.alan());
            }
            if (sekil.equals("daire")) {
                int kenar = Integer.parseInt(sayi);
                Daire daire = new Daire(kenar);
                System.out.println(daire.cevre() + " " + daire.alan());
            }
            if (sekil.equals("ucgen")) {
                int indis2=0;
                int indis3=0;
                String k1="";
                String k2="";
                String k3="";
                for (int i = 0; i < sayi.length(); i++) {
                    sayi.charAt(i);
                    if (sayi.charAt(i) != ' ') {
                        k1 += sayi.charAt(i);
                    } else {
                        indis2=i+1;
                        break;
                    }
                }
                for (int i = indis2; i < sayi.length(); i++) {
                    sayi.charAt(i);
                    if (sayi.charAt(i) != ' ') {
                        k2 += sayi.charAt(i);
                    } else {
                        indis3=i+1;
                        break;
                    }
                }
                for (int i = indis3; i < sayi.length(); i++) {
                    sayi.charAt(i);
                    if (sayi.charAt(i) != ' ') {
                        k3+= sayi.charAt(i);
                    } else {
                        break;
                    }
                }
                int ke1=Integer.parseInt(k1);
                int ke2=Integer.parseInt(k2);
                int ke3=Integer.parseInt(k3);
                Ucgen ucgen=new Ucgen(ke1,ke2,ke3);
                System.out.println(ucgen.cevre() + " " + ucgen.alan());
                
            }
        } while (!input.equals("exit"));
    }

}
