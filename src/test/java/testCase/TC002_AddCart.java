package testCase;
import org.testng.annotations.Test;

import pageObjects.AddCartPage;

public class TC002_AddCart extends TC001_Login { 
	
	@Test
	public void Verify_addCart ()
	{
		AddCartPage addCart = new AddCartPage(driver);
		addCart.addOne();
		addCart.addTwo();
		addCart.addThree();
		addCart.cart();
	}

}
