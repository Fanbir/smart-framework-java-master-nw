package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by student on 9/3/2015.
 */
public class HomePage extends BasePage {
	
    private static final By SEARCH_FIELD = By.cssSelector("[data-qa=\"vacancy-serp__query\"]");
    private static final By SEARCH_BUTTON = By.cssSelector("[data-qa=\"navi-search__button\"]");
    private static final By SECTION_JOB_BUTTON = By.cssSelector("[href*=\"https://jobs.tut.by/#ua:top_menu_www.tut.by~12\"]");

    public static void search(String searchStr) {
        driver.findElement(SECTION_JOB_BUTTON).click();
        driver.findElement(SEARCH_FIELD).sendKeys(searchStr);
        driver.findElement(SEARCH_BUTTON).click();
    }
}
