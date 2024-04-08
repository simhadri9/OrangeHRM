package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithValidData
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		boolean res = lp.isAdminModuleDisplayed();
		if(res)
		{
			System.out.println("Admin Login Test Pass");
		}else
		{
			System.out.println("Admin Login Test Fail");
		}
		
		lp.logout();
		AppUtils.closeApp();		

	}

}
