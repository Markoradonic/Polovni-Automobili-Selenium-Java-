package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class LogInUserPage extends BaseClass {
	
	public WebDriver driver;
	
	public LogInUserPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	By mainMenu = By.xpath("/html//div[@id='top_header']/div[@class='uk-grid uk-hidden-medium uk-hidden-small']/div[@class='uk-width-7-10']/div/div/div//a[@href='/korisnicki-profil']//span[@class='ym-hide-content']");
	By logOut = By.xpath("/html//div[@id='top_header']//div[@class='uk-width-7-10']/div/div/div/div[2]/ul[@class='uk-nav uk-nav-dropdown']//a[@title='Odjavite se iz sistema']");
	By currentUser = By.xpath("/html//div[@id='top_header']/div[@class='uk-grid uk-hidden-medium uk-hidden-small']/div[@class='uk-width-7-10']/div/div/div//a[@href='/korisnicki-profil']//span[@class='ym-hide-content']");

	public WebElement getMainMenu () {
		this.driver = getDriver();
		return driver.findElement(mainMenu);
	}
	
	public WebElement getLogOut () {
		this.driver = getDriver();
		return driver.findElement(logOut);
	}
	
	public WebElement getCurrentUser () {
		this.driver = getDriver();
		return driver.findElement(currentUser);
	}
}
