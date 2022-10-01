package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarsPage {

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

	
	public CarsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBrandCars () {
		return driver.findElement(brandCars);
	}
	
	public WebElement getModelCar () {
		return driver.findElement(modelCar);
	}
	
	public WebElement getYearFrom () {
		return driver.findElement(yearFrom);
	}
	
	public WebElement getButtonDetailedSearch () {
		return driver.findElement(buttonDetailedSearch);
	}
	
	public WebElement getPassengerAirbag () {
		return driver.findElement(passengerAirbag);
	}
	
	public WebElement getButtonSubmit () {
		return driver.findElement(buttonSubmit);
	}
	
	public WebElement getSearchCarTyping () {
		return driver.findElement(searchCarTyping);
	}
	
	public WebElement getInputSearchText () {
		return driver.findElement(inputSearchText);
	}
	
	public WebElement getOpel () {
		return driver.findElement(opel);
	}
	
	public WebElement getFiat () {
		return driver.findElement(fiat);
	}
}
