package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by student on 9/8/2015.
 */
public class SearchPage extends BasePage {

    private static final By RESULTS_LIST = By.className("b-results-list");
    private static final By RESULT = By.cssSelector(".vacancy-serp-item__title");

    public static boolean checkLinkText(String linkText) {
        List<WebElement> linksList = driver.findElements(RESULT);
        for (WebElement webElement : linksList) {
            if (webElement.getText().equals(linkText)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLinkUrl(WebDriver driver, String linkUrl) {
        List<WebElement> linksList = driver.findElement(RESULTS_LIST).findElements(RESULT);
        //boolean linkExists = false;

        for (WebElement webElement : linksList) {
            if (webElement.getAttribute("href").equals(linkUrl)) {
                return true;
            }
        }
        return false;
    }
}
