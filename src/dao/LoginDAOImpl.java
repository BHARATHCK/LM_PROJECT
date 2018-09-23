package dao;
import securityQues.SecurityDAO;
import securityQues.SecurityDAOImpl;
import sun.security.util.Password;

import java.sql.*;
import java.util.ArrayList;

import input.MyIOService;
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

	/*service layer User u = new User(); u.setUsername("Suresh");
	u.setPassword("sur");
	LoginDAOImpl l = new LoginDAOImpl();
	l.createUser(u);*/

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
			pst.setString(5, u.getPnumber());
			pst.setString(6, u.getPassword());
			pst.setInt    (7,u.getQuestionId());
			pst.setString(8, u.getSecuredAnswer());

			int row = pst.executeUpdate();
			System.out.println(row + "  user is created..");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String findSAllecurityQuestions() {
		String question=null;	
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("select question from security_question");
			if(rs.next()) {
				//Ques_no = rs.getString(2);
				question = rs.getString(2);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return question;
	}
	
	public String findSecurityQuestion(int qid) {
		String question=null;
			
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("select question from security_question where sec_id="+qid);
			if(rs.next()) {
				question = rs.getString(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return question;
	}
	
	public User readUser(User u) { // this u contains teh username password entered by KEYBOARD  - thenali  pqr
		User temp = null;
		boolean userFound=false;
		try {
														// the real username password is stored as DATABASE ROW
			Statement pst = conn.createStatement();
			ResultSet rs = pst.executeQuery("select * from user_details where name="+"'"+u.getUsername()+"'"+" and password="+"'"+u.getPassword()+"'");
			//System.out.println("select * from user_details where name="+"'"+u.getUsername()+"'"+" and password="+"'"+u.getPassword()+"'");
			if(rs.next()) {
				temp = new User();
				System.out.println("User Found");
				
				temp.setUsername(rs.getString(3));
				temp.setPassword(rs.getString(6));
				//temp.set
				//temp.setAge(rs.getInt(3));
				temp.setQuestionId(rs.getInt(7));
				temp.setSecuredAnswer(rs.getString(8));
				temp.setPnumber(rs.getString(5));
				temp.setUsername(rs.getString(2));
				temp.setEmaild(rs.getString(3));
				temp.setAddress(rs.getString(4));
				userFound=true;
			}
			else {
				System.out.println("User not found....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(userFound==true)
		{
		return temp;
		}
		else {
			return null;
	}}

	public User readUserToKnowSecurityDetails(String userName) { // this u contains teh username password entered by KEYBOARD  - thenali  pqr
		User temp = null;
		boolean userFound=false;
		try {
														// the real username password is stored as DATABASE ROW
			Statement pst = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from user_details where name="+"'"+userName+"'");
			if(rs.next()) {
				temp = new User();
				System.out.println("User Found");
				
				temp.setUsername(rs.getString(2));
				temp.setEmaild(rs.getString(3));
				temp.setAddress(rs.getString(4));
				temp.setAddress(rs.getString(5));
				temp.setPnumber(rs.getString(6));
				temp.setQuestionId(rs.getInt(7));
				temp.setSecuredAnswer(rs.getString(8));
				
				userFound=true;
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

	
	
	
	public User readUserToKnowoldpassword(String Password) { // this u contains teh username password entered by KEYBOARD  - thenali  pqr
		User temp = null;
		boolean userFound=false;
		try {
														// the real username password is stored as DATABASE ROW
			Statement pst = conn.createStatement();
			ResultSet rs = st.executeQuery("select password from user_details where password="+"'"+Password+"'");
			if(rs.next()) {
				temp = new User();
				System.out.println("User Found");
				
				
				temp.setPassword(rs.getString(6));
				
			    /*temp.setPassword(rs.getString(6));
				temp.setUsername(rs.getString(2));
				temp.setEmaild(rs.getString(3));
				temp.setAddress(rs.getString(4));
				temp.setAddress(rs.getString(5));
				temp.setPnumber(rs.getString(6));
				temp.setQuestionId(rs.getInt(7));
				temp.setSecuredAnswer(rs.getString(8));*/
				userFound=true;
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
	public User readUserforLogin(User u) {
		User temp = null;
		boolean userFound=false;
		try {
			Statement pst = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from user_details where username="+"'"+u.getUsername()+"'"+" and password="+"'"+u.getPassword()+"'");
			if(rs.next()) {
				temp = new User();
				System.out.println("User Found");
				
				temp.setUsername(rs.getString(2));
				temp.setEmaild(rs.getString(3));
				temp.setAddress(rs.getString(4));
				temp.setAddress(rs.getString(5));
				temp.setPnumber(rs.getString(6));
				userFound=true;
			}
			/*else {
				System.out.println("User not found....");
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(userFound==true)
		return temp;
		else 
			return null;
	}
	
public User readUserforResetPassword(User u) {
		
		User temp = null;
		boolean userFound=false;
		try {
			Statement pst = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from user_details where name="+"'"+u.getUsername()+"'");
			if(rs.next()) {
				temp = new User();
				System.out.println("User Found");
				temp.setUsername(rs.getString(2));
				temp.setPassword(rs.getString(6));
				//temp.setAge(rs.getInt(3));
				temp.setEmaild(rs.getString(3));
				temp.setAddress(rs.getString(5));
				userFound=true;
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
			if(row==1)
			{
			System.out.println(row + "  user is modified..");
			System.out.println("password changed");
			}
			else
			{
				System.out.println(row + "  user is modified..");
				System.out.println("Not allowed to change password....user not found");
			}
			pst.close();
			conn.close();

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
