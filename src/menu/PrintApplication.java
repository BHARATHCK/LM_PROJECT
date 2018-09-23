package menu;
import input.*;
import dao.LoginDAOImpl.*;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import input.MyIOService;
import pojo.SecurityQuestion;
import pojo.User;
import service.LoginService;




public class PrintApplication {
	
	
	 public PrintApplication() throws ParseException
	 
	 
	 {
		
		
		LoginService logService = new LoginService();
	
	System.out.println("L O A N  A P P L I C A T I O N");
	
	
	/*
	pst.setInt(1, id);
	//pst.setInt(2, id);
	pst.setInt(2, u.getUserID());
	pst.setInt(3, id1);
	pst.setString(4,  u.getBorrowername());
	pst.setString(5,  u.getGender());
	pst.setDate  (6,  u.getDOB());
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
	pst.setString(19, u.getAnnualSalary());*/
	
	int UserID = MyIOService.acceptNumber("Enter user ID: ");
	String Borrowername = MyIOService.acceptString("Enter Borrower name:");
	String Gender = MyIOService.acceptString("Enter Gender [M/F]:");
	java.util.Date DOB=MyIOService.acceptDstring("Enter the DOB [yyyy-MM-dd] : ");
	//int age = MyIOService.acceptNumber("Enter age :",1,100);
	String AadhaarNumber = MyIOService.acceptString("Enter Aadhaar number :");
	String PanNumber = MyIOService.acceptString("Enter PAN number :");   //a@@@b.@c
	String VoterNumber  = MyIOService.acceptString("Enter Voter's id number:");
	String ConstOfBorrower= MyIOService.acceptString("Constitution of the borrower:");
	String PermanentAddress= MyIOService.acceptString("Enter permanent address:");
	String Nationality= MyIOService.acceptString("Enter Nationality:");
	String Pincode= MyIOService.acceptString("Enter Pincode:");
	String TelephoneNumber= MyIOService.acceptString("Enter Telephone number:");
	String Occupation= MyIOService.acceptString("Enter Occupation:");
	String Designation= MyIOService.acceptString("Enter Designation:");
	String OrganizationName= MyIOService.acceptString("Enter Organization Name:");
	String OrganizationAddress= MyIOService.acceptString("Enter Organization Address:");
	String AnnualSalary= MyIOService.acceptString("Enter Annual Salary:");
	//String Occupation= MyIOService.acceptString("Enter address:");
	
	
	
	User u = new User(); //a blank bean
	//now fill up the bean
	//-------------------------REF-------------------------------------
	/*u.setUsername(username1);
	u.setPassword(password2);
	//u.setAge(age);
	u.setEmaild(emailid);
	u.setAddress(address);
	u.setPnumber(pNumber);
	u.setQuestionId(secID);
	u.setSecuredAnswer(answer);*/
	//-------------------------REF-------------------------------------
	
	
	u.setUserID(UserID);
	u.setBorrowername(Borrowername);
	u.setGender(Gender);
	u.setDOB((Date) DOB);
	u.setAadhaarNumber(AadhaarNumber);
	u.setPanNumber(PanNumber);
	u.setVoterNumber(VoterNumber);
	u.setConstOfBorrower(ConstOfBorrower);
	u.setPermanentAddress(PermanentAddress);
	u.setNationality(Nationality);
	u.setPincode(Pincode);
	u.setTelephoneNumber(TelephoneNumber);
	u.setOccupation(Occupation);
	u.setDesignation(Designation);
	u.setOrganizationName(OrganizationName);
    u.setOrganizationAddress(OrganizationAddress);
	u.setAnnualSalary(AnnualSalary);



	//invoke a service method for storing this object via the dao (chef)

	logService.applyforLoan(u);
	System.out.println("Press ENTER key....");
	try {
		System.in.read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
