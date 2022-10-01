package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@DataProvider
	public Object[][] SearchMotorcyclesProvider() {
		Object[][] dataset = new Object[3][4];
		
		dataset[0][0]="yamaha";
		dataset[0][1]="mt";
		dataset[0][2]="supermoto";
		dataset[0][3]="7000";
		
		dataset[1][0]="bmw";
		dataset[1][1]="gs";
		dataset[1][2]="scooter";
		dataset[1][3]="2000";
		
		dataset[2][0]="suzuki";
		dataset[2][1]="gsxr";
		dataset[2][2]="touring";
		dataset[2][3]="3000";
		
		return dataset;
	}
	
	@DataProvider
	public Object[][] DropdownMotorcyclesProvider() {
		Object[][] dataset = new Object[2][4];
		
		dataset[0][0]="yamaha";
		dataset[0][1]="mt";
		dataset[0][2]="7000";
		dataset[0][3]="2000";
		
		dataset[1][0]="suzuki";
		dataset[1][1]="gsxr";
		dataset[1][2]="6000";
		dataset[1][3]="2005";

		
		
		return dataset;
	}
	
	@DataProvider
	public Object[][] DropdownCarsProvider() {
		Object[][] dataset = new Object[2][3];
		
		dataset[0][0]="fiat";
		dataset[0][1]="punto";
		dataset[0][2]="2010";
		
		dataset[1][0]="opel";
		dataset[1][1]="corsa";
		dataset[1][2]="2005";

		
		
		return dataset;
	}
	
	
	@DataProvider
	public Object [][] SearchCarsProvider () {
		Object[][] dataset = new Object[2][1];
		
		dataset[0][0]="opel";
	
		dataset[1][0]="fiat";

		
		return dataset;
	}
	
}
