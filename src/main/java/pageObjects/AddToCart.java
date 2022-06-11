package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
public WebDriver driver;
	
	By addtocart=By.id("shopping_cart_container");
			
	public AddToCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement getaddtocart()
	{
		return driver.findElement(addtocart);
	}
	
}
