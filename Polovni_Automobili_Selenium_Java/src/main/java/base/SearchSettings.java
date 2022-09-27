package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class SearchSettings {
	
	private Properties prop;
	private String getPropString;
	Boolean getCheckboxButton;


	
	public SearchSettings () throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\SearchGlobalSettings.properties");
		prop.load(data);
	}

	/* get properties of cars */
	public String getCarBrand() {
		getPropString = prop.getProperty("carBrand");
		return getPropString;
	}
	
	public String getCarModel() {
		getPropString = prop.getProperty("modeOfCar");
		return getPropString;
	}
	
	public String getCarYearFrom() {
		getPropString = prop.getProperty("yearCarFrom");
		return getPropString;
	}
	
	public Boolean getCheckboxPassengerAirbag() {
		getCheckboxButton = Boolean.parseBoolean(prop.getProperty("checkboxPassengerAirbag"));
		return getCheckboxButton;
	}
	
	/* get properties of Motorcycles */
	public String getMotorcycleBrand () {
		getPropString = prop.getProperty("motorcycleBrand");
		return getPropString;
	}
	
	public String getMotorcycleModel () {
		getPropString = prop.getProperty("modelOfMotorcycle");
		return getPropString;
	}
	
	public String getMotorcyclesPrice () {
		getPropString = prop.getProperty("priceOfMotorcycles");
		return getPropString;
	}
	
	public String getMotorcycleYearFrom () {
		getPropString = prop.getProperty("yearMotorcycleFrom");
		return getPropString;
	}
	
	public String getMotorcycleTypeNeked () {
		getPropString = prop.getProperty("nakedTypeMotorcycles");
		return getPropString;
	}
	
	public String getMotorcycleTypeSportSuperSport () {
		getPropString = prop.getProperty("sportSuperSportTypeMotorcycles");
		return getPropString;
	}
	
	

	public Boolean getNeked () {
		getCheckboxButton = Boolean.parseBoolean(prop.getProperty("naked"));
		return getCheckboxButton;
	}
	
	public Boolean getSportSuperSport () {
		getCheckboxButton = Boolean.parseBoolean(prop.getProperty("sportSuperSport"));
		return getCheckboxButton;
	}
	


}
