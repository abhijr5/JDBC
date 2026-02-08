import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo3 {
    public static void main(String[] args)throws Exception {

        String url = "jdbc:mysql://localhost:3306/demoJDBC";
        String user = "root";
        String password = "0000";
        //String sql = "insert into student values (5,'Kanhiya', 48)";
        //String Updatesql = "update student set stu_name = 'YoYo' where stu_id = 5";
        String Deletesql = "delete from student where stu_id = 5";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user,password);
        System.out.println("Connected to database successfully");

        Statement stmt = con.createStatement();
        boolean status = stmt.execute(Deletesql);
        System.out.println("SQL statement successfully " + status);


        con.close();
        System.out.println("Connection closed");
    }
}
