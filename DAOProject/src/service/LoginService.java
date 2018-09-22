package service;

import dao.LoginDAOImpl;
import pojo.User;

public class LoginService {
	
	LoginDAOImpl logDaoImpl = new LoginDAOImpl ();
	
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
}
