package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	public void insert(Bean b) throws SQLException
	{
		Connection con=DBUtil.DBConnection();
		String sql = "INSERT INTO sm (itemname, quantity, expirydate, cost) VALUES (?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, b.getItemName());
		statement.setInt(2, b.getQuantity());
		statement.setString(3, b.getExpirydate());
		statement.setFloat(4, b.getCost());
		int rows = statement.executeUpdate();
		if(rows>0) {
			System.out.println("a row has been inserted");
		}
		statement.close();
		con.close();
	}
	
    public void Display() throws SQLException {
    	Connection con=DBUtil.DBConnection();
    	String sql = "SELECT * FROM sm";
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(sql);
		int count = 0;
		float total=0;
		while(result.next())
		{
			String n= result.getString("itemname");
			int q=result.getInt("quantity");
			String e= result.getString("expirydate");
			float c = result.getFloat("cost");
			count++;
			total=total+(c*q);
			System.out.println("item "+ count +":"+"Item Name : "+ n +" Quantity :"+q+" Expiry Date : "+e+" cost of item :"+ c);
		}
		System.out.println("total cost : "+total);
		statement.close();
		con.close();
    }
}
