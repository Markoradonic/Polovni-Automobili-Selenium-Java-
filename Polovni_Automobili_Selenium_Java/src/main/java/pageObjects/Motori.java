package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Motori {
	public WebDriver driver;
	
	By markaMotora = By.cssSelector("p[title=' Sve marke'] > .placeholder");
	
	public Motori (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMarkaMotora () {
		return driver.findElement(markaMotora);
	}

}
