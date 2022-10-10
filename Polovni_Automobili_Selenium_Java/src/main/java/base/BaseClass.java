package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	private Properties prop;
	private String url;
	
	public BaseClass () throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
	}
	
	public WebDriver getDriver() {
		return WebDriverInstance.getDriver();
	}
	
	public String getUrl() throws IOException {
		url = prop.getProperty("url");
		return url;
	}
	
	public static boolean isClicked(WebElement element)
	{ 
	    try {
	        element.click();
	        System.out.println("kliknuto je");
	        return true;
	    } catch(Exception e){
	    	System.out.println("kliknuto je");
	        return false;
	        
	    }}


}
