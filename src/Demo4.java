import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Demo4 {
    public static void main(String[] args)throws Exception {

        String url = "jdbc:mysql://localhost:3306/demoJDBC";
        String user = "root";
        String password = "0000";
        String sql = "insert into student values(?,?,?)";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user,password);
        System.out.println("Connected to database successfully");

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,5);
        stmt.setString(2,Amit);
        stmt.setInt(3,55);

        stmt.execute();

        con.close();
        System.out.println("Connection closed");
    }
}
