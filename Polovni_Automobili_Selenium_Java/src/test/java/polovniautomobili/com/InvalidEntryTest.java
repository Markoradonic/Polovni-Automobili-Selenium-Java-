package polovniautomobili.com;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.CarsPage;
import pageObjects.HomePage;

public class InvalidEntryTest extends Hooks{

	public InvalidEntryTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void invalidEntryTest () throws IOException {
		CarsPage selectCar = new CarsPage();
		HomePage homePage = new HomePage();
		
		homePage.getCars().click();
		selectCar.getSearchCarTyping().click();
		selectCar.getInputSearchText().sendKeys("sdfsdf");
		
		try
		{
			selectCar.getModelCar().sendKeys("sdaf");
			selectCar.getTypingYearFrom().sendKeys("ssdf");
			 Assert.fail("string must not be entered ");

		} catch (Exception e) {
			System.out.println("string is not entered ");
		}
	}
	

}
