package menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import input.MyIOService;



public class MyMenuTest {
	public static void main(String[] args) {
		
		MyMenu mainAdminMenu = new MyMenu("Admin Menu");
		
		MyMenuItem adminItem1 = new MyMenuItem("1. Bus Admin");
		MyMenuItem adminItem2 = new MyMenuItem("2. Ticket Admin");
		MyMenuItem adminItem3 = new MyMenuItem("3. Exit");
		
		mainAdminMenu.addMenuItem(adminItem1);
		mainAdminMenu.addMenuItem(adminItem2);
		mainAdminMenu.addMenuItem(adminItem3);
		
		//mainAdminMenu.showMenu();
		
		
		MyMenu busAdminMenu = new MyMenu("Bus Admin Menu");
		
		MyMenuItem busItem1 = new MyMenuItem("1. Add New Bus");
		MyMenuItem busItem2 = new MyMenuItem("2. View Bus");
		MyMenuItem busItem3 = new MyMenuItem("3. View Buses");
		MyMenuItem busItem4 = new MyMenuItem("4. Modify Bus");
		MyMenuItem busItem5 = new MyMenuItem("5. Delete Bus");
		MyMenuItem busItem6 = new MyMenuItem("6. Exit");
		
		busAdminMenu.addMenuItem(busItem1);
		busAdminMenu.addMenuItem(busItem2);
		busAdminMenu.addMenuItem(busItem3);
		busAdminMenu.addMenuItem(busItem4);
		busAdminMenu.addMenuItem(busItem5);
		busAdminMenu.addMenuItem(busItem6);
		//busAdminMenu.showMenu();
		
		
		
		MyMenu ticketMenu = new MyMenu("Ticket Admin Menu");
		
		MyMenuItem tktItem1 = new MyMenuItem("1. View Ticket");
		MyMenuItem tktItem2 = new MyMenuItem("2. View Tickets");
		MyMenuItem tktItem3 = new MyMenuItem("3. Modify Ticket");
		MyMenuItem tktItem4 = new MyMenuItem("4. Cancel Ticket");
		MyMenuItem tktItem5 = new MyMenuItem("5. Exit");
		
		ticketMenu.addMenuItem(tktItem1);
		ticketMenu.addMenuItem(tktItem2);
		ticketMenu.addMenuItem(tktItem3);
		ticketMenu.addMenuItem(tktItem4);
		ticketMenu.addMenuItem(tktItem5);
		//ticketMenu.showMenu();
		
		int choice=0;

	
		
		
		do
		{
			try
			{
				
				//Runtime.getRuntime().exec("calc");
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

				mainAdminMenu.showMenu();
				choice = MyIOService.acceptNumber("Enter choice : ",1, 3);
					switch(choice) {
						case  1:		
										do
										{
											new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
											busAdminMenu.showMenu();	
											choice = MyIOService.acceptNumber("Enter choice : ",1, 6);
										} while(choice!=6);
										
										break;
						case  2:		
										do
										{
											new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
											ticketMenu.showMenu();
											choice = MyIOService.acceptNumber("Enter choice : ",1, 5);
										} while(choice!=5);
	
										break;
						case 3: System.out.println("Exiting..."); break;
					}
			}
			catch(Exception e) {
				System.out.println("problem : "+e);
			}
		} while(choice!=3);
		
		System.out.println("End of App");
	}
}
