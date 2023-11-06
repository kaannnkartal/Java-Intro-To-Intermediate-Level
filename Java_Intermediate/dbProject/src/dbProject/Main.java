package dbProject;

import java.sql.*;
public class Main {

	public static void main(String[] args) throws SQLException {
	
		Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3325/car?user=root&password=12345");
		
		Statement st = c.createStatement();
		
		
		
		String query = "INSERT INTO cars (cars_name, cars_speed) VALUES ('Mercedes',100)";
		
		int sonuc = st.executeUpdate(query);
		System.out.println(sonuc);
		//st.close();
		 
	
		String q = "INSERT INTO cars (cars_name, cars_speed) VALUES (?,?)";
		PreparedStatement pt = c.prepareStatement(q);
		
		pt.setString(1,"Tofas");
		pt.setInt(2, 100);
		
		pt.executeUpdate();
		
		
		
		ResultSet rs = st.executeQuery("SELECT * FROM cars");
		
		while(rs.next()) {
			System.out.println(rs.getInt("cars_id") +" - " +  rs.getString("cars_name") + " - " + rs.getInt("cars_speed"));
		}
		

	}

}
