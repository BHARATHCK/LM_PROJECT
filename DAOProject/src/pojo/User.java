package pojo; //plain old java object   

public class User {
	private String username;
	private String password;
	private int age ;
	private String emaild ;
	private String address;
	private String pnumber;
	private String answer;
	private int secID;
	
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
	public String getPString()
	{return pnumber;}
	
	public void setPString(String pnumber ) {
		this.pnumber = pnumber;
	}

	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public int getsecID() {
		return secID;
	}
	public void setsecID(int secid) {
		this.secID = secid;
	}
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password +  ", Mobile number=" + pnumber +  ", Security answer=" + answer+ ", SecID=" + secID+", age=" + age + ", emaild=" + emaild
				+ ", address=" + address + "]";
	}
	
	
}

	

