
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

 
public class Main {
    public static void main(String[] args) {
        try {
            Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","root");
            Statement st=(Statement) conn.createStatement();
            ResultSet rs=st.executeQuery("select * from actor");
            while (rs.next()) {                
                System.out.println(rs.getString("first_name"));
            }
        } catch (Exception e) {
            System.out.println("Baglantı hataası");
            e.printStackTrace();
        }
    }
}
