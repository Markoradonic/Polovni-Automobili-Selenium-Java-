package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class DetailedCarsSearchPage extends BaseClass{
public WebDriver driver;
	public DetailedCarsSearchPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	By inputAirbag = By.cssSelector("input#airbag");
	By inputSideAirbag = By.cssSelector("input#side_airbag");
	By inputChildLock = By.cssSelector("input#child_lock");
	By inputAbs = By.cssSelector("input#abs");
	By inputEsp = By.cssSelector("input#esp");
	By inputAsr = By.cssSelector("input#asr");
	By inputAlarm = By.cssSelector("input#alarm");
	By inputCodedKey = By.cssSelector("input#coded_key");
	By inputEngineBlocking = By.cssSelector("input#engine_blocking");
	By inputCentralLocking = By.cssSelector("input#central_locking");
	By inputZeder = By.cssSelector("input#zeder");
	By inputDeadAngleSensor = By.cssSelector("input#dead_angle_sensor");
	By inputObdProtection = By.cssSelector("input#OBD_protection");
	By inputKeyLessEntry = By.cssSelector("input#key_less_entry");
	By inputLaneTracking = By.cssSelector("input#lane_tracking");
	
	public WebElement getInputAirbag () {
		this.driver = getDriver();
		return driver.findElement(inputAirbag);
	}
	
	public WebElement getInputSideAirbag () {
		this.driver = getDriver();
		return driver.findElement(inputSideAirbag);
	}
	

	public WebElement getInputChildLock () {
		this.driver = getDriver();
		return driver.findElement(inputChildLock);
	}
	
	public WebElement getInputAbs () {
		this.driver = getDriver();
		return driver.findElement(inputAbs);
	}
	
	public WebElement getInputEsp() {
		this.driver = getDriver();
		return driver.findElement(inputEsp);
	}
	
	public WebElement getInputAsr () {
		this.driver = getDriver();
		return driver.findElement(inputAsr);
	}
	
	public WebElement getInputAlarm () {
		this.driver = getDriver();
		return driver.findElement(inputAlarm);
	}
	
	public WebElement getInputCodedKey () {
		this.driver = getDriver();
		return driver.findElement(inputCodedKey);
	}
	
	public WebElement getInputEngineBlocking () {
		this.driver = getDriver();
		return driver.findElement(inputEngineBlocking);
	}

	public WebElement getInputCentralLocking () {
		this.driver = getDriver();
		return driver.findElement(inputCentralLocking);
	}
	
	public WebElement getInputZeder () {
		this.driver = getDriver();
		return driver.findElement(inputZeder);
	}
	
	public WebElement getInputDeadAngleSensor () {
		this.driver = getDriver();
		return driver.findElement(inputDeadAngleSensor);
	}
	
	public WebElement getInputObdProtection () {
		this.driver = getDriver();
		return driver.findElement(inputObdProtection);
	}
	
	public WebElement getInputKeyLessEntry () {
		this.driver = getDriver();
		return driver.findElement(inputKeyLessEntry);
	}
	
	public WebElement getInputLaneTracking () {
		this.driver = getDriver();
		return driver.findElement(inputLaneTracking);
	}
}
