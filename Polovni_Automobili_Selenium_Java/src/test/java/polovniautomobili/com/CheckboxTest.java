package polovniautomobili.com;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import base.Hooks;
import pageObjects.CarsPage;
import pageObjects.DetailedCarsSearchPage;

public class CheckboxTest extends Hooks {

	public CheckboxTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void selectCheckbox() throws IOException {
		CarsPage selectCar = new CarsPage();
		DetailedCarsSearchPage selectCheckboxButton = new DetailedCarsSearchPage();

		Select dropdownCarSelect = new Select(selectCar.getBrandCars());
		dropdownCarSelect.selectByValue("nissan");

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", selectCar.getButtonDetailedSearch());
		selectCar.getButtonDetailedSearch().click();

		js.executeScript("arguments[0].scrollIntoView();", selectCheckboxButton.getInputAbs());
		selectCheckboxButton.getInputAbs().click();
		js.executeScript("arguments[0].scrollIntoView();", selectCheckboxButton.getInputAirbag());
		selectCheckboxButton.getInputAirbag().click();
		js.executeScript("arguments[0].scrollIntoView();", selectCheckboxButton.getInputAsr());
		selectCheckboxButton.getInputAsr().click();
		js.executeScript("arguments[0].scrollIntoView();", selectCheckboxButton.getInputEsp());
		selectCheckboxButton.getInputEsp().click();
		js.executeScript("arguments[0].scrollIntoView();", selectCheckboxButton.getInputDeadAngleSensor());
		selectCheckboxButton.getInputDeadAngleSensor().click();
		js.executeScript("arguments[0].scrollIntoView();", selectCar.getButtonSubmit());
		selectCar.getButtonSubmit().click();

		/* delete checkbox */
		// delete abs
		WebElement abs = getDriver().findElement(
				By.cssSelector("span[data-field='abs'] i[class='uk-icon-close cursor-pointer remove-criteria']"));
		js.executeScript("arguments[0].scrollIntoView();", abs);
		abs.click();
		// delete codeKey
		WebElement esp = getDriver().findElement(
				By.cssSelector("span[data-field='esp'] i[class='uk-icon-close cursor-pointer remove-criteria']"));
		js.executeScript("arguments[0].scrollIntoView();", esp);
		esp.click();
//		 delete DeadAngleSensor
		WebElement DeadAngleSensor = getDriver().findElement(By.cssSelector(
				"span[data-field='dead_angle_sensor'] i[class='uk-icon-close cursor-pointer remove-criteria']"));
		js.executeScript("arguments[0].scrollIntoView();", DeadAngleSensor);
		DeadAngleSensor.click();

	}

}
