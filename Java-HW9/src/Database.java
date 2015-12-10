import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;

/*
* Write a Java program that tries to make a connection with a database and 
* pull records from a table. Keep it simple. Just do a 'select * from 
* table_name'. This assignment is mainly getting the program to connect with 
* a database, not fancy SQL queries.
 */

public class Database {

	public static void main(String[] args) throws Throwable {
		
		Enumeration<Driver> ed = DriverManager.getDrivers();
		while(ed.hasMoreElements()){
			System.out.println((Driver)ed.nextElement());
		}
		
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "oop12");
		
		Statement my_st = myConnection.createStatement();
		ResultSet myResults = my_st.executeQuery("select * from sakila.address");

		while (myResults.next()) {
			System.out.println(myResults.getString("address"));
		}
		
	}

}