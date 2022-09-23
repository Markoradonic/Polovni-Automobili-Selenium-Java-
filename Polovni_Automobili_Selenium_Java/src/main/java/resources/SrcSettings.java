package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SrcSettings {
	public static WebDriver driver;
	
	private Properties prop;
	private String opel;
//	private Boolean checkboxPassengerAirbag;
	Boolean checkboxPassengerAirbag;





	
	
	public SrcSettings () throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\SearchGlobalSettings.properties");
		prop.load(data);
	}
	
	
	public String getCarBrand() {
		opel = prop.getProperty("carBrand");
		return opel;
	}
	
	public Boolean getcheckboxPassengerAirbag() {
		checkboxPassengerAirbag = Boolean.parseBoolean(prop.getProperty("checkboxPassengerAirbag"));
		return checkboxPassengerAirbag;
	}
	

	
	

}
