package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		 String databaseURL = "jdbc:ucanaccess://C:\\Users\\dshakil\\Desktop\\Java-ITManu\\training1.accdb";
		 Connection con=DriverManager.getConnection(databaseURL);
		 
		 Statement st=con.createStatement();
		 
		 String query="SELECT * FROM USER";
		 
		 ResultSet rs=st.executeQuery(query);
		 
		 while(rs.next() ) {
			 System.out.println(rs.getString(1)+"    "+rs.getString(2));
		 }
		 
		 rs.close();
		 con.close();
		 
		 
		
		
	}

}
