package menu;
import input.*;
 
public class EMIcalulator{
 
    public static void main(String []args)
    {
    	double emi;
    	double principal = MyIOService.acceptDouble("Enter principal:");
       	double rate = MyIOService.acceptDouble("Enter rate:");
    	double  time = MyIOService.acceptDouble("Enter  time:");
      
        rate=rate/(12*100); //one month interest
        time=time*12; //one month period
      
      
        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
      
        System.out.print("Monthly EMI is= "+emi+"\n");
                 
    }
}