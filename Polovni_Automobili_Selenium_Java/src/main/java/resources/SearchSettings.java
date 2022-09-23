package resources;

import java.util.Properties;

public class SearchSettings {
	
//	final String opel = "opel"; // this is constanta 
	Boolean checkboxPassengerAirbag = true;
	String carBrand = "opel";
	String modelOfOpel = "corsa";
	String errorMessage = "Is not exist";

	public SearchSettings() {
		this.checkboxPassengerAirbag = checkboxPassengerAirbag;
	}

	public boolean getButtonCheckbox() {
		return checkboxPassengerAirbag;
	}

	public String getCarBrandName() {
		switch (carBrand) {
		case "fiat":
			return carBrand;
		case "opel":
			return carBrand;
		default:
			return null;
		}

	}
	
	public String getModelOfOpel () {
		switch (modelOfOpel) {
		case "astra":
			return modelOfOpel;
		case "corsa":
			return modelOfOpel;
		default:
			return errorMessage;
		}
	}
	
	public String getModelOfFiat () {
		switch (modelOfOpel) {
		case "lachia":
			return modelOfOpel;
		case "punto":
			return modelOfOpel;
		default:
			return errorMessage;
		}
	}


}
