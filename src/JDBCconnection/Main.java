package JDBCconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3000/gtu","root","pdw");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from *");


            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t");
                System.out.println(rs.getInt("Name")+"\t");
                System.out.println(rs.getString(3));

            }

            stmt.close();
            conn.close();

        }catch (Exception e){
            System.out.println(e.toString());

        }
    }
}
