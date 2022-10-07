package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class MotorcyclesPage extends BaseClass{
	public WebDriver driver;
	
	By brandMotorcycles = By.cssSelector("select#brand");
	By brandMotorcyclesTxt = By.cssSelector("p[title=' Sve marke'] > .placeholder");
	By modelMotorcycle = By.cssSelector("input#modeltxt");
	By price = By.cssSelector("input#price_to");
	By yearFrom = By.cssSelector("select#year_from");
	By yearTo = By.cssSelector("select#year_to");
	By typeMotorcycles = By.cssSelector("select#type");
	By region = By.cssSelector("select#region");
	By OdlOrNew = By.cssSelector("select#showOldNew");
	By credit = By.cssSelector("input#credit");
	By leasing = By.cssSelector("input#leasing");
	By buttonSubmit = By.cssSelector("button[name='submit_1']");
	By buttonDetailedSearch = By.cssSelector("[class='uk-width-1-1 uk-margin-small-bottom paGrayButtonSecundary pr_advance_search_button']");
	By buttonSaveSearch = By.cssSelector(".js-bookmarks-show.paOrangeButtonTertiary.uk-width-1-1");
	By typingSearchTxtBrand = By.cssSelector("p[title=' Sve marke'] > .search-txt");
	//  => 
	By yamaha = By.xpath("//label[normalize-space()='Yamaha']");
	By bmw = By.xpath("//label[normalize-space()='BMW']");
	By suzuki = By.xpath("//label[normalize-space()='Suzuki']");
	
	public MotorcyclesPage () throws IOException {
		super();
	}
	
	public WebElement getBrandMotorcycles () {
		this.driver = getDriver();
		return driver.findElement(brandMotorcycles);
	}
	
	public WebElement getPrice () {
		this.driver = getDriver();
		return driver.findElement(price);
	}
	
	public WebElement getModelMotorcycles () {
		this.driver = getDriver();
		return driver.findElement(modelMotorcycle);
	}
	
	public WebElement getYearFrom () {
		this.driver = getDriver();
		return driver.findElement(yearFrom);
	}
	
	public WebElement getTypeMotorcycles () {
		this.driver = getDriver();
		return driver.findElement(typeMotorcycles);
	}
	
	public WebElement getButtonDetailedSearch () {
		this.driver = getDriver();
		return driver.findElement(buttonDetailedSearch);
	}
	
	public WebElement getButtonSubmitt () {
		this.driver = getDriver();
		return driver.findElement(buttonSubmit);
	}

	public WebElement typingSearchTxtBrand() {
		this.driver = getDriver();
		return driver.findElement(typingSearchTxtBrand);
		
	}
	
	public WebElement getBrandMotorcyclesTxt () {
		this.driver = getDriver();
		return driver.findElement(brandMotorcyclesTxt);
	}
	
	public WebElement getYamaha () {
		this.driver = getDriver();
		return driver.findElement(yamaha);
	}
	
	public WebElement getBmw () {
		this.driver = getDriver();
		return driver.findElement(bmw);
	}
	
	public WebElement getSuzuki () {
		this.driver = getDriver();
		return driver.findElement(suzuki);
	}

}
