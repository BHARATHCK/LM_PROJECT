package user;
import input.*;
import pojo.User;
import service.LoginService;

public class EndUser {
	public static void main(String[] args) {
		
		//accept values from the client via a menu selection
		/*String username = MyIOService.acceptString("Enter username:");
		String password = MyIOService.acceptString("Enter password:");
		int age = MyIOService.acceptNumber("Enter age :",1,100);
		String emailid = MyIOService.acceptString("Enter emailid :");   //a@@@b.@c
		String address  = MyIOService.acceptString("Enter address:");*/
		
	/*	User u = new User(); //a blank bean 
		
		//now fill up the bean
		u.setUsername(username);
		u.setPassword(password);
		u.setAge(age);
		u.setEmaild(emailid);
		u.setAddress(address);
		
		//invoke a service method for storing this object via the dao (chef)
		LoginService logService = new LoginService();
		logService.registerUser(u);
*/
		
		User u = new User(); //a blank bean
		String username = MyIOService.acceptString("Enter username:");
		String password = MyIOService.acceptString("New password:");
		u.setUsername(username);
		u.setPassword(password);
		
		LoginService logService = new LoginService();
		logService.updateUserPassword(u);
		
		
	}
}
