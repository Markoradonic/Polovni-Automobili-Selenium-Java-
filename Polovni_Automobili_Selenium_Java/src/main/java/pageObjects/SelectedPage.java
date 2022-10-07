package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class SelectedPage extends BaseClass{

	public WebDriver driver;

	public String firstParthOfXpath = "//div[@id='search-results']/div[@class='js-hide-on-filter']/article[";
	public String secondParthOfXpath = "]/div[@class='image']";

	public SelectedPage() throws IOException {
		super();
	}

	public String getFirstParthOfXpath() {
		this.driver = getDriver();
		return firstParthOfXpath;
	}

	public String getSecondParthOfXpath() {
		this.driver = getDriver();
		return secondParthOfXpath;
	}
}
