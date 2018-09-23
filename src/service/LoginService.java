package service;

import java.util.ArrayList;

import dao.ApplicationDAOImpl;
import dao.LoginDAOImpl;
import pojo.SecurityQuestion;
import pojo.User;
import securityQues.SecurityDAO;
import securityQues.SecurityDAOImpl;
import pojo.User;
public class LoginService {
	
	LoginDAOImpl logDaoImpl = new LoginDAOImpl ();
	SecurityDAOImpl secDAO=new SecurityDAOImpl();
	ApplicationDAOImpl AppDaoImpl=new ApplicationDAOImpl();
	
	public void registerUser(User x) {
		logDaoImpl.createUser(x);
	}
	public void updateUserPassword(User x) {
		logDaoImpl.updateUser(x);
	}
	public void resetUserPassword(User x) {
		logDaoImpl.updateUser(x);
	}
	public User findUser(User x) {
		return logDaoImpl.readUser(x);
	}
	public User findUserforLogin(User x) {
		return logDaoImpl.readUserforLogin(x);
	}
	public User findUserforResetPassword(User x) {
		return logDaoImpl.readUserforResetPassword(x);
	}
	public User findUsersSecurityIDAndItsAnswer(String  userName) {
		User temp = logDaoImpl.readUserToKnowSecurityDetails(userName);
		return temp;
	}
	
	public String findSecuredQuestionById(int qid) {
		return logDaoImpl.findSecurityQuestion(qid);

	}
	public ArrayList<SecurityQuestion> fetchallSecurityQuestions() {
		return secDAO.getAllSecurityQuestion();
	}
	public void setNewPassword(User u) {
		logDaoImpl.updateUser(u);
		//System.out.println("Password is reset");
	}
	public User findoldpassword(String  userName) {
		User temp5=logDaoImpl.readUserToKnowoldpassword(userName);
		return temp5;
	}
	public void applyforLoan(User u) {
		AppDaoImpl.createApplication(u);
		
	}
}
