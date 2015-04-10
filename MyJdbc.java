import java.sql.*;
import javax.sql.*;

class MyJdbc
{
public static void main(String as[]) throws ClassNotFoundException
{	
try{ 
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection conn = null;
	conn = DriverManager.getConnection("jdbc:odbc:asd","root", "root");
	System.out.println("Done");
	Statement s=conn.createStatement();
	ResultSet rs=s.executeQuery("select * from employee");
	 while (rs.next()) {
          	 String id= rs.getString(1);
     	System.out.println(id);
	}
	conn.close();
}catch(SQLException e)
{
	e.printStackTrace();
}
}
}