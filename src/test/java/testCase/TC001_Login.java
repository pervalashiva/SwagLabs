package testCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC001_Login extends BaseClass {  //baseclass is extended for the launching chrome
	
	
	
	@Test
	public void verify_login()
	{
		LoginPage hp = new LoginPage(driver);  //loginpage object is extended 
		hp.userName("standard_user");  //method is extended from login page
		hp.userPassword("secret_sauce");
		hp.userLogin();
		 Assert.assertTrue(LoginPage.isLoginSuccessful(), "Login failed - app_logo not found");
	}
	
	
	
}
