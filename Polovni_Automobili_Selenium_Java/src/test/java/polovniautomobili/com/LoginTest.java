package polovniautomobili.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Hooks;
import dataProviders.DataProviderClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTest extends Hooks{

	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test (dataProvider = "loginCredentials", dataProviderClass = DataProviderClass.class)
	public void invalidCredentials (String invalidUsername, String invalidPass, String validUsername, String validPass) throws IOException {
		
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
		
		js.executeScript("arguments[0].scrollIntoView();",homePage.getSavedSearch());
		homePage.getSavedSearch().click();
		loginPage.getInputUserName().sendKeys(invalidUsername);
		loginPage.getButtonNextStep().click();
		WebElement invalidUserName = getDriver().findElement(By.xpath("/html/body[@class='full-page']/div//form[@action='/login_check']//div[.='Ne postoji nalog sa ovom mail adresom.']"));
		System.out.println(invalidUserName.getText());
		getDriver().navigate().refresh();
		loginPage.getInputUserName().sendKeys(validUsername);
		loginPage.getButtonNextStep().click();
		loginPage.getInputPasswordHeader().sendKeys(invalidPass);
		loginPage.getButtonLogin().click();
		WebElement invalidPassword = getDriver().findElement(By.xpath("/html/body[@class='full-page']/div//p[@class='uk-alert uk-alert-danger']"));
		System.out.println(invalidPassword.getText());
	}
	@Test (dataProvider = "loginCredentials", dataProviderClass = DataProviderClass.class)
	public void validCredentials (String invalidUsername, String invalidPass, String validUsername, String validPass) throws IOException {
		//driver.findElement(By.xpath("//html")).click();
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		

		loginPage.getButtonNextStep().click();
	}
}
