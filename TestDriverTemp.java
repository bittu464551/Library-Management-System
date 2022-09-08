package librarymanagement;
import java.sql.*;
public class TestDriverTemp {
    public static void main(String[] args) throws Exception{
        //Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-52HGP11F:1521:XE","kamlendra","raisen");
        Statement st;
        st = con.createStatement();
        st.executeUpdate("Create table students5(eno number(10))");
        System.out.println("Table Create Successfully");
        con.close();
    }
}