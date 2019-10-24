package com.ford;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection()throws Exception {
		 Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		 String databaseURL = "jdbc:ucanaccess://C:\\Users\\dshakil\\Desktop\\Java-ITManu\\training1.accdb";
		 return DriverManager.getConnection(databaseURL);
	}
}
