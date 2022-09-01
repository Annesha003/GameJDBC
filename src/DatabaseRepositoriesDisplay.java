import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseRepositoriesDisplay {
	public void addPlayer2(int ID, int Playerno, String Playername, String Weapon,  String Armour,int Health){
		
	try {
		// step1 load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "admin");

		// step3 create the statement object
		Statement stmt = con.createStatement();

		// step4 execute query
		ResultSet rs = stmt.executeQuery("Select  * from  GameProject where ID='35' ");
		
		while (rs.next())
			
			System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getString(4)+"  "+rs.getString(5)+" "+rs.getString(6));

		// step5 close the connection object
		con.close();

	} catch (Exception e) 
	
	{
		System.out.println(e);
	}
}




}



