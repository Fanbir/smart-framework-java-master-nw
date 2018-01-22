package pages;

import org.openqa.selenium.WebDriver;

import webdriver.Browser;

public class BasePage {

	public static WebDriver driver = Browser.getInstance().getDriver();
	
}
