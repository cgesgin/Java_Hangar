 
package dosya_ıslemleri;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosya_Islemleri {

    
    public static void main(String[] args) throws IOException {
        
        File file=new File("Test.txt");
        
        if(!file.exists())
        {
            file.createNewFile();
        }
        
        System.out.println("Bir kelime giriniz : ");
        Scanner scan =new Scanner(System.in);
        String kelime=scan.nextLine();
        
       FileWriter fw=new FileWriter(file,false);
       BufferedWriter bw=new BufferedWriter(fw);
       bw.write(kelime);
       bw.close();
       
       FileReader fr=new FileReader(file);
       String oku;
       BufferedReader br =new BufferedReader(fr);
       
       while((oku=br.readLine())!=null){
           System.out.println(oku);
       }
       br.close();
    }
    
}
