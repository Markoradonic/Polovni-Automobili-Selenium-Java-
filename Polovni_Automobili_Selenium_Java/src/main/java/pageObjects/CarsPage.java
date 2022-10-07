package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class CarsPage extends BaseClass {

	public WebDriver driver;
	
	By brandCars = By.xpath("/html//select[@id='brand']");
	By modelCar = By.xpath("/html//select[@id='model']");
	By yearFrom = By.xpath("/html//select[@id='year_from']");
	By buttonDetailedSearch = By.cssSelector("button[name='isDetailed']");
	By passengerAirbag = By.cssSelector("input#passenger_airbag");
	By buttonSubmit = By.cssSelector("button[name='submit_1']");
	By searchCarTyping = By.cssSelector("p[title=' Sve marke'] span[class='placeholder']");
	By inputSearchText = By.xpath("//p[contains(@title,'Sve marke')]//input[@type='text']");
	
	By opel = By.xpath("//label[normalize-space()='Opel']");
	By fiat = By.xpath("//label[normalize-space()='Fiat']");

	
	public CarsPage () throws IOException {
		super();
	}
	
	public WebElement getBrandCars () {
		this.driver = getDriver();
		return driver.findElement(brandCars);
	}
	
	public WebElement getModelCar () {
		this.driver = getDriver();
		return driver.findElement(modelCar);
	}
	
	public WebElement getYearFrom () {
		this.driver = getDriver();
		return driver.findElement(yearFrom);
	}
	
	public WebElement getButtonDetailedSearch () {
		this.driver = getDriver();
		return driver.findElement(buttonDetailedSearch);
	}
	
	public WebElement getPassengerAirbag () {
		this.driver = getDriver();
		return driver.findElement(passengerAirbag);
	}
	
	public WebElement getButtonSubmit () {
		this.driver = getDriver();
		return driver.findElement(buttonSubmit);
	}
	
	public WebElement getSearchCarTyping () {
		this.driver = getDriver();
		return driver.findElement(searchCarTyping);
	}
	
	public WebElement getInputSearchText () {
		this.driver = getDriver();
		return driver.findElement(inputSearchText);
	}
	
	public WebElement getOpel () {
		this.driver = getDriver();
		return driver.findElement(opel);
	}
	
	public WebElement getFiat () {
		this.driver = getDriver();
		return driver.findElement(fiat);
	}
}
