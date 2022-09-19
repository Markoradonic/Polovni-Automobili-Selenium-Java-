package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
public WebDriver driver;

By motori = By.cssSelector("a[title='Motori'] > .icon-cat-29");

public HomePage (WebDriver driver) {
	this.driver = driver;
}

public WebElement getMotori () {
	return driver.findElement(motori);
}

}
