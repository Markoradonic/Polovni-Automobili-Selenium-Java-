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
}
