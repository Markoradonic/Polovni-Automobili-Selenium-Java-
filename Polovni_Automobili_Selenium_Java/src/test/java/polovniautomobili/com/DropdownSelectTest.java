package polovniautomobili.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.CarsPage;
import pageObjects.DetailedMotorcyclessSearchClass;
import pageObjects.HomePage;
import pageObjects.MotorcyclesPage;
import resources.SearchSettings;
import resources.SrcSettings;



public class DropdownSelectTest extends BaseClass {
	
	public DropdownSelectTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}
	
//	@AfterTest
//	public void tearDown () {
//		driver.close();
//		driver = null;
//	}
	

	@Test
	public void motorcyclesTest () throws IOException, InterruptedException {
		
		HomePage MotorcyclesPage = new HomePage(driver);
		MotorcyclesPage motoPage = new MotorcyclesPage(driver); 
		DetailedMotorcyclessSearchClass searchMotorcycles = new DetailedMotorcyclessSearchClass(driver);
		
		// PageObjects -> HomePage
		MotorcyclesPage.getMtorcycles().click();
		
		// PageObjects -> MotorcyclesPage
		Select brandMotorcycle = new Select(motoPage.getBrandMotorcycles()); 
		brandMotorcycle.selectByValue("yamaha");

		// price 
		motoPage.getPrice().sendKeys("10000");
		
		// YearFrom
		Select dropdownYearFrom = new Select(motoPage.getYearFrom());
		dropdownYearFrom.selectByValue("2010");
		
		// Type Motorcycle
		Select dropdownType = new Select(motoPage.getTypeMotorcycles());
		dropdownType.selectByValue("naked");
		dropdownType.selectByValue("sport-super-sport");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		// ButtonDetailedSearch
		motoPage.getButtonDetailedSearch().click();
		
		Select dropdownSearchMotorcycles = new Select(searchMotorcycles.getCylindr());
		dropdownSearchMotorcycles.selectByValue("660");
		
		// after the completed form
		motoPage.getButtonSubmitt().click();	
	
	}

	@Test
	public void carTest () throws IOException {
		
		CarsPage car = new CarsPage(driver);
		SearchSettings buttonSearchSettings = new SearchSettings();
		SrcSettings crs = new SrcSettings();
		System.out.println(crs.getCarBrand()); 
		
		Select dropdownCarSelect = new Select(car.getBrandCars());
		dropdownCarSelect.selectByValue(crs.getCarBrand());
		
		Select dropdownModelCar = new Select(car.getModelCar());
		dropdownModelCar.selectByValue(buttonSearchSettings.getModelOfOpel());
		
		Select dropdownYearFrom = new Select(car.getYearFrom());
		dropdownYearFrom.selectByValue("2010");
		
		// Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		car.getButtonDetailedSearch().click();

		js.executeScript("window.scrollBy(0,-800)");
		
		if(crs.getcheckboxPassengerAirbag() == true) {
			js.executeScript("window.scrollBy(0,500)");
			car.getPassengerAirbag().click();
			System.out.println("the button was clicked" + crs.getcheckboxPassengerAirbag() );
		}else {
			System.out.println("it's not clicked");
			System.out.println("it's not clicked" + crs.getcheckboxPassengerAirbag() );
		}
		
		js.executeScript("window.scrollBy(0,-500)");
		car.getButtonSubmit().click();
		
		

		
	}
	
}
