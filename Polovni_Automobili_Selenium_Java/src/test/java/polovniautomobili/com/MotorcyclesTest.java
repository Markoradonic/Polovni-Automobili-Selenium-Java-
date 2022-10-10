package polovniautomobili.com;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


import base.Hooks;
import base.SearchSettings;
import dataProviders.DataProviderClass;
import pageObjects.HomePage;
import pageObjects.MotorcyclesPage;

public class MotorcyclesTest extends Hooks {

	public MotorcyclesTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test (dataProvider = "DropdownMotorcyclesProvider", dataProviderClass = DataProviderClass.class)
	public void dropdownMotorcycTest (String brand, String model, String price, String yearFrom) throws IOException, InterruptedException {
		
		HomePage MotorcyclesPage = new HomePage();
		MotorcyclesPage motoPage = new MotorcyclesPage(); 
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
				System.out.println("the type of " + brand +" is " + crs.getMotorcycleTypeNeked());
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
				System.out.println("the type of " + brand +" is " + crs.getMotorcycleTypeNeked());
			}
		}

		// after the completed form
		motoPage.getButtonSubmitt().click();	
		getDriver().navigate().back();
	
	}
	
	@Test (dataProvider = "SearchMotorcyclesProvider", dataProviderClass = DataProviderClass.class)
	public void SearchTypingMotorcycleTest (String brand, String model, String typeOfMoto, String price) throws IOException, InterruptedException {
		
		HomePage homePage = new HomePage();
		MotorcyclesPage motorcyclesPage = new MotorcyclesPage(); 
				
		homePage.getMtorcycles().click();
		motorcyclesPage.getBrandMotorcyclesTxt().click();
		
		motorcyclesPage.typingSearchTxtBrand().sendKeys(brand);
	
		
		Thread.sleep(1000);
		if (motorcyclesPage.getYamaha().getText().contains("Yamaha")) {
//			motorcyclesPage.getYamaha().click();
			Select dropdownType = new Select(motorcyclesPage.getBrandMotorcycles());
			dropdownType.selectByValue("yamaha");
		}
		Thread.sleep(1000);
		if(motorcyclesPage.getBmw().getText().contains("BMW")) {
//			motorcyclesPage.getBmw().click();
			Select dropdownType = new Select(motorcyclesPage.getBrandMotorcycles());
			dropdownType.selectByValue("bmw");
		}
		Thread.sleep(1000);
		if(motorcyclesPage.getSuzuki().getText().contains("Suzuki")) {
//			motorcyclesPage.getSuzuki().click();
			Select dropdownType = new Select(motorcyclesPage.getBrandMotorcycles());
			dropdownType.selectByValue("suzuki");
		}
		
		motorcyclesPage.getModelMotorcycles().sendKeys(model);
		Select type = new Select(motorcyclesPage.getTypeMotorcycles());
		type.selectByValue(typeOfMoto);
		
		(motorcyclesPage.getPrice()).sendKeys(price);
		Thread.sleep(1000);
		motorcyclesPage.getButtonSubmitt().click();
		System.out.println("found " + getDriver().getTitle());
		
//		getDriver().navigate().back();
		getDriver().get(getUrl());

		
	}
}
