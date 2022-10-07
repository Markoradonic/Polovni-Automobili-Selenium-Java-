package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class DetailedMotorcyclessSearchClass extends BaseClass{
	public WebDriver driver;
	
	By cylinder = By.cssSelector("select#cylinder");
	
	
	public DetailedMotorcyclessSearchClass () throws IOException {
		 super();
	}

	
	public WebElement getCylindr () {
		this.driver = getDriver();
		return driver.findElement(cylinder);
	}
}
