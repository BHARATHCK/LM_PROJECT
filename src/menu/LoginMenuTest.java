package menu;
import input.*;
import dao.LoginDAOImpl.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import input.MyIOService;
import pojo.SecurityQuestion;
import pojo.User;
import service.LoginService;

public class LoginMenuTest {
	public static void main(String[] args) {
		
		
		
		 
		
		MyMenu loginMenu = new MyMenu("Login Menu");
		
		MyMenuItem loginMenuItem1 = new MyMenuItem("1. Sign-In (Login)");
		MyMenuItem loginMenuItem2 = new MyMenuItem("2. Sign-Up (Register)");
		MyMenuItem loginMenuItem3 = new MyMenuItem("3. Forgot Password");
		//MyMenuItem loginMenuItem4 = new MyMenuItem("4. Reset Password");
		
				
		loginMenu.addMenuItem(loginMenuItem1);
		loginMenu.addMenuItem(loginMenuItem2);
		loginMenu.addMenuItem(loginMenuItem3);
		//loginMenu.addMenuItem(loginMenuItem4);
		
		MyMenu loanMenu= new MyMenu("LOAN Menu");
		MyMenuItem loanMenu1= new MyMenuItem ("1. apply for loan");
		MyMenuItem loanMenu2= new MyMenuItem ("2. Update personal details");
		MyMenuItem loanMenu3= new MyMenuItem ("3. Fetch details");
		MyMenuItem loanMenu4= new MyMenuItem ("4. Check for eligibility");
		MyMenuItem loanMenu5= new MyMenuItem ("5. Reset Password");
		MyMenuItem loanMenu6= new MyMenuItem ("6. Exit");
		
		
		loanMenu.addMenuItem(loanMenu1);
		loanMenu.addMenuItem(loanMenu2);
		loanMenu.addMenuItem(loanMenu3);
		loanMenu.addMenuItem(loanMenu4);
		loanMenu.addMenuItem(loanMenu5);
		loanMenu.addMenuItem(loanMenu6);
		
		
		MyMenu Splashmenu= new MyMenu("SPLASH SCREEN");
		MyMenuItem Splashmenu1= new MyMenuItem ("1. ADMIN");
		MyMenuItem Splashmenu2= new MyMenuItem ("2. USER ");
		/*MyMenuItem Splashmenu3= new MyMenuItem ("3. Fetch details");
		MyMenuItem Splashmenu4= new MyMenuItem ("4. Check for eligibility");
		MyMenuItem Splashmenu5= new MyMenuItem ("5. Exit");*/
		
		Splashmenu.addMenuItem(Splashmenu1);
		Splashmenu.addMenuItem(Splashmenu2);
		
		MyMenu Trapmenu= new MyMenu("press any key to APPLY FOR LOAN");
		MyMenuItem Trapmenu1= new MyMenuItem ("");
		Trapmenu.addMenuItem(Trapmenu1);
		
		Splashmenu.showMenu();
		int dch;
		Scanner s=new Scanner(System.in);
		dch=s.nextInt();
		if(dch==2) 
		{
			int choice=0;
		do
		{
			System.out.println("Private loans, a popular name for personal loans (also called private personal loans), are unsecured loans that are offered by private lending institutions that include banks,\n NBFCs, and Fintech companies. In the private personal loan space, Fintechs have become extremely popular in the current day,\n mostly owing to the process they’ve adopted. ");
			System.out.println("The interest rate on private loans offered by Qbera start from 11.99% p.a. and go up to 24% p.a. The interest rate on private loans depends on various \n parameters including your credit score, income, and past repayment pattern (if you’ve availed loans previously).\n If your credit score is right up there, you will get a low-interest rate on your private personal loan. ");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
			System.out.println("LIKE THE DEAL?");
			Trapmenu.showMenu();
			
			try
	        {
	            System.in.read();
	        }  
	        catch(Exception e)
	        {}  
			
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
										if(t1!=null) {
											System.out.println("User details are : "+t1);
											System.out.println("********************welcome to MR.TL****************");
											loanMenu.showMenu();
											int ch;
											ch=new Scanner(System.in).nextInt();
											switch(ch) {
											
											case 1:  //LOAN APPLICATION
											 
												PrintApplication app= new PrintApplication();
												
											
											case 5: System.out.println("reset password started...");
											
											
											String username3 = MyIOService.acceptString("Enter username:");
											String password1= MyIOService.acceptString("Enter old password:");
											User u1 = new User();
											u1.setUsername(username3);
											u1.setPassword(password1);
											User t3=logService.findUser(u1);
											
											if(t3.equals(null))
											{
												System.out.println("Wrong credentials");
												/*String pswd1 = MyIOService.acceptString("Enter new password:");
												t3.setPassword(pswd1);
												logService.resetUserPassword(t3);*/
												break;
											}
											String newPassword=MyIOService.acceptString("ENTER NEW PASSWORD ");
											String confirmedpassword=MyIOService.acceptString("CONFIRM PASSWORD ");
											System.out.println(newPassword.equals(confirmedpassword));
											if(newPassword.equals(confirmedpassword)) {
												t3.setPassword(confirmedpassword);
												logService.setNewPassword(t3);
											}else {
												System.out.println("password mismatch");
											}
											 break;
											}
						}
										break;
						
						case  2:	System.out.println("U s e r     R e g i s t r a t i o n");
						
											String username1 = MyIOService.acceptString("Enter name:");
											String password2 = MyIOService.acceptString("Enter password:");
											//int age = MyIOService.acceptNumber("Enter age :",1,100);
											String pNumber = MyIOService.acceptPString("Enter Phone number :");
											String emailid = MyIOService.acceptString("Enter emailid :");   //a@@@b.@c
											String address  = MyIOService.acceptString("Enter address:");
											System.out.println("Select your security question(press 1/2/3)/n");
											/*System.out.println("1. color");
											System.out.println("2. school");
											System.out.println("3. fruit");
											int secID  = MyIOService.acceptNumber("choose your question......:");
											String answer=MyIOService.acceptString("enter your answer"); */
											ArrayList<SecurityQuestion> Sec_ques=new ArrayList<SecurityQuestion>();
											Sec_ques=logService.fetchallSecurityQuestions();
											for (SecurityQuestion str : Sec_ques) 
											{
												System.out.println(str);
											}
											int secID  = MyIOService.acceptNumber("choose your question......:");
					
											String answer=MyIOService.acceptString("enter your answer");
											User u = new User(); //a blank bean 
						
											//now fill up the bean
											u.setUsername(username1);
											u.setPassword(password2);
											//u.setAge(age);
											u.setEmaild(emailid);
											u.setAddress(address);
											u.setPnumber(pNumber);
											u.setQuestionId(secID);
											u.setSecuredAnswer(answer);
						
						
						
											//invoke a service method for storing this object via the dao (chef)
						
											logService.registerUser(u);
											System.out.println("Press ENTER key....");
											System.in.read();
					    break;
						case  3:	System.out.println("F o r g o t     P a s s w o r d "); 
						//ask the user to enter the username
						String username2 = MyIOService.acceptString("Enter username:");
						
						User temp = logService.findUsersSecurityIDAndItsAnswer(username2);
						
						if(temp.getUsername().equals(username2)) {
							//System.out.println("==>HEY the real answer is "+temp.getSecuredAnswer());
							
							String sec_que = logService.findSecuredQuestionById(temp.getQuestionId());
							String securedAnswerTyped = MyIOService.acceptString(sec_que);
							System.out.println("Answer typed by you is : "+securedAnswerTyped );
							
							if(temp.getSecuredAnswer().equals(securedAnswerTyped)) {
								System.out.println("Answer matched...");
								System.out.println("Now asking for resetting....");
								String newPassword = MyIOService.acceptString("Enter new password  :");
								String confirmedPassword = MyIOService.acceptString("Confirm password     :");
								if(newPassword.equals(confirmedPassword )) {
									User u1 = new User();
									u1.setUsername(temp.getUsername());
									u1.setPassword(confirmedPassword);
									logService.setNewPassword(u1);
								}
							}
							else {
								System.out.println("Answer NOT matched...");
							}
							
						}break;
						
						
						
						
						
						// search this users secuirty question from the service -> dao
					//here teh dao will fetch the security question and its answer (of that user)
				//and hands it over to the service
	
			// then service will ask the user's mind answer and compares it with the real answer
			// if its same then ask user to reset the password and update it to the db via -> dao
						
						case  4:	System.out.println("reset password started...");
								
								
								String username3 = MyIOService.acceptString("Enter username:");
								String password1= MyIOService.acceptString("Enter old password:");
								User u1 = new User();
								u1.setUsername(username3);
								u1.setPassword(password1);
								User t3=logService.findUser(u1);
								
								if(t3.equals(null))
								{
									System.out.println("Wrong credentials");
									/*String pswd1 = MyIOService.acceptString("Enter new password:");
									t3.setPassword(pswd1);
									logService.resetUserPassword(t3);*/
									break;
								}
								String newPassword=MyIOService.acceptString("ENTER NEW PASSWORD ");
								String confirmedpassword=MyIOService.acceptString("CONFIRM PASSWORD ");
								System.out.println(newPassword.equals(confirmedpassword));
								if(newPassword.equals(confirmedpassword)) {
									t3.setPassword(confirmedpassword);
									logService.setNewPassword(t3);
								}else {
									System.out.println("password mismatch");
								}
								 break;			
							
							
						case  5: System.out.println("Exiting..."); break;
					}
			}
			catch(Exception e) {
				System.out.println("User not registered");
				//System.out.println("problem : "+e.getMessage());
			}
		} while((choice!=loginMenu.menuItemList.size()+1));
		
		System.out.println("End of App");
	}
	}
}


