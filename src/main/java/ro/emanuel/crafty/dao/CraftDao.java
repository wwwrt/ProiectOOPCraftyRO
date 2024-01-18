package ro.emanuel.crafty.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ro.emanuel.crafty.helper.*;
import ro.emanuel.crafty.pojo.*;


public class CraftDao {

	//get by id Buyers
	
	public static Buyers getBuyerById(int id) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry =  "select * from buyers where id=?";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Buyers b = new Buyers(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("email"));
			DBhelper.closeConnection();
			return b;
	}
		DBhelper.closeConnection();
		return null;
}
	
	//get by id Sellers
	
	public static Sellers getSellerById(int id) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry =  "select * from sellers where id=?";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Sellers s = new Sellers (rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("email"), rs.getString("grade"));
			DBhelper.closeConnection();
			return s;
	}
		DBhelper.closeConnection();
		return null;
}
	
	//get by id Crafts
	
	public static Crafts getCraftById(int id) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry =  "select * from crafts where id=?";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Crafts c = new Crafts(rs.getInt("id"), rs.getString("name"), rs.getInt("amount"), rs.getInt("price"), rs.getDate("manufactured"));
			DBhelper.closeConnection();
			return c;
	}
		DBhelper.closeConnection();
		return null;
}
	
	//-----------------------------------------
	
	
	//get all Buyers
	
	public static ArrayList<Buyers> allBuyers() throws SQLException{
		Connection con = DBhelper.getConnection();
		String querry = "select * from buyers";
		PreparedStatement ps=con.prepareStatement(querry);
		ResultSet rs = ps.executeQuery();
		ArrayList<Buyers> all = new ArrayList<Buyers>();
		
		while(rs.next()) {
			Buyers buyer = new Buyers(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("email"));
			
			all.add(buyer);
		}
		DBhelper.closeConnection();
		return all;
	}
	
	//get all Sellers
	
	public static ArrayList<Sellers> allSellers() throws SQLException{
		Connection con = DBhelper.getConnection();
		String querry = "select * from sellers";
		PreparedStatement ps=con.prepareStatement(querry);
		ResultSet rs = ps.executeQuery();
		ArrayList<Sellers> all = new ArrayList<Sellers>();
		
		while(rs.next()) {
			Sellers seller = new Sellers(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("email"), rs.getString("grade"));
			
			all.add(seller);
		}
		DBhelper.closeConnection();
		return all;
	}
	
	//get all Crafts
	
	public static ArrayList<Crafts> allCrafts() throws SQLException{
		Connection con = DBhelper.getConnection();
		String querry = "select * from crafts";
		PreparedStatement ps=con.prepareStatement(querry);
		ResultSet rs = ps.executeQuery();
		ArrayList<Crafts> all = new ArrayList<Crafts>();
		
		while(rs.next()) {
			Crafts craft = new Crafts(rs.getInt("id"), rs.getString("name"), rs.getInt("amount"), rs.getInt("price"), rs.getDate("manufactured"));
			
			all.add(craft);
		}
		DBhelper.closeConnection();
		return all;
	}
	
	//-----------------------------------------
	
	
	//delete Buyers
	
	public static void deleteBuyerById(int id) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry = "delete from buyers where id=?";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setInt(1, id);
		ps.executeUpdate();
		DBhelper.closeConnection();

	}
	
	//delete Sellers
	
	public static void deleteSellerById(int id) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry = "delete from sellers where id=?";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setInt(1, id);
		ps.executeUpdate();
		DBhelper.closeConnection();

	}
	
	//delete Crafts
	
	public static void deleteCraftById(int id) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry = "delete from crafts where id=?";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setInt(1, id);
		ps.executeUpdate();
		DBhelper.closeConnection();

	}
	
	//-----------------------------------------
	
	
	//create Buyers
	
	public static void createBuyer(Buyers buyer) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry = "insert into buyers(name, age, email) values (?,?,?) ";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setString(1, buyer.getName());
		ps.setInt(2, buyer.getAge());
		ps.setString(3, buyer.getEmail());
		ps.executeUpdate();
		DBhelper.closeConnection();
	}
	
	//create Sellers
	
	public static void createSeller(Sellers seller) throws SQLException {
		Connection con = DBhelper.getConnection();
		System.out.println(seller);
		String querry = "insert into sellers(name, age, email, grade) values (?,?,?,?) ";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setString(1, seller.getName());
		ps.setInt(2, seller.getAge());
		ps.setString(3, seller.getEmail());
		ps.setString(4, seller.getGrade());
		System.out.println(ps);
		ps.executeUpdate();
		DBhelper.closeConnection();
	}
	
	//create Crafts
	
	public static void createCraft(Crafts craft) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry = "insert into crafts(name, amount, price, manufactured) values (?,?,?,?) ";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setString(1, craft.getName());
		ps.setInt(2, craft.getAmount());
		ps.setInt(3, craft.getPrice());
		ps.setDate(4, craft.getManufactured());
		ps.executeUpdate();
		DBhelper.closeConnection();
	}
	
	//-----------------------------------------
	
	
	//edit Buyers
	
	public static void editBuyer(Buyers b) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry = "update buyer set name=?, age=?, email=? where id=?";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setString(1, b.getName());
		ps.setInt(2, b.getAge());
		ps.setString(3, b.getEmail());
		ps.setInt(4, b.getId());
		ps.executeUpdate();
		DBhelper.closeConnection();
	}
	
	//edit Sellers
	
	public static void editSeller(Sellers s) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry = "update seller set name=?, age=?, email=?, grade=? where id=?";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setString(1, s.getName());
		ps.setInt(2, s.getAge());
		ps.setString(3, s.getEmail());
		ps.setString(4, s.getGrade());
		ps.setInt(5, s.getId());
		ps.executeUpdate();
		DBhelper.closeConnection();
	}
	
	//edit Crafts
	
	public static void editCraft(Crafts c) throws SQLException {
		Connection con = DBhelper.getConnection();
		String querry = "update craft set name=?, amount=?, price=?, manufactured=? where id=?";
		PreparedStatement ps=con.prepareStatement(querry);
		ps.setString(1, c.getName());
		ps.setInt(2, c.getAmount());
		ps.setInt(3, c.getPrice());
		ps.setDate(4, c.getManufactured());
		ps.setInt(5, c.getId());
		ps.executeUpdate();
		DBhelper.closeConnection();
	}
}
