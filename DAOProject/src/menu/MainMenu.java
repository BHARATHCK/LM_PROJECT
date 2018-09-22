/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;


 
public class MainMenu {
    //Variable declarations
    private static Scanner input = new Scanner(System.in);
   // private static LoanDB database = new LoanDB(10);
    private static int loan_number = 0;

    //Display the main inital menu
    public static void displayMenu() {
        int choice = 0;
        do {
            System.out.println("");
            System.out.println("*******MrTL**********");
            System.out.println("LOAN MANAGEMENT SYSTEM ");
            System.out.println(" ");
            //System.out.println(" What would you like do");
            System.out.println("1.  ADMIN Login ");
            System.out.println("2. User Login ");
            /*System.out.println(" ");
            System.out.println("  1. Create a new loan");
            System.out.println("  2. Find a Loan");
            System.out.println("  3. Display all loan details");
            System.out.println(" ");*/
            System.out.println(" 99. Exit");
            System.out.println(" ");
            System.out.print(" Enter your choice here: ");
            choice = Integer.parseInt(input.nextLine());
            menuSelector(choice);
        } while (choice != 99);

    }
    
    
   /* MyMenu busAdminMenu = new MyMenu("Loan Admin Menu");
	
	("1. Update user details");
	("2. Delete user Record");
	("3. Fetch all user records");
	("4. Fetch specific user details");
	("5. Add Remark ");
	("6. Exit");
*/
    
    /*MyMenu ticketMenu = new MyMenu("Loan User Menu");
	
	MyMenuItem tktItem1 = new MyMenuItem("1. Apply for Loan ");
	MyMenuItem tktItem2 = new MyMenuItem("2. Update personal details");
	MyMenuItem tktItem3 = new MyMenuItem("3. Fetch details");
	MyMenuItem tktItem4 = new MyMenuItem("4. Check for eligibility");
	MyMenuItem tktItem5 = new MyMenuItem("5. Exit");
    */

    //Method to act as per the option selected
    public static void menuSelector(int choice) {

        switch (choice) {
            case 1:
            	System.out.println("Loan Admin Menu");
                System.out.println("1. Update user details");
                System.out.println("2. Delete user Record");
                System.out.println("3. Fetch all user records");
                System.out.println("4. Fetch specific user details");
                System.out.println("5. Add Remark ");
                System.out.println("6. Exit");
                break;
            case 2:
            	System.out.println("Loan User Menu");
                System.out.println("1. Apply for Loan ");
                System.out.println("2. Update personal details");
                System.out.println("3. Fetch details");
                System.out.println("4. Check for eligibility");
                System.out.println("6. Exit");
                break;
            /*case 3:
                displayAll();
                break;*/
            case 99:
                System.out.println("");
                System.err.println("========THANK YOU========");
                System.exit(0);

            default:
                System.out.println("*******");
                System.err.println("******invalid option selected******");
        }
    }
}
/*    //creating a loan
    public static void createLoan() {
        Loan l1;
        String last_name, loan_type;
        double loan_amount, loan_fee;
        int type, loan_term;
        boolean done = false;

        //Ask for the type of the loan
        do {
            System.out.println("Entwer type of the loan: 1.Business 2.Personal");
            type = Integer.parseInt(input.nextLine());
            switch (type) {
                case 1:
                    loan_type = "Business";
                    done = true;
                    break;
                case 2:
                    loan_type = "Personal";
                    done = true;
                    break;
                default:
                    System.err.println("Invalid type. Try again!");
                    break;
            }
        } while (done == false);

        //Ask for the rest of the details
        System.out.println("Enter customer last name");
        last_name = input.nextLine();

        System.out.println("Enter loan amount");
        loan_amount = Double.parseDouble(input.nextLine());

        System.out.println("Enter loan term: 1/3/5 year(s) ");
        loan_term = Integer.parseInt(input.nextLine());
        
        System.out.println("Enter loan-fee for this loan");
        loan_fee = Double.parseDouble(input.nextLine());

        //Depending upon the type, create the respective object and have the reference point it
        loan_number++;
        if (type == 1) {
            l1 = new BusinessLoan(loan_number, last_name, loan_amount, loan_term, loan_fee);
        } else {
            l1 = new PersonalLoan(loan_number, last_name, loan_amount, loan_term, loan_fee);
        }
        System.err.println(database.addLoan(l1));
    }

    //Function to find one specific loan
    public static void findLoan() {
        String last_name;
        double loan_amount;
        int location;

        System.out.println("Enter customer last name");
        last_name = input.nextLine();

        System.out.println("Enter loan amount");
        loan_amount = Double.parseDouble(input.nextLine());

        location = database.findLoan(last_name, loan_amount);
        if (location != -1) {
            System.out.println(database.getLoan(location).toString());
        } else {
            System.err.println("Loan NOT found!!");
        }
    }

    // Method to diaplay all the loans
    public static void displayAll() {
        Loan[] temp = database.getAllLoans();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                System.out.println(temp[i].toString());
            }
        }
    }
    
}
*/