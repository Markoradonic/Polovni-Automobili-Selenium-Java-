package polovniautomobili.com;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.CarsPage;
import pageObjects.DetailedMotorcyclessSearchClass;
import pageObjects.HomePage;
import pageObjects.MotorcyclesPage;



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
	public void carTest () {
		
		CarsPage car = new CarsPage(driver);
		
		Select dropdownCarSelect = new Select(car.getBrandCars());
		dropdownCarSelect.selectByValue("fiat");
		
		Select dropdownModelCar = new Select(car.getModelCar());
		dropdownModelCar.selectByValue("grande-punto");
		
		Select dropdownYearFrom = new Select(car.getYearFrom());
		dropdownYearFrom.selectByValue("2010");
		
		// Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		car.getButtonDetailedSearch().click();

		js.executeScript("window.scrollBy(0,1000)");
		
		car.getPassengerAirbag().click();
		
		js.executeScript("window.scrollBy(0,-800)");
		
		car.getButtonSubmit().click();
		
		js.executeScript("window.scrollBy(0,1000)");

		
	}
	
}
