package polovniautomobili.com;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage;
import pageObjects.Motori;

public class First extends BaseClass  {
	

	
	public First() throws IOException {
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
	public void test () throws IOException {
		
//		driver.findElement(By.cssSelector("a[title='Motori'] > .icon-cat-29")).click();
		HomePage home = new HomePage(driver);
		home.getMotori().click();
		
		Motori motori = new Motori(driver);
		motori.getMarkaMotora().click();
	}
	

}
