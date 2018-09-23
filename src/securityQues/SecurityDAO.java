package securityQues;

import java.util.ArrayList;

import pojo.SecurityQuestion;

public interface SecurityDAO 
{
	//void getSecid(Customer u);
	ArrayList<SecurityQuestion> getAllSecurityQuestion();
}
