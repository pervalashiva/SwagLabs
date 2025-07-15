package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
@FindBy(id = "user-name")
WebElement usernameField;

@FindBy(id = "password")
WebElement userPassword;

@FindBy(id = "login-button")
WebElement userLogin;

@FindBy(className = "app_logo")
static
WebElement appLogo;



public void userName(String username)
{
	usernameField.sendKeys(username);
	
}
public void userPassword(String password)
{
	userPassword.sendKeys(password);
	
}

public void userLogin()
{
	userLogin.click();
	
}
public static  boolean isLoginSuccessful() {
    return appLogo.isDisplayed();
}
	
}
