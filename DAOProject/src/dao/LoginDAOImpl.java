
package dao;

import java.sql.*;
import java.util.ArrayList;

import pojo.User;

public class LoginDAOImpl implements LoginDAO {

	Connection conn;
	ResultSet rs;
	Statement st;
	PreparedStatement pst;

	public LoginDAOImpl() {

		System.out.println("LoginDAOImpl.....");

		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver registered...");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Newuser123");
			System.out.println("connected ..." + conn);

			st = conn.createStatement();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// service layer User u = new User(); u.setUsername("Suresh");
	// u.setPassword("sur");
	// LoginDAOImpl l = new LoginDAOImpl();
	// l.createUser(u);

	@Override
	public void createUser(User u) {
		int id=0;

		try {
			Statement st = conn.createStatement();
			ResultSet rs=st.executeQuery("select user_id.nextval from dual");
			while(rs.next())
			{
				
				id=rs.getInt(1);
			}
			PreparedStatement pst = conn.prepareStatement("insert into user_details values (?,?,?,?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, u.getUsername());
			pst.setString(3, u.getEmaild());
			pst.setString(4, u.getAddress());
			pst.setString(5, u.getPString());
			pst.setString(6, u.getPassword());
			pst.setInt(7,u.getsecID());
			pst.setString(8, u.getAnswer());

			int row = pst.executeUpdate();
			System.out.println(row + "  user is created..");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public User readUser(User u) { // this u contains teh username password entered by KEYBOARD  - thenali  pqr
		User temp = null;
		boolean userFound=false;
		try {
														// the real username password is stored as DATABASE ROW
			Statement pst = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from user_details where email="+"'"+u.getEmaild()+"'"+" and password="+"'"+u.getPassword()+"'");
			if(rs.next()) {
				temp = new User();
				System.out.println("User Found");
				
				temp.setUsername(rs.getString(1));
				temp.setPassword(rs.getString(2));
				temp.setAge(rs.getInt(3));
				temp.setEmaild(rs.getString(4));
				temp.setAddress(rs.getString(5));
				//temp.setPString(rs.pNumber);
				userFound=true;
				/*
				u.setEmaild(emailid);
				u.setAddress(address);
				u.setPString(pNumber);
				u.setsecID(secID);
				u.setAnswer(answer);*/
				
			}
			else {
				System.out.println("User not found....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(userFound==true)
		return temp;
		else 
			return null;
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = conn.prepareStatement("update user_details set password=? where name=?");

			pst.setString(1, u.getPassword());
			pst.setString(2, u.getUsername());

			int row = pst.executeUpdate();
			System.out.println(row + "  user is modified..");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<User> readAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
