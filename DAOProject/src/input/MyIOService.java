package input;

import java.util.Scanner;

public class MyIOService
{
	public static int acceptNumber(String msg)
	{
		Scanner scan = new Scanner(System.in);
		int number=-1;
		do
		{
					try
					{
						System.out.println(msg);
						number = Integer.parseInt(scan.nextLine()); //-1
					}
					catch(NumberFormatException e) {
						//e.printStackTrace();
						System.out.println("format problem : "+e.getMessage());
					}
		} while(number==-1);
		return number;
	}
	
	public static int acceptNumber(String msg, int min, int max)
	{
		Scanner scan = new Scanner(System.in);
		int number=-1;
		boolean validNumber=false;
		do
		{
					try
					{
						System.out.println(msg);
						number = Integer.parseInt(scan.nextLine()); //-1
						if(number >= min && number <=max) {
							validNumber=true;
							break;
						}
					}
					catch(NumberFormatException e) {
						//e.printStackTrace();
						System.out.println("format problem : "+e.getMessage());
					}
					System.out.println("Number should be ranged from "+min +" to "+max);
		} while(number==-1);
		
		if(validNumber==true)
			return number;
		else
			return -1;
	}

	
	//-----------
	public static double acceptPNumber(String msg, int min, int max)
	{
		Scanner scan = new Scanner(System.in);
		int number=-1;
		boolean validNumber=false;
		do
		{
					try
					{
						System.out.println(msg);
						number = Integer.parseInt(scan.nextLine()); //-1
						if(number > min && number <max) {
							validNumber=true;
							break;
						}
					}
					catch(NumberFormatException e) {
						//e.printStackTrace();
						System.out.println("format problem : "+e.getMessage());
					}
					System.out.println("Number should be ranged from "+min +" to "+max);
		} while(number==-1);
		
		if(validNumber==true)
			return number;
		else
			return -1;
	}

	
//SimpleDateFormat

	public static String acceptString(String string) {
		Scanner scan = new Scanner(System.in);
		String choice=""; 
		do
		{
					try
					{
						System.out.println(string);
						choice = scan.nextLine(); 
					}
					catch(Exception e) {
						//e.printStackTrace();
						System.out.println("problem : "+e.getMessage());
					}
		} while( (choice.equalsIgnoreCase("y"))    );
		
		return choice;
	}
	
	
	public static String acceptPString(String string) {
		Scanner scan = new Scanner(System.in);
		String choice="";
		int flag=0;
		do
		{
					try
					{
						System.out.println(string);
						choice = scan.nextLine(); 
						if(choice.length()==10)
						{
							flag=1;
							break;
						}
					}
					catch(Exception e) {
						//e.printStackTrace();
						System.out.println("problem : "+e.getMessage());
					}
		} while( (choice.equalsIgnoreCase("y"))    );
		
		if(flag==1)
		return choice;
		
		else 
			return "xxx";
	}
	
	public static String acceptString(String string, String s1,String s2) {
		Scanner scan = new Scanner(System.in);
		String choice=""; 
		do
		{
					try
					{
						System.out.println(string);
						choice = scan.nextLine(); 
					}
					catch(Exception e) {
						//e.printStackTrace();
						System.out.println("problem : "+e.getMessage());
					}
		} while(      (!choice.equalsIgnoreCase(s1))  &&  (!choice.equalsIgnoreCase(s2))  );
		
		return choice;
	}
}