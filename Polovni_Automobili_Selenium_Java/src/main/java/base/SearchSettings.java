package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class SearchSettings {
public static WebDriver driver;
	
	private Properties prop;
	private String opel;
	Boolean checkboxPassengerAirbag;
	private String ModelOfCar;
	private String yearFrom;
	private String motorcycleBrand;





	
	
	public SearchSettings () throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\SearchGlobalSettings.properties");
		prop.load(data);
	}
	
	
	public String getCarBrand() {
		opel = prop.getProperty("carBrand");
		return opel;
	}
	
	public String getModelOfCar() {
		ModelOfCar = prop.getProperty("modelOfCar");
		return ModelOfCar;
	}
	
	public String getYearFrom() {
		yearFrom = prop.getProperty("yearFrom");
		return yearFrom;
	}
	
	public Boolean getcheckboxPassengerAirbag() {
		checkboxPassengerAirbag = Boolean.parseBoolean(prop.getProperty("checkboxPassengerAirbag"));
		return checkboxPassengerAirbag;
	}
	
	public String getMotorcycleBrand () {
		motorcycleBrand = prop.getProperty("MotorcycleBrand");
		return motorcycleBrand;
	}
	


}
