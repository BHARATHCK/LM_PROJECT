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

public interface LoginDAO  /*extends  AdminUser */{
	void createUser(User u);
	User readUserforLogin(User u);
	User readUserforResetPassword(User u);
	void updateUser(User u);
	void deleteUser(User u);
	ArrayList<User> readAllUsers();
	
}
