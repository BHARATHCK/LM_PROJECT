package pojo; //plain old java object   

import java.sql.Date;

public class User {
	private int UserID;
	private String username;
	private String password;
	private int age ;
	private String emaild ;
	private String address;
	private int questionId;
	private String securedAnswer;
	//private int secID;
	private String pnumber;
	private String AnnualSalary;
	private String OrganizationAddress;
	private String OrganizationName;
	private String Designation;
	private String Occupation;
	private String TelephoneNumber;
	private String Nationality;
	private String Pincode;
	private String PermanentAddress;
	private String ConstOfBorrower;
	private String VoterNumber;
	private String PanNumber;
	private String AadhaarNumber;
	private Date DOB;
	private String Gender;
	private String Borrowername;
	public Date sqlDate;
	
	
	
	public String getPnumber() {
		return pnumber;
	}
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getSecuredAnswer() {
		return securedAnswer;
	}
	public void setSecuredAnswer(String securedAnswer) {
		this.securedAnswer = securedAnswer;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmaild() {
		return emaild;
	}
	public void setEmaild(String emaild) {
		this.emaild = emaild;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + ", emaild=" + emaild
				+ ", address=" + address + "]";
	}
	public int getUserID() {
		// TODO Auto-generated method stub
		return UserID;
	}
	public String getBorrowername() {
		// TODO Auto-generated method stub
		return Borrowername;
	}
	public String getGender() {
		// TODO Auto-generated method stub
		return Gender;
	}
	public Date getDOB() {
		// TODO Auto-generated method stub
		return DOB;
	}
	public String getAadhaarNumber() {
		// TODO Auto-generated method stub
		return AadhaarNumber;
	}
	public String getPanNumber() {
		// TODO Auto-generated method stub
		return PanNumber;
	}
	public String getVoterNumber() {
		// TODO Auto-generated method stub
		return VoterNumber;
	}
	public String getConstOfBorrower() {
		// TODO Auto-generated method stub
		return ConstOfBorrower;
	}
	public String getPermanentAddress() {
		// TODO Auto-generated method stub
		return PermanentAddress;
	}
	public String getPincode() {
		// TODO Auto-generated method stub
		return Pincode;
	}
	public String getNationality() {
		// TODO Auto-generated method stub
		return Nationality;
	}
	public String getTelephoneNumber() {
		// TODO Auto-generated method stub
		return TelephoneNumber;
	}
	public String getOccupation() {
		// TODO Auto-generated method stub
		return Occupation;
	}
	public String getDesignation() {
		// TODO Auto-generated method stub
		return Designation;
	}
	public String getOrganizationName() {
		// TODO Auto-generated method stub
		return OrganizationName;
	}
	public String getOrganizationAddress() {
		// TODO Auto-generated method stub
		return OrganizationAddress;
	}
	public String getAnnualSalary() {
		// TODO Auto-generated method stub
		return AnnualSalary;
	}
	public void setBorrowername(String borrowername2) {
		// TODO Auto-generated method stub
		this.Borrowername=borrowername2;
	}
	public void setGender(String gender2) {
		// TODO Auto-generated method stub
		this.Gender=gender2;
	}
	public Date setDOB(Date dOB2) {
		return this.DOB=dOB2;
	}
	public void setAadhaarNumber(String aadhaarNumber2) {
		// TODO Auto-generated method stub
		this.AadhaarNumber=aadhaarNumber2;
	}
	public void setPanNumber(String panNumber2) {
		// TODO Auto-generated method stub
		this.PanNumber=panNumber2;
	}
	public void setVoterNumber(String voterNumber2) {
		// TODO Auto-generated method stub
		this.VoterNumber=voterNumber2;
	}
	public void setConstOfBorrower(String constOfBorrower2) {
		// TODO Auto-generated method stub
		this.ConstOfBorrower=constOfBorrower2;
	}
	public void setPermanentAddress(String permanentAddress2) {
		// TODO Auto-generated method stub
		this.PermanentAddress=permanentAddress2;
	}
	public void setNationality(String nationality2) {
		// TODO Auto-generated method stub
		this.Nationality=nationality2;
	}
	public void setPincode(String pincode2) {
		// TODO Auto-generated method stub
		this.Pincode=pincode2;
	}
	public void setTelephoneNumber(String telephoneNumber2) {
		// TODO Auto-generated method stub
		this.TelephoneNumber=telephoneNumber2;
	}
	public void setOccupation(String occupation2) {
		// TODO Auto-generated method stub
		this.Occupation=occupation2;
	}
	public void setDesignation(String designation2) {
		// TODO Auto-generated method stub
		this.Designation=designation2;
	}
	public void setOrganizationName(String organizationName2) {
		// TODO Auto-generated method stub
		this.OrganizationName=organizationName2;
	}
	
	
	public void setOrganizationAddress(String organizationAddress2) {
		// TODO Auto-generated method stub
		this.OrganizationAddress=organizationAddress2;
		
	}
	public void setAnnualSalary(String annualSalary2) {
		// TODO Auto-generated method stub
		this.AnnualSalary=annualSalary2;
		
	}
	public void setUserID(int userID2) { 
		// TODO Auto-generated method stub
		this.UserID=userID2;
		
	}
	
	
	
}

	

