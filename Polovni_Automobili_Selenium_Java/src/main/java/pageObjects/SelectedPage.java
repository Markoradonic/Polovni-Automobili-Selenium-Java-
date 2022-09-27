package pageObjects;

import org.openqa.selenium.WebDriver;

public class SelectedPage {

	public WebDriver driver;

	public String firstParthOfXpath = "//div[@id='search-results']/div[@class='js-hide-on-filter']/article[";
	public String secondParthOfXpath = "]/div[@class='image']";

	public SelectedPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getFirstParthOfXpath() {
		return firstParthOfXpath;
	}

	public String getSecondParthOfXpath() {
		return secondParthOfXpath;
	}
}
