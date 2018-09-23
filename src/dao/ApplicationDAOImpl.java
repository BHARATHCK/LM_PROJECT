package dao;
import securityQues.SecurityDAO;
import securityQues.SecurityDAOImpl;
import sun.security.util.Password;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import input.MyIOService;
import pojo.User;



public class ApplicationDAOImpl implements ApplicationDAO {

	Connection conn;
	ResultSet rs;
	Statement st;
	PreparedStatement pst;

	public ApplicationDAOImpl() {

		System.out.println("ApplicationDAOImpl.....");

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

	public void createApplication(User u) {

		
		int id=0;
		int id1=0;
		

		try {
			
			/*SimpleDateFormat format = new SimpleDateFormat( "MM/dd/yyyy" ); 
			java.util.Date myDate;
			try {
				myDate = format.parse( "10/10/2009" );
			} catch (ParseException e1) {
			
				e1.printStackTrace();
			}  */
			Statement st = conn.createStatement();
			ResultSet rs=st.executeQuery("select application_id.nextval from dual");
			ResultSet rs1=st.executeQuery("select loan_id.nextval from dual");
			while(rs.next())
			{
				
				id=rs.getInt(1);
				//id1=rs.getInt(3);
			}
			
			while(rs1.next())
			{
				
				id1=rs1.getInt(1);
			}
			
			
			
			
			//-------------------------REFERENCE---------------------------------------------
			/*create table loan_application(
					1 application_id varchar2(10) constraint app_pk primary key,
					2 user_id varchar2(10) constraint user_fk references user_details(user_id), 
					3 loan_id number constraint loan_fk references loan_details(loan_id),
					4 name_of_borrower varchar2(25),
					5 gender varchar(5) constraint gender_ck check(gender in('M','F')),
					6 dob date not null, 
					7 aadhaar_number number constraint adhar_uk unique not null,
					8 pan_card varchar2(10) constraint pan_uk unique,
					9 voter_id varchar2(10) constraint voter_uk unique,
					10 constitution_of_borrower varchar2(25) not null,
					11 permanent_address varchar2(40) not null,
					12 nationality varchar2(10) not null,
					13 pincode number constraint pin_ck check(length(pincode)=10),
					14 telephone_number number constraint tele_uk unique not null,
					15 occupation varchar2(20) not null,
					16 designation varchar2(20) not null,
					17 organization_name varchar2(25) not null,
					18 organization_address varchar2(30) not null,
					19 annual_salary number not null);*/
			
			//-------------------------END---------------------------------------------------
			
			
			
			
			PreparedStatement pst = conn.prepareStatement("insert into loan_application values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			//java.sql.Date sqlDate = new java.sql.Date( myDate.getTime() );
			pst.setInt(1, id);
			pst.setInt(2, u.getUserID());
			pst.setInt(3, id1);
			pst.setString(4,  u.getBorrowername());
			pst.setString(5,  u.getGender());
			pst.setDate (6,  u.getDOB());
			//pst.setDate( 6,   u.sqlDate ); 
			pst.setString(7,  u.getAadhaarNumber());
			pst.setString(8,  u.getPanNumber());
			pst.setString(9,  u.getVoterNumber());
			pst.setString(10, u.getConstOfBorrower());
			pst.setString(11, u.getPermanentAddress());
			pst.setString(12, u.getNationality());
			pst.setString(13, u.getPincode());
			pst.setString(14, u.getTelephoneNumber());
			pst.setString(15, u.getOccupation());
			pst.setString(16, u.getDesignation());
			pst.setString(17, u.getOrganizationName());
			pst.setString(18, u.getOrganizationAddress());
			pst.setString(19, u.getAnnualSalary());
			

			int row = pst.executeUpdate();
			System.out.println(row + "  user is created..");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public User readUserforLogin(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserforResetPassword(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateApplication(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteApplication(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<User> readAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}