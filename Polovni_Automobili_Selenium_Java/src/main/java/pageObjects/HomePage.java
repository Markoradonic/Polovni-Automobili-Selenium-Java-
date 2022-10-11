package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class HomePage extends BaseClass {
	
public WebDriver driver;

By Motorcycles = By.cssSelector("a[title='Motori'] > .icon-cat-29");
By savedSearch = By.cssSelector(".js-bookmarks-show.paOrangeButtonTertiary.uk-width-1-1");
By cars = By.cssSelector("a[title='Putnička vozila']");

public HomePage () throws IOException {
	super();
}

public WebElement getMtorcycles () {
	this.driver = getDriver();
	return driver.findElement(Motorcycles);
}

public WebElement getSavedSearch () {
	this.driver = getDriver();
	return driver.findElement(savedSearch);
}

public WebElement getCars () {
	this.driver = getDriver();
	return driver.findElement(cars);
}

}
