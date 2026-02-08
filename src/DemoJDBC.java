import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        /*
            1) Import package
            2) load and register
            3) create connection
            4) create statement
            5) execute querry
            6) process the result
            7) close the connection
         */

        String url = "jdbc:mysql://localhost:3306/demoJDBC";
        String user = "root";
        String password = "0000";
        String sql = "select stu_name from student where stu_id=2";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to database successfully");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        String name = rs.getString("stu_name");
        System.out.println("Name: " + name);

        con.close();
        System.out.println("Connection closed successfully");
    }
}
