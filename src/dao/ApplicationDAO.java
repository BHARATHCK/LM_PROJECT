package dao;
import java.util.ArrayList;

import pojo.User;

/*class User {}

interface EndUser
{
	void createUser(User u);
	User readUser(User u);
	
}

interface AdminUser extends EndUser
{
	void updateUser(User u);
	void deleteUser(User u);
	ArrayList<User> readAllUsers();
}
*/

//OOAD

public interface ApplicationDAO  /*extends  AdminUser */{
	void createApplication(User u);
	User readUserforLogin(User u);
	User readUserforResetPassword(User u);
	void updateApplication(User u);
	void deleteApplication(User u);
	ArrayList<User> readAllUsers();
	
}
