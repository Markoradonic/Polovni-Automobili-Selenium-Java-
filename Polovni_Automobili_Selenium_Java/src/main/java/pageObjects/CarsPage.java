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
	By selectYearFrom = By.xpath("/html//select[@id='year_from']");
	By typingYearFrom = By.xpath("/html//div[@class='searchFormHolder']/div/div[@class='table']//form/div/div[4]/div[@class='uk-grid']/div[1]/div[@role='button']/p[@title=' Godište od']/span[@class='placeholder']");
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
	
	public WebElement getSelectYearFrom() {
		this.driver = getDriver();
		return driver.findElement(selectYearFrom);
	}
	
	public WebElement getTypingYearFrom () {
		this.driver = getDriver();
		return driver.findElement(typingYearFrom);
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
