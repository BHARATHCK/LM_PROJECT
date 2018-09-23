package securityQues;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pojo.SecurityQuestion;

public class SecurityDAOImpl implements SecurityDAO {
	Connection conn;
	ResultSet rs;
	Statement st;
	PreparedStatement pst;
	
	public SecurityDAOImpl() {

		System.out.println("passwordDAOImpl.....");

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

	@Override
	public ArrayList<SecurityQuestion> getAllSecurityQuestion() {
		ArrayList<SecurityQuestion> questions = new ArrayList<SecurityQuestion>();
		try {
			// the real username password is stored as DATABASE ROW
			
			

			Statement pst = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from security_question");
			while(rs.next()) {
					SecurityQuestion obj = new SecurityQuestion();
					obj.setSec_id(rs.getInt(1));
					obj.setSec_ques(rs.getString(2));
					//System.out.println("==> "+obj);
					questions.add(obj);
					//System.out.println(rs.getString(2)+"==>"+obj.getSec_ques());
			}
			
			rs.close();
			pst.close();
			conn.close();

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
			return questions;
	}

}
