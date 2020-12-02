import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Db {
	public static void main(String args[]) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SE", "root", "huyitian03");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM people WHERE status=1");
		
		while(rs.next()){
            System.out.println(rs.getString("name")+" 年龄："+rs.getInt("age"));
        }
		
		stmt.close();
		conn.close();           
		System.out.println("query success");
	}
}