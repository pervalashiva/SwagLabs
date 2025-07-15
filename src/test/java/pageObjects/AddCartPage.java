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
	
	@FindBy(xpath = "//a[normalize-space()='CHECKOUT']")
	WebElement checkout;

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement fname;

	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lname;

	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement postCode;

	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement continu;



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
	public void checkout()
	{
		checkout.click();
	}
	public void fname(String firrstname)
	{
		fname.sendKeys(firrstname);
	}
	public void lname(String lastName)
	{
		lname.sendKeys(lastName);
	}
	public void postCode(String postCod)
	{
		postCode.sendKeys(postCod);
	}
	public void continu()
	{
		continu.click();
	}

}
