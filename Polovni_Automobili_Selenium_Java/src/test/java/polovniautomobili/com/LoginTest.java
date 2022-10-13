package polovniautomobili.com;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Hooks;
import dataProviders.DataProviderClass;
import pageObjects.HomePage;
import pageObjects.LogInUserPage;
import pageObjects.LoginPage;

public class LoginTest extends Hooks{

	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test (dataProvider = "loginCredentials", dataProviderClass = DataProviderClass.class)
	public void logInCredentials (String invalidUsername, String invalidPass, String validUsername, String validPass) throws IOException {
		
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		LogInUserPage logInUser = new LogInUserPage();
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
		
		js.executeScript("arguments[0].scrollIntoView();",homePage.getSavedSearch());
		homePage.getSavedSearch().click();
		loginPage.getInputUserName().sendKeys(invalidUsername);
		loginPage.getButtonNextStep().click();
		String invalidUserNameEx = "Ne postoji nalog sa ovom mail adresom.";
		Assert.assertEquals(loginPage.getAlertInvalidUserName().getText(), invalidUserNameEx);;
		System.out.println(loginPage.getAlertInvalidUserName().getText());
		getDriver().navigate().refresh();
		loginPage.getInputUserName().sendKeys(validUsername);
		loginPage.getButtonNextStep().click();
		
		loginPage.getInputPasswordHeader().sendKeys(invalidPass);
		loginPage.getButtonLogin().click();
		String invalidPasswordEx = "Zaboravljena šifra";
		Assert.assertEquals(loginPage.getAlertInvalidPassword().getText(), invalidPasswordEx);
		System.out.println(loginPage.getAlertInvalidPassword().getText());
		loginPage.getButtonNextStep().click();
		
		loginPage.getInputPasswordHeader().sendKeys(validPass);
		loginPage.getButtonLogin().click();
		System.out.println("user " + logInUser.getCurrentUser().getText() + " log in");
		getDriver().findElement(By.xpath("//html")).click();
		Actions actions = new Actions(getDriver());
		actions.moveToElement(logInUser.getMainMenu()).perform();
		String loggedInUserEx = "marko.radonic@outlook.com";
		Assert.assertEquals(logInUser.getCurrentUser().getText(), loggedInUserEx);
		logInUser.getLogOut().click();
		System.out.println("user " + logInUser.getCurrentUser().getText() + " log out");


	}

}
