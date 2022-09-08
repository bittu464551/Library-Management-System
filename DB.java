package librarymanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			/*con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","","");*/
                       // con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","","");
                        con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-52HGP11F:1521:XE","kamlendra","gour");
		}catch(SQLException e){System.out.println(e);}
		return con;
	}

}
