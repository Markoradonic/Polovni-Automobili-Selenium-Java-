package polovniautomobili.com;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import base.SearchSettings;
import dataProviders.DataProviderClass;
import pageObjects.CarsPage;
import pageObjects.DetailedMotorcyclessSearchClass;
import pageObjects.HomePage;
import pageObjects.MotorcyclesPage;
import pageObjects.SelectedPage;

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
	
	@AfterTest
	public void tearDown () {
		driver.close();
		driver = null;
	}


	@Test (dataProvider = "DropdownMotorcyclesProvider", dataProviderClass = DataProviderClass.class)
	public void motorcyclesTest (String brand, String model, String price, String yearFrom) throws IOException, InterruptedException {
		
		HomePage MotorcyclesPage = new HomePage(driver);
		MotorcyclesPage motoPage = new MotorcyclesPage(driver); 
		SearchSettings crs = new SearchSettings();
		
		// PageObjects -> HomePage
		MotorcyclesPage.getMtorcycles().click();
		
		// PageObjects -> MotorcyclesPage
		Select brandMotorcycle = new Select(motoPage.getBrandMotorcycles()); 
		brandMotorcycle.selectByValue(brand);
		

		motoPage.getModelMotorcycles().sendKeys(model);
		motoPage.getPrice().sendKeys(price);
		
		Select motorcycYearFrom = new Select(motoPage.getYearFrom()); 
		motorcycYearFrom.selectByValue(yearFrom);

		if (brand == "yamaha") {
			if(crs.getNeked() == true) {
				Select dropdownType = new Select(motoPage.getTypeMotorcycles());
				dropdownType.selectByValue(crs.getMotorcycleTypeNeked());
				System.out.println("type for " + brand +" is " + crs.getMotorcycleTypeNeked());
			}if(crs.getSportSuperSport() == true) {
				Select dropdownType = new Select(motoPage.getTypeMotorcycles());
				dropdownType.selectByValue(crs.getMotorcycleTypeSportSuperSport());
				System.out.println("the type of " + brand +" is " + crs.getMotorcycleTypeSportSuperSport());
			}
		}
		if (brand == "suzuki") {
			if(crs.getNeked() == true) {
				Select dropdownType = new Select(motoPage.getTypeMotorcycles());
				dropdownType.selectByValue(crs.getMotorcycleTypeNeked());
				System.out.println("the type of  " + brand +" is " + crs.getMotorcycleTypeNeked());
			}
		}

		// after the completed form
		motoPage.getButtonSubmitt().click();	
		driver.navigate().back();
	
	}
	
	
	@Test (dataProvider = "DropdownCarsProvider", dataProviderClass = DataProviderClass.class)
	public void carTest (String brand, String model, String yearFrom) throws IOException, InterruptedException {
		
		CarsPage car = new CarsPage(driver);
		SearchSettings crs = new SearchSettings();
		SelectedPage selectPage = new SelectedPage(driver);
		
		Select dropdownCarSelect = new Select(car.getBrandCars());
		dropdownCarSelect.selectByValue(brand);
		
		Select dropdownModelCar = new Select(car.getModelCar());
		dropdownModelCar.selectByValue(model);
		
		Select dropdownYearFrom = new Select(car.getYearFrom());
		dropdownYearFrom.selectByValue(yearFrom);
		
		// Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",car.getButtonDetailedSearch());
		
		car.getButtonDetailedSearch().click();

		if(crs.getCheckboxPassengerAirbag() == true) {
			js.executeScript("arguments[0].scrollIntoView();",car.getPassengerAirbag());
			car.getPassengerAirbag().click();
			System.out.println("the button was clicked " + crs.getCheckboxPassengerAirbag() );
		}else {
			System.out.println("it's not clicked " + crs.getCheckboxPassengerAirbag() );
		}

		js.executeScript("arguments[0].scrollIntoView();",car.getButtonSubmit());
		car.getButtonSubmit().click();

		String firstParth = selectPage.getFirstParthOfXpath();
		String secondParth = selectPage.getSecondParthOfXpath();

		System.out.println("all xpath for cars");
		for(int i = 1; i < 4 ; i++) {
			
			String sum = firstParth + i + secondParth;
				WebElement Element = driver.findElement(By.xpath(sum));
				js.executeScript("arguments[0].scrollIntoView();",Element );
				System.out.println(driver.findElement(By.xpath(sum)));
				Thread.sleep(1000);
				driver.findElement(By.xpath(sum)).click();;
				driver.navigate().back();		
		}
		
//		driver.navigate().back();
		driver.get(getUrl());

	}
}
