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


	@Test
	public void motorcyclesTest () throws IOException, InterruptedException {
		
		HomePage MotorcyclesPage = new HomePage(driver);
		MotorcyclesPage motoPage = new MotorcyclesPage(driver); 
		SearchSettings crs = new SearchSettings();
		
		// PageObjects -> HomePage
		MotorcyclesPage.getMtorcycles().click();
		
		// PageObjects -> MotorcyclesPage
		Select brandMotorcycle = new Select(motoPage.getBrandMotorcycles()); 
		brandMotorcycle.selectByValue(crs.getMotorcycleBrand());
		
		//get model
		motoPage.getModelMotorcycles().sendKeys(crs.getMotorcycleModel());

		// price 
		motoPage.getPrice().sendKeys(crs.getMotorcyclesPrice());
		
		// YearFrom
		Select dropdownYearFrom = new Select(motoPage.getYearFrom());
		dropdownYearFrom.selectByValue(crs.getMotorcycleYearFrom());
		
		// Type Motorcycle
		if(crs.getNeked() == true) {
			Select dropdownType = new Select(motoPage.getTypeMotorcycles());
			dropdownType.selectByValue(crs.getMotorcycleTypeNeked());
			System.out.println(crs.getMotorcycleTypeNeked());
		}if(crs.getSportSuperSport() == true) {
			Select dropdownType = new Select(motoPage.getTypeMotorcycles());
			dropdownType.selectByValue(crs.getMotorcycleTypeSportSuperSport());
			System.out.println(crs.getMotorcycleTypeSportSuperSport());
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",motoPage.getButtonDetailedSearch());
		
		// ButtonDetailedSearch
		motoPage.getButtonDetailedSearch().click();
		
		// after the completed form
		motoPage.getButtonSubmitt().click();	
	
	}

	@Test
	public void carTest () throws IOException, InterruptedException {
		
		CarsPage car = new CarsPage(driver);
		SearchSettings crs = new SearchSettings();
		SelectedPage selectPage = new SelectedPage(driver);
		
		Select dropdownCarSelect = new Select(car.getBrandCars());
		dropdownCarSelect.selectByValue(crs.getCarBrand());
		
		Select dropdownModelCar = new Select(car.getModelCar());
		dropdownModelCar.selectByValue(crs.getCarModel());
		
		Select dropdownYearFrom = new Select(car.getYearFrom());
		dropdownYearFrom.selectByValue(crs.getCarYearFrom());
		
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

		driver.get(getUrl());

	}
}
