
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        do {
            Matematik mat = new Matematik();
            input = br.readLine();
            int indis = 0;
            String tip = "";
            String sayi = "";
            for (int i = 0; i < input.length(); i++) {
                input.charAt(i);
                if (input.charAt(i) != ' ') {
                    tip += input.charAt(i);
                } else {
                    indis = i + 1;
                    break;
                }
            }
            for (int j = indis; j < input.length(); j++) {
                sayi += input.charAt(j);
            }
            if (tip.equals("cikar")) {
                int indis2 = 0;
                int indis3 = 0;
                String k1 = "";
                String k2 = "";
                for (int i = 0; i < sayi.length(); i++) {
                    sayi.charAt(i);
                    if (sayi.charAt(i) != ' ') {
                        k1 += sayi.charAt(i);
                    } else {
                        indis2 = i + 1;
                        break;
                    }
                }
                for (int i = indis2; i < sayi.length(); i++) {
                    sayi.charAt(i);
                    if (sayi.charAt(i) != ' ') {
                        k2 += sayi.charAt(i);
                    } else {
                        indis3 = i + 1;
                        break;
                    }
                }
                int ke1 = Integer.parseInt(k1);
                int ke2 = Integer.parseInt(k2);
                mat = new Cıkarma(ke1, ke2);
                System.out.println(mat.hesapla());
            }
            if (tip.equals("bol")) {
                int indis2 = 0;
                int indis3 = 0;
                String k1 = "";
                String k2 = "";
                for (int i = 0; i < sayi.length(); i++) {
                    sayi.charAt(i);
                    if (sayi.charAt(i) != ' ') {
                        k1 += sayi.charAt(i);
                    } else {
                        indis2 = i + 1;
                        break;
                    }
                }
                for (int i = indis2; i < sayi.length(); i++) {
                    sayi.charAt(i);
                    if (sayi.charAt(i) != ' ') {
                        k2 += sayi.charAt(i);
                    } else {
                        indis3 = i + 1;
                        break;
                    }
                }
                int ke1 = Integer.parseInt(k1);
                int ke2 = Integer.parseInt(k2);
                mat = new Bolme(ke1, ke2);
                System.out.println(mat.hesapla());
            }
            if (tip.equals("topla")) {
                String k1 = null;
                int temp = 0;
                for (int i = 0; i < sayi.length(); i++) {
                    k1 = null;
                    if (sayi.charAt(i) != ' ') {
                        k1 = "";
                        k1 += sayi.charAt(i);
                        if (sayi.length() != i + 1 && sayi.charAt(i + 1) != ' ') {
                            k1 += sayi.charAt(i + 1);
                            i++;
                        }
                        mat = new Topla(Integer.parseInt(k1), temp);
                        temp = mat.hesapla();
                    }
                }
                System.out.println(temp);
            }
            if (tip.equals("carp")) {
                String k1 = null;
                int temp = 1;
                for (int i = 0; i < sayi.length(); i++) {
                    k1 = null;
                    if (sayi.charAt(i) != ' ') {
                        k1 = "";
                        k1 += sayi.charAt(i);
                        if (sayi.length() != i + 1 && sayi.charAt(i + 1) != ' ') {
                            k1 += sayi.charAt(i + 1);
                            i++;
                        }
                        mat = new Carpma(Integer.parseInt(k1), temp);
                        temp = mat.hesapla();
                    }
                }
                System.out.println(temp);
            }
        } while (!input.equals("exit"));
    }
}
