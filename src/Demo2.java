import java.sql.*;

public class Demo2 {
    public static void main(String[] args)throws Exception {

        String url = "jdbc:mysql://localhost:3306/demoJDBC";
        String user = "root";
        String password = "0000";
        String sql = "select * from student";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user,password);
        System.out.println("Connected to database successfully");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sql);
       while(rs.next()){
           System.out.print(rs.getInt(1) + " - " );
           System.out.print(rs.getString(2) +" - " );
           System.out.println(rs.getInt(3)+"  ");
       }

        con.close();
        System.out.println("Connection closed");
    }
}
