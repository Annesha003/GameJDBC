import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseRepositries {
	
	
	//This is insert data method
	public void addPlayer(  int Playerno, String Playername, String Weapon,  String Armour,int Health){
		
		String insertQuery ="INSERT INTO GAMEPROJECT(Playerno,Playername,Weapon,Armour,Health)  VALUES('1','Annesha','Machinegun','no','90')";
		
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			stmt.executeUpdate(insertQuery);
			
			System.out.println(" 1 Record Inserted in table");
			

		} catch (Exception e) 
		
		{
			System.out.println(e);
		}
	
	}
	
	
	//This method return all the data in database
	public void showData() {
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("Select  * from GameProject");
			
			while (rs.next())
				
			System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+" "+rs.getString(3)+"  "+rs.getString(4)+" "+rs.getString(5));

			// step5 close the connection object
			con.close();

		} catch (Exception e) 
		
		{
			System.out.println(e);
		}
	}
}