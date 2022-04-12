package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.entity.Books;
import com.bookstore.entity.Orders;
import com.bookstore.entity.User;
public class UserDao {
	private Connection con;

	public UserDao(Connection con) {
		this.con = con;
	}
//	method to insert in database
	public boolean saveUser(User user) {
		boolean f=false;

		try {
			String query="insert into users(first_name,address,email,user_name,password)values (?,?,?,?,?)";
			PreparedStatement pstmt	=this.con.prepareStatement(query);
			pstmt.setString(1,user.getFirst_name());
			pstmt.setString(2,user.getAddress());
			pstmt.setString(3,user.getEmail());
			pstmt.setString(4,user.getUser_name());
			pstmt.setString(5,user.getPassword());
			
			pstmt.executeUpdate();
			f=true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}
	public User getUserByUnameAndPassword(String user_name, String password) {
		User user=null;
		try {
			String query="select * from users where user_name=? and password=?";
			
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, user_name);
			psmt.setString(2, password);
			
			ResultSet set=psmt.executeQuery();
			
			if(set.next()) {
				user=new User();
				//data from db
				//user.setFirst_name(set.getString("fname"));
				//set to user object
				user.setAddress("address");
				user.setEmail(set.getString("email"));
				user.setUser_name(user_name);
				user.setPassword(set.getString("password"));
				//user.setRegdate(set.getTimestamp("rdate"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	public User resetPassword(String email, String user_name) {
		User user=null;
		try {
			String query="select * from users where email=? and user_name=?";
			
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, email);
			psmt.setString(2, user_name);
			
			ResultSet set=psmt.executeQuery();
			
			if(set.next()) {
				user=new User();
				//data from db
				//set to user object
				user.setEmail(set.getString("address"));
				user.setEmail(set.getString("email"));
				user.setUser_name(user_name);
				user.setPassword(set.getString("password"));
				user.setRegistration_date(set.getTimestamp("registration_date"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	public int setPassword(String pass) throws SQLException {
		
		
		String query="update users set password=? where user_name=?";
		User user=new User();
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setString(1, pass);
		psmt.setString(2,(user.getUser_name()));
		return psmt.executeUpdate();
	}
	
	public Books getBookDetailsById(String Book_id) throws SQLException {
		
		Books book=null;
		
		String query="Select * from books where book_id=?";
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setString(1,Book_id);
		ResultSet rs=psmt.executeQuery();
		while(rs.next()){
			book=new Books();
			book.setBook_Id(rs.getString(1));
			book.setBook_Name(rs.getString(2));
			book.setAuthor(rs.getString(3));
			book.setPrice(rs.getDouble(4));
			
		}
		
		return book;
		
	}
	public boolean order(Orders order) {
		boolean f=false;

		try {
			String query="insert into Order_Details(Address,Phone_No,Cust_Name,Quantity)values (?,?,?,?)";
			PreparedStatement pstmt	=this.con.prepareStatement(query);
			pstmt.setString(1,order.getAddress());
			pstmt.setInt(2,order.getPhone_No());
			pstmt.setString(3,order.getCust_Name());
			pstmt.setInt(4,order.getQuantity());
			
			pstmt.executeUpdate();
			f=true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}
}
