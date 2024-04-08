package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithInvalidData
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("abc", "xyz");
		boolean res = lp.isErrMsgDisplayed();
		if(res)
		{
			System.out.println("Login displaying appropriate error message for invalid inputs , test pass");
		}else
		{
			System.out.println("Login not displaying appropriate error message for invalid inputs , test fail");
		}
		AppUtils.closeApp();
		

	}

}
