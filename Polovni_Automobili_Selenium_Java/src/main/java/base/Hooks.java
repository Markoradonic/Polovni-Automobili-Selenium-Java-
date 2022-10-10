package base;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks extends BaseClass {
	
	private Properties prop;
	private String url;

	public Hooks() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws IOException {
		getDriver().get(getUrl());
	}
	

	@AfterTest
	public void tearDown() {
//		WebDriverInstance.cleanupDriver();
	}
	

	
	

}
