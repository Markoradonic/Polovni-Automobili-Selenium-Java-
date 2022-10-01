package polovniautomobili.com;

import java.io.IOException;



import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;

import dataProviders.DataProviderClass;
import pageObjects.CarsPage;
import pageObjects.HomePage;
import pageObjects.MotorcyclesPage;


public class SearchTypingTest extends BaseClass{
	
	public SearchTypingTest() throws IOException {
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
	

	@Test (dataProvider = "SearchMotorcyclesProvider", dataProviderClass = DataProviderClass.class)
	public void SearchMotorcyclesTest (String brand, String model, String typeOfMoto, String price) throws IOException, InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		MotorcyclesPage motorcyclesPage = new MotorcyclesPage(driver); 
				
		homePage.getMtorcycles().click();
		motorcyclesPage.getBrandMotorcyclesTxt().click();
		
		Thread.sleep(3000);
		
		motorcyclesPage.typingSearchTxtBrand().sendKeys(brand);
		motorcyclesPage.getModelMotorcycles().sendKeys(model);
		
		
		if (motorcyclesPage.getYamaha().getText().contains("Yamaha")) {
			System.out.println("found " + motorcyclesPage.getYamaha().getText());
			motorcyclesPage.getYamaha().click();
		}if(motorcyclesPage.getBmw().getText().contains("BMW")) {
			System.out.println("found " + motorcyclesPage.getBmw().getText());
			motorcyclesPage.getBmw().click();
		}if(motorcyclesPage.getSuzuki().getText().contains("Suzuki")) {
			System.out.println("found " + motorcyclesPage.getSuzuki().getText());
			motorcyclesPage.getSuzuki().click();
		}
		
		Select type = new Select(motorcyclesPage.getTypeMotorcycles());
		type.selectByValue(typeOfMoto);
		
		(motorcyclesPage.getPrice()).sendKeys(price);
		
		motorcyclesPage.getButtonSubmitt().click();
		
		driver.navigate().back();
//		driver.get(getUrl());

		
	}
	@Test (dataProvider = "SearchCarsProvider", dataProviderClass = DataProviderClass.class)
	public void SearcCarsTest (String brand) throws InterruptedException {
		
		CarsPage car = new CarsPage(driver);
		
		car.getSearchCarTyping().click();
		
		Thread.sleep(3000);
		car.getInputSearchText().sendKeys(brand);
		
		if(car.getOpel().getText().contains("Opel")) {
			System.out.println("found " + car.getOpel().getText());
			car.getOpel().click();
		}if(car.getFiat().getText().contains("Fiat")) {
			System.out.println("found " + car.getFiat().getText());
			car.getFiat().click();
		}
		
		car.getButtonSubmit().click();
		driver.navigate().back();
		
	}
	
}
