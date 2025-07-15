package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCartPage extends BasePage{

	public AddCartPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	WebElement add1;

	@FindBy(xpath = "//div[@class='inventory_list']//div[2]//div[3]//button[1]")
	WebElement add2;

	@FindBy(xpath = "//div[@class='inventory_list']//div[5]//div[3]//button[1]")
	WebElement add3;

	@FindBy(xpath = "//*[name()='path'][@fill='currentColor'][1]")
	
	WebElement cart;



	public void addOne()
	{
		add1.click();
		
	}
	public void addTwo()
	{
		add2.click();
		
	}

	public void addThree()
	{
		add3.click();
		
	}
	public void cart()
	{
		cart.click();
	}

}
