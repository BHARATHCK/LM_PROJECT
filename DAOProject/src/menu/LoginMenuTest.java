package menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import input.MyIOService;
import pojo.User;
import service.LoginService;

public class LoginMenuTest {
	public static void main(String[] args) {
		
		MyMenu loginMenu = new MyMenu("Login Menu");
		
		MyMenuItem loginMenuItem1 = new MyMenuItem("1. Sign-In (Login)");
		MyMenuItem loginMenuItem2 = new MyMenuItem("2. Sign-Up (Register)");
		MyMenuItem loginMenuItem3 = new MyMenuItem("3. Forgot Password");
		MyMenuItem loginMenuItem4 = new MyMenuItem("4. Reset Password");
		
				
		loginMenu.addMenuItem(loginMenuItem1);
		loginMenu.addMenuItem(loginMenuItem2);
		loginMenu.addMenuItem(loginMenuItem3);
		loginMenu.addMenuItem(loginMenuItem4);
		
		int choice=0;

		do
		{
			try
			{
				//Runtime.getRuntime().exec("calc");
				//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

				LoginService logService = new LoginService();
				
				loginMenu.showMenu();
				choice = MyIOService.acceptNumber("Enter choice : ",1, (loginMenu.menuItemList.size()+1));
				
					switch(choice) {
						case 1:	System.out.println("U s e r     L o g i n "); 
										String username = MyIOService.acceptString("Enter username:");
										String password = MyIOService.acceptString("Enter password:");
										User t = new User();
										t.setUsername(username);
										t.setPassword(password);
										
										User t1 = logService.findUser(t);
										System.out.println("User details are : "+t1);
										break;
						
						case  2:	System.out.println("U s e r     R e g i s t r a t i o n");
										
										String username1 = MyIOService.acceptString("Enter name:");
										String password2 = MyIOService.acceptString("Enter password:");
										int age = MyIOService.acceptNumber("Enter age :",1,100);
										String pNumber = MyIOService.acceptPString("Enter Phone number :");
										String emailid = MyIOService.acceptString("Enter emailid :");   //a@@@b.@c
										String address  = MyIOService.acceptString("Enter address:");
										System.out.println("Select your security question(press 1/2/3)/n");
										System.out.println("1. what is your favourite color /n");
										System.out.println("2. which is your favourite fruit /n");
										System.out.println("3. what is your best friend name /n");
										int secID  = MyIOService.acceptNumber("choose your question......:");
									
										String answer=MyIOService.acceptString("enter your answer");
										
								
										
										
										User u = new User(); //a blank bean 
										
										//now fill up the bean
										u.setUsername(username1);
										u.setPassword(password2);
										//u.setAge(age);
										u.setEmaild(emailid);
										u.setAddress(address);
										u.setPString(pNumber);
										u.setsecID(secID);
										u.setAnswer(answer);
										
										
										
										//invoke a service method for storing this object via the dao (chef)
										
										logService.registerUser(u);
										System.out.println("Press ENTER key....");
										System.in.read();
									    break;
						case  3:	System.out.println("forgot password started..."); break;
						case  4:	System.out.println("reset password started..."); break;
						case  5: System.out.println("Exiting..."); break;
					}
			}
			catch(Exception e) {
				System.out.println("problem : "+e);
			}
		} while((choice!=loginMenu.menuItemList.size()+1));
		
		System.out.println("End of App");
	}
}
