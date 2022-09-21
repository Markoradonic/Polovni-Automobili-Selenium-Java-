package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailedMotorcyclessSearchClass {
	public WebDriver driver;
	
	By cylinder = By.cssSelector("select#cylinder");
	
	
	public DetailedMotorcyclessSearchClass (WebDriver driver) {
		 this.driver = driver;
	}

	
	public WebElement getCylindr () {
		return driver.findElement(cylinder);
	}
}
