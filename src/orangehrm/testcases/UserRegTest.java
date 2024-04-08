package orangehrm.testcases;

import orangehrm.library.LoginPage;
import orangehrm.library.User;
import utils.AppUtils;

public class UserRegTest 
{

	public static void main(String[] args) throws InterruptedException 
	{

		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		User us = new User();
		boolean res = us.addUser("ESS", "John R", "JohnR", "QEdge123!@#");
		if(res)
		{
			System.out.println("New User Registration Test Pass");
		}else
		{
			System.out.println("New User Registration Test Fail");
		}
		
		lp.logout();
		AppUtils.closeApp();

	}

}
