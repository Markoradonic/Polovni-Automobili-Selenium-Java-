package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;


public class LoginPage extends BaseClass{
public WebDriver driver;
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	By inputUserName = By.cssSelector("input#username_header");
	By buttonNextStep = By.cssSelector("button#next-step");
	By inputPasswordHeader = By.cssSelector("input#password_header");
	By buttonLogin = By.cssSelector("button[name='login']");

	public WebElement getInputUserName () {
		this.driver = getDriver();
		return driver.findElement(inputUserName);
	}

	public WebElement getButtonNextStep () {
		this.driver = getDriver();
		return driver.findElement(buttonNextStep);
	}
	
	public WebElement getInputPasswordHeader() {
		this.driver = getDriver();
		return driver.findElement(inputPasswordHeader);
	}
	
	public WebElement getButtonLogin () {
		this.driver = getDriver();
		return driver.findElement(buttonLogin);
	}
	

}
