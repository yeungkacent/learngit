package db;
import java.sql.*;

public class Dbtry1 {
	@SuppressWarnings("unused")
	public static void main(String args[]){
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=test";
		String userName="sb";
		String userPwd="123";
		Connection dbConn=null;
	try{
		Class.forName(driverName);
		dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
		System.out.println("Connection Successful!");
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}