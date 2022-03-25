package pert4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class dbConnection {

	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
	
	public dbConnection() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kelasf","root","");
			st = con.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			st.executeQuery("Select * from user");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void insertuser(String username, String password, String addressId) {
		try {
			ps =  con.prepareStatement("insert into user values (?,?,?,?);");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, null);
			ps.setString(4, addressId);
			ps.execute();
		System.out.println("Berhasil");
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println("Gagal");
			e.printStackTrace();
		}
	}
	
	public ResultSet selectalluser() {
		try {
			ps = con.prepareStatement("Select * from user");
			rs = ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return rs;
	}
	
	public ResultSet selectuser(String username, String password) {
		// TODO Auto-generated method stub
		try {
			//Contoh pake statement tapi disarankan jika ada mengandalkan inputan user, untuk menghidari
			//sql injection
//			rs = st.executeQuery("select * from user where username = '"+ username +"' and password = '" + password + "'"); //+ " password = " + password);
			ps = con.prepareStatement("select * from user where username = ? and password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
//			ps.execute();
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void updateUser(String username, String password, int userID) {
		
		try {
			ps = con.prepareStatement("update user set username = ?, password = ? where userID = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setInt(3, userID);
			ps.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Gagal");
		}
	}
	
	public void deleteAddress(String AddressId) {
		try {
			ps = con.prepareStatement("Delete from address where addressId = ?");
			ps.setString(1, AddressId);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Vector<String> getIduser() {
		Vector<String> id = new Vector<String>();
		
		try {
			ps = con.prepareStatement("Select USERID from user");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				id.add(rs.getObject(1).toString());
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return id;
	}
	
	public void getDatauser(String id) {
		try {
			ps = con.prepareStatement("Select USERNAME,PASSWORD from user where USERID = ?");
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getObject(1));				
				System.out.println(rs.getObject(2));				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
