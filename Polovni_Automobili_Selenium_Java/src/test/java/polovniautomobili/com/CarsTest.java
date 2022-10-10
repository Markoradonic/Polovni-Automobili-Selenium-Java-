package polovniautomobili.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Hooks;
import base.SearchSettings;
import dataProviders.DataProviderClass;
import pageObjects.CarsPage;
import pageObjects.SelectedPage;

public class CarsTest extends Hooks {

	public CarsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test (dataProvider = "SearchCarsProvider", dataProviderClass = DataProviderClass.class)
	public void searcCarsTest (String brand) throws InterruptedException, IOException {
		
		CarsPage car = new CarsPage();
		
		car.getSearchCarTyping().click();
		
		Thread.sleep(3000);
		car.getInputSearchText().sendKeys(brand);
		
		if(car.getOpel().getText().contains("Opel")) {
			System.out.println("found car " + car.getOpel().getText());
			car.getOpel().click();
		}if(car.getFiat().getText().contains("Fiat")) {
			System.out.println("found car " + car.getFiat().getText());
			car.getFiat().click();
		}
		
		car.getButtonSubmit().click();
		getDriver().get(getUrl());
		
	}
	
	@Test (dataProvider = "DropdownCarsProvider", dataProviderClass = DataProviderClass.class)
	public void dropdownCarTest (String brand, String model, String yearFrom) throws IOException, InterruptedException {
		
		CarsPage car = new CarsPage();
		SelectedPage selectPage = new SelectedPage();
		
		Select dropdownCarSelect = new Select(car.getBrandCars());
		dropdownCarSelect.selectByValue(brand);
		
		Select dropdownModelCar = new Select(car.getModelCar());
		dropdownModelCar.selectByValue(model);
		
		Select dropdownYearFrom = new Select(car.getSelectYearFrom());
		dropdownYearFrom.selectByValue(yearFrom);
		
		// Scrolling
		JavascriptExecutor js = (JavascriptExecutor) getDriver();


		js.executeScript("arguments[0].scrollIntoView();",car.getButtonSubmit());
		car.getButtonSubmit().click();

		String firstParth = selectPage.getFirstParthOfXpath();
		String secondParth = selectPage.getSecondParthOfXpath();

		System.out.println("all xpath for cars");
		for(int i = 1; i < 2 ; i++) {
			
			String sum = firstParth + i + secondParth;
				WebElement Element = getDriver().findElement(By.xpath(sum));
				js.executeScript("arguments[0].scrollIntoView();",Element );
				System.out.println(getDriver().findElement(By.xpath(sum)));
				getDriver().findElement(By.xpath(sum)).click();;
				getDriver().navigate().back();		
		}
		
//		driver.navigate().back();
		getDriver().get(getUrl());

	}

}
