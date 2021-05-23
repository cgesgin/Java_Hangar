
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
       
        ArrayList<Integer> rastgele = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            rastgele.add(new Integer(i));
        }
        Collections.shuffle(rastgele);
        for(int i = 0; i < 3; i++){
            System.out.println(rastgele.get(i));
        }
    }

}
