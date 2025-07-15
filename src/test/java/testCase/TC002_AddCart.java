package testCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
		addCart.checkout();
		addCart.fname("Shiva");
		addCart.lname("Pervala");
		addCart.postCode("12345");
		addCart.continu();
		
		
		WebElement totalLabel = driver.findElement(By.className("summary_total_label"));
		String actualText = totalLabel.getText();
		String expectedText = "Total: $52.81";
		Assert.assertEquals(actualText, expectedText, "Total price does not match!");
	}

}
