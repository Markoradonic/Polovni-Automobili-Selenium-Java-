package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class HomePage extends BaseClass {
	
public WebDriver driver;

By Mtorcycles = By.cssSelector("a[title='Motori'] > .icon-cat-29");

public HomePage () throws IOException {
	super();
}

public WebElement getMtorcycles () {
	this.driver = getDriver();
	return driver.findElement(Mtorcycles);
}

}
